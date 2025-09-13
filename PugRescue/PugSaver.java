import java.util.ArrayList;
import java.util.Objects;

public class PugSaver {

	//Moves every dog whose breed is "Pug" in the list to the back of the list
	//All non-pugs must remain in the same relative order they were in originally
	//and all pugs must also remain in the same relative order they were in originally
	public static void rescuePugs(ArrayList<Dog> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().toLowerCase().indexOf("golden") == -1) {
				int index = 0;
				for (int j = list.size(); j > 0; j--) {
					if (list.get(i).getName().toLowerCase().indexOf("golden") != -1) {
						index = i;
						i = -1;
					}
				}
				list.set(i, list.set(index, list.get(i)));
			}
		}
	}
}
