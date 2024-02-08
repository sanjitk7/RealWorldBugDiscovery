package org.yamcs.tctm;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yamcs.ConfigurationException;
import org.yamcs.YConfiguration;
import org.yamcs.protobuf.Pvalue.ParameterData;

import com.google.common.util.concurrent.AbstractExecutionThreadService;


/**
 * Receives PP data via UDP. 
 * 
 * The UDP packets are protobuf encoded ParameterData.
 * We don't use any checksum, assume it's done by UDP.
 * 
 * @author nm
 *
 */
public class UdpParameterDataLink extends AbstractExecutionThreadService implements ParameterDataLink {
    private volatile int validDatagramCount = 0;
    private volatile int invalidDatagramCount = 0;
    private volatile boolean disabled=false;

    private DatagramSocket udpSocket;
    private String group="239.192.0.1";
    private int port=31002;

    ParameterSink ppListener;

    private Logger log=LoggerFactory.getLogger(this.getClass().getName());
    int MAX_LENGTH=10*1024;

    DatagramPacket datagram = new DatagramPacket(new byte[MAX_LENGTH], MAX_LENGTH);

    /**
     * Creates a new UDP data link
     * @param instance 
     * @param name 
     * @param config 
     * @param spec
     * @throws ConfigurationException if port is not defined in the config 
     */
    public UdpParameterDataLink(String instance, String name, Map<String, Object> config) throws ConfigurationException  {
        port = YConfiguration.getInt(config, "port");
    }

    @Override
    public void startUp() throws IOException {
        udpSocket = new DatagramSocket(port);
    }


    @Override
    public void run() {
        while(isRunning()) {
            ParameterData pd = getNextData();
            if(pd!=null) {
                ppListener.updateParams(pd.getGenerationTime(),  pd.getGroup(), pd.getSeqNum(), pd.getParameterList());
            }
        }
    }
    /**
     * 
     * Called to retrieve the next packet.
     * It blocks in readinng on the UDP socket  
     * @return anything that looks as a valid packet, just the size is taken into account to decide if it's valid or not
     */
    public ParameterData getNextData() {
     
        while(isRunning() && disabled) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return null;
            }
        }

        try {
            udpSocket.receive(datagram);
            ParameterData.Builder pdb = ParameterData.newBuilder().mergeFrom(datagram.getData(), datagram.getOffset(), datagram.getLength());
            validDatagramCount++;
            return pdb.build();
        } catch (IOException e) {
            log.warn("exception when receiving parameter data: {}'", e.getMessage());
            invalidDatagramCount++;
        }
        
        return null;
    }

    @Override
    public String getLinkStatus() {
        return disabled?"DISABLED":"OK";
    }

    /**
     * returns statistics with the number of datagram received and the number of invalid datagrams
     */
    @Override
    public String getDetailedStatus() {
        if(disabled) {
            return "DISABLED";
        } else {
            return String.format("OK (%s:%d)\nValid datagrams received: %d\nInvalid datagrams received: %d",
                    group, port, validDatagramCount, invalidDatagramCount);
        }
    }

    /**
     * Sets the disabled to true such that getNextPacket ignores the received datagrams
     */
    @Override
    public void disable() {
        disabled=true;
    }

    /**
     * Sets the disabled to false such that getNextPacket does not ignore the received datagrams
     */
    @Override
    public void enable() {
        disabled=false;
    }

    @Override
    public boolean isDisabled() {
        return disabled;
    }


    @Override
    public long getDataCount() {
        return validDatagramCount;
    }

    @Override
    public void setParameterSink(ParameterSink ppListener) {
        this.ppListener = ppListener;
    }
}
