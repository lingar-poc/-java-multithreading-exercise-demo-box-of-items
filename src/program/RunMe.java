package program;

public class RunMe {
	public static void main(String[] args) {
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
		System.out.println("Time it's took - about " + timeElapsed/1000 + " seconds");
//
		
		
	}
}
