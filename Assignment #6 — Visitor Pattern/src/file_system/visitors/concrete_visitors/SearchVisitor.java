package file_system.visitors.concrete_visitors;

import java.util.List;
import file_system.elements.concrete_elements.*;
import file_system.visitors.FileSystemVisitor;;

public class SearchVisitor implements FileSystemVisitor {
    private String pattern;
    private List<File> files;

    @Override 
    public void visitFile(File file) {
        if (file.getFileName().concat(file.getFileType()).contains(pattern)) {
            files.add(file);
        }
    }

    @Override 
    public void visitDirectory(Directory directory) {
        for (File file: directory.getFiles()) {
            visitFile(file);
        }
    }

    public List<File> getFiles() {
        return files;
    }
}
