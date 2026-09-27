package file_system.elements.concrete_elements;

import file_system.elements.FileSystemElement;
import file_system.visitors.FileSystemVisitor;
import java.util.List;

public class File implements FileSystemElement {
    private String fileName;
    private String fileType;
    private String path;
    private List<Byte> bytes;

    public File(String fileName, String fileType, String path, List<Byte> bytes) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.path = path;
        this.bytes = bytes;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getPath() {
        return path;
    }

    public List<Byte> getBytes() {
        return bytes;
    }

    public void accept(FileSystemVisitor visitor) {
        visitor.visitFile(this);
    }
}
