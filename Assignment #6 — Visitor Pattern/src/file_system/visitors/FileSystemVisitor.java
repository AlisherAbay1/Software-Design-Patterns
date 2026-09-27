package file_system.visitors;

import file_system.elements.concrete_elements.*;

public interface FileSystemVisitor {
    public void visitFile(File file);
    public void visitDirectory(Directory directory);
}
