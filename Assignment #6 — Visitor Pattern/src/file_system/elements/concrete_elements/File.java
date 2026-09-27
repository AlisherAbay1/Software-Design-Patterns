package file_system.elements.concrete_elements;

import java.util.List;

public class File {
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
}
