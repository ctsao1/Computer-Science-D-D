import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class MiniGPT {

	private HashMap<String, ArrayList<Character>> map; 

	public MiniGPT(String fileName, int chainOrder) {
		map = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            int charAsInt;
            // Read until the end of the stream (-1 is returned)
			StringBuilder str = new StringBuilder();
            while ((charAsInt = reader.read()) != -1) {
                // Cast the integer value to a character
                Character character = (char) charAsInt;
				if (str.toString().length() < chainOrder) {
					str.append(character);
				} else {
					if (map.containsKey(str.toString())) {
						map.get(str.toString()).add(character);
					} else {
						ArrayList<Character> list = new ArrayList<>();
						list.add(character);
						map.put(str.toString(), list);
					}
				}
				str.deleteCharAt(0);
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
        return map;
	}

	
	public void generateText(String outputFileName, int numChars) {
		
	}
}
