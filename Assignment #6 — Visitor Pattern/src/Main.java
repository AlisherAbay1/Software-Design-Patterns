import file_system.elements.FileSystemElement;
import file_system.elements.concrete_elements.Directory;
import file_system.elements.concrete_elements.File;
import file_system.visitors.concrete_visitors.SearchVisitor;
import file_system.visitors.concrete_visitors.SizeCalculatorVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File readme = new File("readme", "txt", "/root/readme.txt", createBytes(120));
        File photo  = new File("photo", "png", "/root/images/photo.png", createBytes(5000));
        File config = new File("config", "json", "/root/config.json", createBytes(45));
        File notes  = new File("notes", "txt", "/root/docs/notes.txt", createBytes(300));
        File report = new File("report", "pdf", "/root/docs/report.pdf", createBytes(8200));

        List<FileSystemElement> imagesChildren = new ArrayList<>();
        imagesChildren.add(photo);
        Directory images = new Directory("images", imagesChildren);

        List<FileSystemElement> docsChildren = new ArrayList<>();
        docsChildren.add(notes);
        docsChildren.add(report);
        Directory docs = new Directory("docs", docsChildren);

        List<FileSystemElement> rootChildren = new ArrayList<>();
        rootChildren.add(readme);
        rootChildren.add(config);
        rootChildren.add(images);
        rootChildren.add(docs);
        Directory root = new Directory("root", rootChildren);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total file system size: " + sizeVisitor.getSize() + " bytes");

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);

        System.out.println("\nFiles found matching the pattern \".txt\":");
        for (File file : searchVisitor.getFiles()) {
            System.out.println(" - " + file.getFileName() + "." + file.getFileType() + " (" + file.getPath() + ")");
        }
    }

    private static List<Byte> createBytes(int count) {
        List<Byte> bytes = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            bytes.add((byte) 0);
        }
        return bytes;
    }
}