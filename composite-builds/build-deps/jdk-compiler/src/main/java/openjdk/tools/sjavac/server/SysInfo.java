/*
 * Stub class for SysInfo - mod by piash
 * This is a minimal implementation to fix build errors
 */
package openjdk.tools.sjavac.server;

public class SysInfo {
    public final int numCores;
    public final long maxMemory;
    
    public SysInfo(int numCores, long maxMemory) {
        this.numCores = numCores;
        this.maxMemory = maxMemory;
    }
}
