package file_system.visitors.concrete_visitors;

import java.util.ArrayList;
import java.util.List;

import file_system.elements.FileSystemElement;
import file_system.elements.concrete_elements.*;
import file_system.visitors.FileSystemVisitor;

public class SearchVisitor implements FileSystemVisitor {
    private String pattern;
    private List<File> files = new ArrayList<>();

    public SearchVisitor(String pattern) {
        this.pattern = pattern;
    }

    @Override 
    public void visitFile(File file) {
        if (file.getFileName().concat(".").concat(file.getFileType()).contains(pattern)) {
            files.add(file);
        }
    }

    @Override 
    public void visitDirectory(Directory directory) {
        for (FileSystemElement child: directory.getChildren()) {
            child.accept(this);
        }
    }

    public List<File> getFiles() {
        return files;
    }
}
