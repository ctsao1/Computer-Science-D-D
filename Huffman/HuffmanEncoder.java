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
        int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(codeFile))) {
            while (reader.ready()) {
                String str = reader.readLine();
                if (!str.equals("")) {
                    map.put((char) count, str);
                }
                count++;
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
                Character c = (char) reader.read();
                if (map.get(c) != null) {
                    pw.print(map.get(c));
                    count = count + map.get(c).length();
                }
            }
            pw.print(map.get((char) 26));
            count = count + map.get((char) 26).length();
            for (int i = 0; i < 8 - (count % 8); i++) {
                pw.print(0);
            }
            reader.close();
            pw.close();
        } catch (Exception e) {
            System.err.println("Something went wrong bozo: " + e.getMessage());
        }
    }

}
