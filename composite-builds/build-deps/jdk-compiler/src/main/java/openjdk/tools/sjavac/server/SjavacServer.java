/*
 * Stub class for SjavacServer - mod by piash
 * This is a minimal implementation to fix build errors
 */
package openjdk.tools.sjavac.server;

import java.io.File;

public class SjavacServer {
    public static final String LINE_TYPE_RC = "RC";
    
    public static File getPortFile(String filename) {
        return new File(filename);
    }
}
