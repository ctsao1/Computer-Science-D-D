import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class DirectedGraphsTester {
    public static void main(String[] args) throws IOException {
        List<String> strList = DirectedGraphs.readAllLines(Paths.get("Who Have You Borrowed A Line Of Code From.txt"));
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
