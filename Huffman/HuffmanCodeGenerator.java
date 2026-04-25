import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.PriorityQueue;


public class HuffmanCodeGenerator {

    private HashMap<Character, Integer> map;
    private PriorityQueue<Node> heap;
    private BST tree;
    private HashMap<Character, String> dictionary;

    public HuffmanCodeGenerator(String frequencyFile) {
        map = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(frequencyFile))) {
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
        map.put((char) 26, 1);
    }

    public void makeCodeFile(String codeFile) {

    }

    public void makeHeap() {
        for (int i = 0; i < map.values().toArray().length; i++) {
            Node n = new Node((char) map.keySet().toArray()[i]);
            n.setFrequency((int) map.values().toArray()[i]);
            heap.add(n);
        }
    }

    public void makeTree() {
        while (!heap.isEmpty()) {
            heap.add(tree.add(heap.poll(), heap.poll()));
            if (heap.size() == 1) {
                tree.setRoot(heap.poll());
            }
        }
    }

    public void makeDictionary() {
        addToDictionary(tree.getRoot(), "");
    }

    public void addToDictionary(Node n, String binary) {
        StringBuilder str = new StringBuilder();
        str.append(binary);
        if (n.hasLeft()) {
            str.append("0");
            addToDictionary(n.getLeft(), str.toString());
        }
        if (n.hasRight()) {
            str.append("1");
            addToDictionary(n.getRight(), str.toString());
        }
        dictionary.put(n.getValue(), str.toString());
    }

    public int getFrequency(char c) {
        if (!map.containsKey(c)) {
            return 0;
        }
        return map.get(c);
    }

}
