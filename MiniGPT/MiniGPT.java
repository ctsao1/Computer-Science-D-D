import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;

public class MiniGPT {

	private HashMap<String, ArrayList<Character>> map; 

	public MiniGPT(String fileName, int chainOrder) {
		map = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charAsInt;
            // Read until the end of the stream (-1 is returned)
			StringBuilder str = new StringBuilder();
            while ((charAsInt = reader.read()) != -1) {
                // Cast the integer value to a character
                Character character = (char) charAsInt;
				str.append(character);
				if (str.length() == chainOrder) {
					if (map.containsKey(str.toString())) {
						map.get(str.toString()).add(character);
					} else {
						ArrayList<Character> list = new ArrayList<>();
						list.add(character);
						map.put(str.toString(), list);
					}
					str.deleteCharAt(0);
				}
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
	}
	
	public void generateText(String outputFileName, int numChars) {
		try (BufferedWriter reader = new BufferedWriter(new FileWriter(outputFileName))) {
			String start = map.keySet().toArray()[(int) (Math.random() * map.keySet().toArray().length)].toString();
            for (int i = 0; i < numChars; i++) {
				StringBuilder key = new StringBuilder();
				key.append(start);
				Character c = map.get(key.toString()).get((int) (Math.random() * (map.get(key.toString()).size() - 1)));
				reader.write(start);
				reader.write(c);
				key.deleteCharAt(0);
				key.append(c);
				start = key.toString();
			}
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
	}
}
