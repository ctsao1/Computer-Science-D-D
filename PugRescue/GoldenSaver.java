import java.util.ArrayList;
import java.util.Objects;

public class GoldenSaver {

	//Moves every dog whose breed is "Golden ____" in the list to the back of the list
	public static void rescueGolden(ArrayList<Dog> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBreed().toLowerCase().indexOf("gold") != -1) {
				
			}
		}
	}
}
