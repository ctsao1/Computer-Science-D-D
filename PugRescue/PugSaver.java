import java.util.ArrayList;
import java.util.Objects;

public class PugSaver {

	//Moves every dog whose breed is "Pug" in the list to the back of the list
	//All non-pugs must remain in the same relative order they were in originally
	//and all pugs must also remain in the same relative order they were in originally
	public static void rescuePugs(MyArrayList<Dog> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().toLowerCase().indexOf("golden") == 1) {
				int index = i;
				int backIndex = 0;
				for (int j = list.size() - 1; j > 0; j--) {
					if (list.get(j).getName().toLowerCase().indexOf("golden") != -1) {
						backIndex = j;
					}
				}
				list.set(backIndex, list.set(index, list.get(backIndex)));
			}
		}
	}
}
