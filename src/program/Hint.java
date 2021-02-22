package program;

public class Hint {

	public static void main(String[] args) {
		/*
		 * The example was taken from here : https://www.guru99.com/multithreading-java.html
		 */
		System.out.println(
				"You can see at this example - how the threads running concerrency and in random way each time. ");
		GuruThread3 threadguru1 = new GuruThread3("guru1");
		threadguru1.start();
		GuruThread3 threadguru2 = new GuruThread3("guru2");
		threadguru2.start();
	}
}

class GuruThread3 implements Runnable {
	Thread guruthread;
	private String guruname;

	GuruThread3(String name) {
		guruname = name;
	}

	@Override
	public void run() {
		System.out.println("Thread running " + guruname);
		for (int i = 0; i < 4; i++) {
			System.out.println(i);
			System.out.println(guruname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread has been interrupted");
			}
		}
	}

	public void start() {
		System.out.println("Thread started");
		if (guruthread == null) {
			guruthread = new Thread(this, guruname);
			// this method start to do what's defined at run().
			guruthread.start();
		}

	}
}