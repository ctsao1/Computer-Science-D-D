import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class RLECompressionTester {
    public static void main(String[] args) {
        try {
            // RLECompression.compress("test.txt");
            RLECompression.decompress("test.txt.bw.rle");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
