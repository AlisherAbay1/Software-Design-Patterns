package file_system.elements.concrete_elements;

import java.util.List;
import file_system.elements.FileSystemElement;
import file_system.visitors.FileSystemVisitor;

public class Directory implements FileSystemElement {
    private String directoryName;
    private List<FileSystemElement> children;

    public Directory(String directoryName, List<FileSystemElement> children) {
        this.directoryName = directoryName;
        this.children = children;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
    }
}
