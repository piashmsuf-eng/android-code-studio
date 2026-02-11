/*
 * Stub interface for Sjavac - mod by piash
 * This is a minimal implementation to fix build errors
 */
package openjdk.tools.sjavac.server;

public interface Sjavac {
    SysInfo getSysInfo();
    CompilationSubResult compile(String protocolId, String invocationId, String[] args);
}
