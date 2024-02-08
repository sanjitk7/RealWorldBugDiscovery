package org.yamcs.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.yamcs.ConfigurationException;
import org.yamcs.InvalidIdentification;
import org.yamcs.ProcessorException;
import org.yamcs.ProcessorFactory;
import org.yamcs.RefMdbPacketGenerator;
import org.yamcs.YConfiguration;
import org.yamcs.YProcessor;
import org.yamcs.api.EventProducerFactory;
import org.yamcs.management.ManagementService;
import org.yamcs.parameter.ParameterConsumer;
import org.yamcs.parameter.ParameterProvider;
import org.yamcs.parameter.ParameterRequestManagerImpl;
import org.yamcs.parameter.ParameterValue;
import org.yamcs.tctm.SimpleTcTmService;
import org.yamcs.utils.ValueUtility;
import org.yamcs.xtce.Algorithm;
import org.yamcs.xtce.InputParameter;
import org.yamcs.xtce.Parameter;
import org.yamcs.xtce.XtceDb;
import org.yamcs.xtceproc.XtceDbFactory;

/**
 * Just a small sanity check to verify python/jython still works.
 * Uses algorithms in the spreadsheet that are interpreted the same in javascript and python
 */
public class AlgorithmManagerJavaTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        YConfiguration.setup(instance);
        ManagementService.setup(false);
        XtceDbFactory.reset();
    }
    static String instance = "refmdb";
    private XtceDb db;
    private YProcessor c;
    private RefMdbPacketGenerator tmGenerator;
    private ParameterRequestManagerImpl prm;

    @Before
    public void beforeEachTest() throws ConfigurationException, ProcessorException {
        EventProducerFactory.setMockup(true);

        db=XtceDbFactory.getInstance(instance);
        assertNotNull(db.getParameter("/REFMDB/SUBSYS1/FloatPara1_1_2"));

        tmGenerator=new RefMdbPacketGenerator();
        List<ParameterProvider> paramProviderList = new ArrayList<ParameterProvider>();

        Map<String, Object> jslib = new HashMap<String, Object>();
        Map<String, Object> config = new HashMap<String, Object>();
        jslib.put("python", Arrays.asList("mdb/algolib.py"));
        jslib.put("JavaScript", Arrays.asList("mdb/algolib.js"));

        config.put("libraries", jslib);
        AlgorithmManager am = new AlgorithmManager(instance, config);
        paramProviderList.add(am);


        SimpleTcTmService tmtcs = new SimpleTcTmService(tmGenerator, paramProviderList, null);
        c=ProcessorFactory.create(instance, "AlgorithmManagerJavaTest", "refmdb", tmtcs, "junit");
        prm=c.getParameterRequestManager();
    }


    @After
    public void afterEachTest() { // Prevents us from wrapping our code in try-finally
        c.quit();
    }

    @Test
    public void testJavaAlgo1() throws InvalidIdentification {
        final ArrayList<ParameterValue> params=new ArrayList<ParameterValue>();
        Parameter p = prm.getParameter("/REFMDB/SUBSYS1/AlgoJavaFloat1");
        prm.addRequest(p, new ParameterConsumer() {
            @Override
            public void updateItems(int subscriptionId, List<ParameterValue> items) {
        	params.addAll(items);
            }
        });

        c.start();
        tmGenerator.generate_PKT1_1();
        assertEquals(1, params.size());
        assertEquals(0.1672918, params.get(0).getEngValue().getDoubleValue(), 0.001);
    }

    @Test
    public void testJavaAlgo2() throws InvalidIdentification {
        final ArrayList<ParameterValue> params=new ArrayList<ParameterValue>();
        Parameter p = prm.getParameter("/REFMDB/SUBSYS1/AlgoJavaFloat2");
        prm.addRequest(p, new ParameterConsumer() {
            @Override
            public void updateItems(int subscriptionId, List<ParameterValue> items) {
                params.addAll(items);
            }
        });

        c.start();
        tmGenerator.generate_PKT1_1();
        assertEquals(1, params.size());
        assertEquals(3.3672918, params.get(0).getEngValue().getDoubleValue(), 0.001);
    }

    @Test
    public void testJavaAlgo3() throws InvalidIdentification {
        final ArrayList<ParameterValue> params=new ArrayList<ParameterValue>();
        Parameter p = prm.getParameter("/REFMDB/SUBSYS1/AlgoJavaFloat3");
        prm.addRequest(p, new ParameterConsumer() {
            @Override
            public void updateItems(int subscriptionId, List<ParameterValue> items) {
                params.addAll(items);
            }
        });

        c.start();
        tmGenerator.generate_PKT1_1();
        assertEquals(1, params.size());
        assertEquals(8.2672918, params.get(0).getEngValue().getDoubleValue(), 0.001);
    }
 
    public static class MyAlgo1 extends AbstractAlgorithmExecutor {
        float v;
        public MyAlgo1(Algorithm algorithmDef, AlgorithmExecutionContext execCtx) {
            super(algorithmDef, execCtx);
        }

        @Override
        public List<ParameterValue> runAlgorithm(long acqTime, long genTime) {
            Parameter p = algorithmDef.getOutputSet().get(0).getParameter();
            ParameterValue pv = new ParameterValue(p);
           
            pv.setEngineeringValue(ValueUtility.getDoubleValue(v));
            return Arrays.asList(pv);
        }

        @Override
        protected void updateInput(InputParameter inputParameter, ParameterValue newValue) {
            v = newValue.getEngValue().getFloatValue();
        }
    }
    
    public static class MyAlgo2 extends AbstractAlgorithmExecutor {
        double x;
        float v;
        public MyAlgo2(Algorithm algorithmDef, AlgorithmExecutionContext execCtx, Double x) {
            super(algorithmDef, execCtx);
            this.x = x;
        }

        @Override
        public List<ParameterValue> runAlgorithm(long acqTime, long genTime) {
            Parameter p = algorithmDef.getOutputSet().get(0).getParameter();
            ParameterValue pv = new ParameterValue(p);
           
            pv.setEngineeringValue(ValueUtility.getDoubleValue(x+v));
            return Arrays.asList(pv);
        }

        @Override
        protected void updateInput(InputParameter inputParameter, ParameterValue newValue) {
            v = newValue.getEngValue().getFloatValue();
        }
    }
    
    public static class MyAlgo3 extends AbstractAlgorithmExecutor {
        int a;
        double b;
        String c;
        float v;
        public MyAlgo3(Algorithm algorithmDef, AlgorithmExecutionContext execCtx, Map<String, Object> m) {
            super(algorithmDef, execCtx);
            this.a = (Integer) m.get("a");
            this.b = (Double) m.get("b");
            this.c = (String) m.get("c");
        }

        @Override
        public List<ParameterValue> runAlgorithm(long acqTime, long genTime) {
            Parameter p = algorithmDef.getOutputSet().get(0).getParameter();
            ParameterValue pv = new ParameterValue(p);
           
            pv.setEngineeringValue(ValueUtility.getDoubleValue(a+b+c.length()+v));
            return Arrays.asList(pv);
        }

        @Override
        protected void updateInput(InputParameter inputParameter, ParameterValue newValue) {
            v = newValue.getEngValue().getFloatValue();
        }
    }
}
