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

        // 2. Build a small structure under root
        System.out.println("\n=== Building tree structure under root ===");
        root.addFolder("docs");
        FolderNode docs = (FolderNode) root.getChildByName("docs");
        docs.addFile("readme.txt", 10);
        docs.addFolder("projects");
        FolderNode projects = (FolderNode) docs.getChildByName("projects");
        projects.addFile("a.java", 10);
        root.addFile("bin", 10);
        root.addFile("notes.txt", 10);

        Navigator nav = new Navigator(tree);
        // Navigator nav2 = new Navigator(tree2);
        nav.run();
    }
}