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
import java.util.TreeMap;
import java.util.PriorityQueue;

public class Huffman{

    private HashMap<Character, Integer> map;
    private PriorityQueue<Node<Character>> heap;
    private ArrayList<String> dictionary;

    public Huffman(String fileName) {
        map = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                Character c = (char) reader.read();
                if (map.containsKey(c)) {
                    map.replace(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
        for (int i = 0; i < map.values().toArray().length; i++) {
            Node<Character> n = new Node<Character>((char) map.keySet().toArray()[i]);
            n.setFrequency((int) map.values().toArray()[i]);
            heap.add(n);
        }

    }

    public String dictionary() {
        return "";
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < map.size(); i++) {
            str.append("Character: " + map.keySet().toArray()[i] + " | Frequency: " + map.values().toArray()[i] + "\n");
        }
        return str.toString();
    }
}
