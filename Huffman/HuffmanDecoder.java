import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class HuffmanDecoder {

    private HashMap<String, Character> map;
    
    public HuffmanDecoder(String codeFile) {
        makeMap(codeFile);
    }

    public void makeMap(String codeFile) {
        map = new HashMap<>();
        int count = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader(codeFile))) {
            while (reader.ready()) {
                String str = reader.readLine();
                map.put(str, (char) count);
                count++;
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }

    public boolean isCode(String binary) {
        return map.containsKey(binary);
    }

    public char decodeChar(String binary) {
        return map.get(binary);
    }

    public boolean isEOF(String binary) {
        if (map.get(binary) == null) {
            return false;
        }
        return map.get(binary).equals((char) 26);
    }

    public void decodeFileFromHuffmanCodes(String encodedFile, String decodedFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(encodedFile));
            PrintWriter pw = new PrintWriter(decodedFile);
            StringBuilder str = new StringBuilder();
            while (reader.ready()) {
                Character c = (char) reader.read();
                str.append(c);
                if (isCode(str.toString())) {
                    if (isEOF(str.toString())) {
                        break;
                    }
                    pw.print(decodeChar(str.toString()));
                    str = new StringBuilder();
                }
            }
            reader.close();
            pw.close();
        } catch (Exception e) {
            System.err.println("Something went wrong bozo: " + e.getMessage());
        }
    }

    public void decodeFile(String encodedFile) {
        if (!encodedFile.substring(encodedFile.length() - 4).equals(".huf")) {
            throw new IllegalArgumentException("Not a huf file");
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(encodedFile));
            PrintWriter pw = new PrintWriter(encodedFile.substring(0, encodedFile.length() - 3));
            StringBuilder str = new StringBuilder();
            while (reader.ready()) {
                Character c = (char) reader.read();
                String binary = Integer.toBinaryString((int) c);
                if (binary.length() < 8) {
                    binary = "0" + binary;
                }
                for (int i = 0; i < binary.length(); i++) {
                    str.append(binary.charAt(i));
                    if (isCode(str.toString())) {
                        if (isEOF(str.toString())) {
                            break;
                        }
                        pw.print(decodeChar(str.toString()));
                        str = new StringBuilder();
                    }
                }
            }
            reader.close();
            pw.close();
        } catch (Exception e) {
            System.err.println("Something went wrong bozo in decode: " + e.getMessage());
        }
    }

}
