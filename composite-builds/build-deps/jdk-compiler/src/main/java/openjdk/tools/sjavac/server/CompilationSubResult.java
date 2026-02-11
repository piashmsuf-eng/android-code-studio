/*
 * Stub class for CompilationSubResult - mod by piash
 * This is a minimal implementation to fix build errors
 */
package openjdk.tools.sjavac.server;

public class CompilationSubResult {
    public enum Result {
        OK, ERROR, CMDFATAL, SYSERR
    }
    
    public final Result result;
    public final String stdout;
    public final String stderr;
    
    public CompilationSubResult(Result result) {
        this(result, "", "");
    }
    
    public CompilationSubResult(Result result, String stdout, String stderr) {
        this.result = result;
        this.stdout = stdout;
        this.stderr = stderr;
    }
}
