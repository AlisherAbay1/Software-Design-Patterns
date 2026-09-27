package file_system.elements.concrete_elements;

import java.util.List;

import file_system.elements.FileSystemElement;
import file_system.visitors.FileSystemVisitor;

public class Directory implements FileSystemElement {
    private String directoryName;
    private List<File> files;

    public Directory(String directoryName, List<File> files) {
        this.directoryName = directoryName;
        this.files = files;
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void accept(FileSystemVisitor visitor) {
        visitor.visitDirectory(this);
    }
}
