package org.mp4parser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.logging.Logger;

/**
 * The classic version object.
 */
public class Version {
    public static final String VERSION;
    private static final Logger LOG = Logger.getLogger(Version.class.getName());

    static {
        LineNumberReader lnr = new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version.txt")));
        String version;
        try {
            version = lnr.readLine();
        } catch (IOException e) {
            LOG.warning(e.getMessage());
            version = "unknown";
        }
        VERSION = version;

    }
}
