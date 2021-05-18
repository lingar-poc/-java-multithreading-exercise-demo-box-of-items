package program;

public class RunMe {
	public static void main(String[] args) {
		System.out.println("Multithreading - Demo by Exercise. \n"
				+ "Please see the readme.md for more details.\n"
				+ "Here you can see the solution that the process get minimized by 50% by using mutil-threading."
				+ "In Branch-A it's took about 15 seconds while here it's about 8.");
		// TODO:
		// create here a box
		Box box1 = new Box();
		// create a timer
		long start = System.currentTimeMillis();
		// ...

		// fill the box by service from filling machine service.
//		FillingMachine.fillBySingleThread(box1);
		FillingMachine.fillByMultiThreads(box1);

		// Output the box items when finishing
		System.out.println(box1.items);

		// Output the time it tool
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Time it's took - about " + timeElapsed / 1000 + " seconds");
//

	}
}
