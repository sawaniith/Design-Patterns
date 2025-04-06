package Structural.CompositePattern;

public class CompositeMain {
    public static void main(String[] args) {
        //object inside object ==> tree like structure (ex: organization hierarchy)
        //The Composite Pattern lets you treat individual objects and groups of objects uniformly.
        //It helps build tree structures where both leaves (objects) and composites (groups) share the same interface.

        // file is leaf and folder is composites
        FileSystemComponent file1 = new FileLeaf("resume.pdf");
        FileSystemComponent file2 = new FileLeaf("project.docx");
        FileSystemComponent file3 = new FileLeaf("budget.xlsx");

        FolderComposite devFolder = new FolderComposite("Dev");
        devFolder.add(file1);
        devFolder.add(file2);

        FolderComposite financeFolder = new FolderComposite("Finance");
        financeFolder.add(file3);

        FileSystemComponent file4 = new FileLeaf("form16.pdf");

        FolderComposite rootFolder = new FolderComposite("Root");
        rootFolder.add(file4);
        rootFolder.add(devFolder);
        rootFolder.add(financeFolder);

        rootFolder.showDetails("");

        //another example can take is evaluate arithmetic expressions
        //number will be leaves and expression ( + , - , * , / ) will be composites
    }
}
