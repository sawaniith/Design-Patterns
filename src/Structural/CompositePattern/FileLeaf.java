package Structural.CompositePattern;

public class FileLeaf implements FileSystemComponent{
    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "📄 File: " + name);
    }
}
