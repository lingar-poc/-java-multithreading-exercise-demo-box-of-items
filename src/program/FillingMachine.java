package program;

/**
 * See the instructions at Readme.md
 */
public class FillingMachine {
	static String item;

	public static Box fillBySingleThread(Box box) {
		ItemsGenerator i1 = new ItemsGenerator("1st Generator");
		ItemsGenerator i2 = new ItemsGenerator("2nd Generator");

		while (true) {
			box.items.add(i1.generates());
			box.items.add(i2.generates());

			if (box.items.size() >= box.itemsLimit) {
				break;
			}
		}

		// DONE - with single theard(step 1)
		return null;
	}

	// Hint - not necessary that this method should implements the Multithreading
	// approach. It could be some other component of the program.
	public static Box fillByMultiThreads(Box box) {// Need to be
		// TODO - with multi theards
		ItemsGenerator i1 = new ItemsGenerator("1st Generator");
		ItemsGenerator i2 = new ItemsGenerator("2nd Generator");
		BoxFillingMultithreads b1 = new BoxFillingMultithreads(box, i1);
		BoxFillingMultithreads b2 = new BoxFillingMultithreads(box, i2);
		b1.run();
		b2.run();
		System.out.println("here ?? ");


		
		return null;
	}

}
