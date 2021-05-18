package program;

public class RunMe {
	public static void main(String[] args) {
		
		System.out.println("Multithreading - Demo by Exercise. \n"
				+ "Please see the readme.md for more details.\n"
				+ "Here you can see the first step of creating the process ready.\n"
				+ "Notice that the process took about 15 seconds.");
		// TODO:
		// create here a box
		Box box1 = new Box();
		// create a timer
		long start = System.currentTimeMillis();
		// ...
		
		// fill the box by service from filling machine service.
		FillingMachine.fillBySingleThread(box1);
		
		// Output the box items when finishing 
		System.out.println(box1.items);
		
		// Output the time it tool 
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Time it's took - about " + timeElapsed/1000 + " seconds");
//
		
		
	}
}
