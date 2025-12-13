import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Small manual tester for the solution file-system implementation.
 *
 * This does NOT use JUnit. It just runs a few operations and prints out
 * what it's doing plus the observed behavior.or
 *
 * And also assumes (based on our design):
 *  - FileSystemTree#getRoot() returns a non-null FolderNode
 *  - FolderNode has addFolder(String) and addFile(String, int) that return boolean
 *  - FileSystemNode has getDepth(), getHeight(), getSize(), getTotalNodeCount()
 *  - Navigator has processUserInputString(String) which prints results to System.out
 */
public class FileSystemTester {

    public static void main(String[] args) {

        // 1. Construct a tree and check root
        FileSystemTree tree = new FileSystemTree();
        FolderNode root = tree.getRoot();
        FileSystemTree tree2 = new FileSystemTree();

        // 2. Build a small structure under root
        System.out.println("\n=== Building tree structure under root ===");
        boolean addedDocs = root.addFolder("docs");
        System.out.println(addedDocs);
        boolean addedSrc = root.addFolder("src");
        System.out.println(addedSrc);
        boolean addedMainJava = root.addFile("main.java", 120);
        System.out.println(addedMainJava);
        boolean addedReadme = root.addFile("README.md", 80);
        System.out.println(addedReadme);
        FolderNode src = (FolderNode) root.getChildByName("src");
        FolderNode docs = (FolderNode) root.getChildByName("docs");
        src.addFile("Balls", 100);
        docs.addFolder("projects");

        tree2.getRoot().addFile("Ballz", 10);
        FileSystemNode ballz = tree2.getRoot().getChildren().get(0);
        System.out.println(ballz.getDepth());
        System.out.println();

        System.out.println();

        Navigator nav = new Navigator(tree);
        // Navigator nav2 = new Navigator(tree2);
        nav.run();
    }
}