import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.io.PrintWriter;

public class HuffmanCodeGenerator {

    private HashMap<Character, Integer> map;
    private PriorityQueue<Node> heap;
    private BST tree;
    private HashMap<Character, String> dictionary;
    private String[] dictionary2 = new String[128];

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
        makeHeap();
        makeTree();
        makeDictionary();
        moveToArray();
    }

    public void makeCodeFile(String codeFile) {
        try {
            PrintWriter pw = new PrintWriter(codeFile);
            for (int i = 0; i < dictionary2.length; i++) {
                pw.append(dictionary2[i]);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("Something went wrong bozo: " + e.getMessage());
        }
    }

    public void makeHeap() {
        heap = new PriorityQueue<Node>();
        for (int i = 0; i < map.values().toArray().length; i++) {
            Node n = new Node((char) map.keySet().toArray()[i]);
            n.setFrequency((int) map.values().toArray()[i]);
            heap.add(n);
        }
    }

    public void makeTree() {
        tree = new BST();
        while (!heap.isEmpty()) {
            heap.add(tree.add(heap.poll(), heap.poll()));
            if (heap.size() == 1) {
                tree.setRoot(heap.poll());
            }
        }
    }

    public void makeDictionary() {
        dictionary = new HashMap<Character, String>();
        addToDictionary(tree.getRoot(), "");
    }

    public void addToDictionary(Node n, String binary) {
        StringBuilder str = new StringBuilder();
        str.append(binary);
        boolean hadLeft = false;
        if (n.hasLeft()) {
            str.append("0");
            addToDictionary(n.getLeft(), str.toString());
            hadLeft = true;
        }
        if (n.hasRight()) {
            if (hadLeft) {
                str = str.deleteCharAt(str.length() - 1);
            }
            str.append("1");
            addToDictionary(n.getRight(), str.toString());
        }
        dictionary.put(n.getValue(), str.toString());
    }

    public void moveToArray() {
        for (int i = 1; i < dictionary2.length; i++) {
            dictionary2[i] = "" + ((char) i);
            if (dictionary.containsKey((char) i)) {
                dictionary2[i] = dictionary2[i] + " " + dictionary.get((char) i );
            } else {
                dictionary2[i] = "\n";
            }
        }
    }

    public int getFrequency(char c) {
        if (!map.containsKey(c)) {
            return 0;
        }
        return map.get(c);
    }

    public HashMap getMap() {
        return map;
    }

    public HashMap getDictionary() {
        return dictionary;
    }

    public PriorityQueue getHeap() {
        return heap;
    }

    public BST getTree() {
        return tree;
    }

    public String[] getDictionary2() {
        return dictionary2;
    }

}
