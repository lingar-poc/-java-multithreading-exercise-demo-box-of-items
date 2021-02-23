package program;

/**
 * See the instructions at Readme.md
 */
public class FillingMachine {
	static String item;
	public static Box fillBySingleThread(Box box) {
		ItemsGenerator i1 = new ItemsGenerator();
		String item = i1.generates();
		while (item != null) {
			box.items.add(item);
			item = i1.generates();
		}
		
		ItemsGenerator i2 = new ItemsGenerator();
		item = i2.generates();
		while (item != null) {
			box.items.add(item);
			item = i2.generates();
			if (box.items.size() >= box.itemsLimit) {
				break;
			}
		}
		// TODO - with single theard(step 1)
		return null;
	}

	// Hint - not necessary that this method should implements the Multithreading
	// approach. It could be some other component of the program.
	public static Box fillByMultiThreads(Box box) {
		// TODO - with multi theards
		return null;
	}
}
