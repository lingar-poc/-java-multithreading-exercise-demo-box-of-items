package program;

public class BoxFillingMultithreads implements Runnable {
	Box box;

	public BoxFillingMultithreads(Box box, ItemsGenerator itemsGenerator) {
		super();
		this.box = box;
		this.itemsGenerator = itemsGenerator;
		this.process = new Thread(this,"process of " + itemsGenerator.id);
//		this.run();

	}

	// every thread need to run run loop of one generator that filling the box
	Thread process;// = new Thread(itemsGenerator.id);
	ItemsGenerator itemsGenerator;// = new ItemsGenerator("1st Generator");

	@Override
	public String toString() {
		return "BoxFillingMultithreads [box=" + box + "]";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running...");
		String item = itemsGenerator.generates();
		while (itemsGenerator.itemsGenerated <= itemsGenerator.maxItems) {
			box.items.add(item);
//			box.items.add(i2.generates());
			 item = itemsGenerator.generates();
			if (box.items.size() >= box.itemsLimit) {
				break;
			}
		}

	}
	public void start() {
		System.out.println("Thread started " + process.getState() );

	}

}
