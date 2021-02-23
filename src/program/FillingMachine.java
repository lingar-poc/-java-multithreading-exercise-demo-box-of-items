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

	public static Box fillByMultiThreads(Box box) {
		// Done  - with multi theards
		ItemsGenerator i1 = new ItemsGenerator("1st Generator");
		ItemsGenerator i2 = new ItemsGenerator("2nd Generator");
		BoxFillingMultithread b1 = new BoxFillingMultithread(box, i1);
		BoxFillingMultithread b2 = new BoxFillingMultithread(box, i2);
		b1.start();
		b2.start();
		//This causing the afterward execution to be hold until the threads finishing running.
		try {
			b1.process.join();
			b2.process.join();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

}
