/*
 * Stub class for CompilationSubResult - mod by piash
 * This is a minimal implementation to fix build errors
 */
package openjdk.tools.sjavac.server;

import java.util.Map;
import java.util.Set;
import java.net.URI;

public class CompilationSubResult {
    public enum Result {
        OK, ERROR, CMDFATAL, SYSERR
    }
    
    public Result result;
    public String stdout;
    public String stderr;
    
    // Additional fields used by CompilationService
    public Map<String, Set<URI>> packageArtifacts;
    public Map<String, Set<String>> packageDependencies;
    public Map<String, Set<String>> packageCpDependencies;
    public Map<String, String> packagePubapis;
    public Map<String, String> dependencyPubapis;
    
    public CompilationSubResult(Result result) {
        this(result, "", "");
    }
    
    public CompilationSubResult(Result result, String stdout, String stderr) {
        this.result = result;
        this.stdout = stdout;
        this.stderr = stderr;
    }
}
