package file_system.elements;

import file_system.visitors.FileSystemVisitor;

public interface FileSystemElement {
    public void accept(FileSystemVisitor visitor);
}
