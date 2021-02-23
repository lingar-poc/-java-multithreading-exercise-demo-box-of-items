package program;

public class SelfDependExample {

	public static void main(String[] args) {
		/*
		 *  Example of the multithreading flow in one file - for your own convenience 
		 * The example was taken from here :
		 * https://www.guru99.com/multithreading-java.html
		 */
		System.out.println(
				"You can see at this example - how the threads running concerrency and in random way each time. ");
		long start = System.currentTimeMillis();
		long start2 = System.nanoTime();

		Box box1 = new Box();
		BoxGeneratorThread2 process1 = new BoxGeneratorThread2("process1", box1);
		process1.start();
		BoxGeneratorThread2 process2 = new BoxGeneratorThread2("process2", box1);
		process2.start();
		
		try {
			process1.process.join();
			process2.process.join();

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// Output the box items when finishing
		System.out.println(box1.items);

		// Output the time it tool
		long finish = System.currentTimeMillis();
		long finish2 = System.nanoTime();

		long timeElapsed = finish - start;
		long timeElapsed2 = finish2 - start2;

		System.out.println("Time it's took - about " + timeElapsed / 1000 + " seconds");
		System.out.println("Accurate Time it's took " + timeElapsed2 / 1_000_000_000 + " seconds");

	}
}

class BoxGeneratorThread2 implements Runnable {
	Thread process;// this holding the running of the class.
	private String processName;
	ItemsGenerator i1;// = new ItemsGenerator();
	Box box;

	BoxGeneratorThread2(String name, Box box) {
		processName = name;
		this.box = box;
		i1 = new ItemsGenerator(name);
	}

	@Override
	public void run() {
		System.out.println("Thread running " + processName);
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//			System.out.println(guruname);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Thread has been interrupted");
//			}
//		}

		// need to be done
		while (i1.itemsGenerated <= i1.maxItems) {
			box.items.add(i1.generates());

			if (box.items.size() >= box.itemsLimit) {
				break;
			}
		}
	}

	public void start() {
		System.out.println("Thread started");
		if (process == null) {
			process = new Thread(this, processName);
			// this method start to do what's defined at run().
			process.start();
		}

	}
}