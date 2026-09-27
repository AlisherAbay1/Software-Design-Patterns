package file_system.visitors.concrete_visitors;

import file_system.visitors.*;
import file_system.elements.FileSystemElement;
import file_system.elements.concrete_elements.*;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private long size = 0;

    @Override 
    public void visitFile(File file) {
        this.size += file.getBytes().size();
    }

    @Override 
    public void visitDirectory(Directory directory) {
        for (FileSystemElement child: directory.getChildren()) {
            child.accept(this);
        }
    }

    public long getSize() {
        return size;
    }
}
