import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HuffmanEncoder {
    
    private HashMap<Character, String> map;

    public HuffmanEncoder(String codeFile) {
        makeMap(codeFile);
    }

    public void makeMap(String codeFile) {
        map = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(codeFile))) {
            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");
                Character c = str[0].charAt(0);
                map.put(c, str[1]);
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }

    public String encodeChar(char input) {
        if (map.containsKey(input)) {
            return "" + map.get(input);
        }
        return "";
    }

    public void encodeFileToHuffmanCodes(String fileToCompress, String encodedFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileToCompress));
            PrintWriter pw = new PrintWriter(encodedFile);
            int count = 0;
            while (reader.ready()) {
                count++;
                Character c = (char) reader.read();
                pw.print(map.get(c));
            }
            pw.print(map.get((char) 26));
            for (int i = 0; i < count % 8; i++) {
                pw.print(0);
            }
            reader.close();
            pw.close();
        } catch (Exception e) {
            System.err.println("Something went wrong bozo: " + e.getMessage());
        }
    }

}
