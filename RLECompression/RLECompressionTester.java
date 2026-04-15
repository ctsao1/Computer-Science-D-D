import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class RLECompressionTester {
    public static void main(String[] args) {
        try {
            // RLECompression.encode("test.txt");
            // RLECompression.decode("test.txt.rle");
            RLECompression.bwTransform("test.txt");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
