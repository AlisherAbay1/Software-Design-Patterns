package file_system.elements.concrete_elements;

import java.util.List;

public class Directory {
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
}
