/*
 * Stub class for PortFile - mod by piash
 * This is a minimal implementation to fix build errors
 */
package openjdk.tools.sjavac.server;

import java.io.File;
import java.io.IOException;

public class PortFile {
    private final File file;
    
    public PortFile(File file) {
        this.file = file;
    }
    
    public boolean exists() {
        return file.exists();
    }
    
    public void delete() throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Could not delete port file: " + file);
        }
    }
}
