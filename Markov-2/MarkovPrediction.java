import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class MarkovPrediction {
    
    private HashMap<String, ArrayList<String>> map;

    public MarkovPrediction(String filePath) {
        map = readData(filePath);
    }

    // Please define your own variables and data structures
    // 
    public HashMap<String, ArrayList<String>> readData(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String start = parts[0];
                String end = parts[1];
                if (map.get(start) == null) {
                    map.put(start, new ArrayList<String>());
                    ArrayList<String> list = map.get(start);
                    list.add(end);
                    map.put(start, list);
                } else {
                    map.get(start).add(end);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    // Method to predict the next state given a current state
    public String predictNextState(String currentState) {
        return map.get(currentState).get((int) (Math.random() * map.get(currentState).size()));
    }

}