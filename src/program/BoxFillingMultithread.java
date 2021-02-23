package program;
/**
 * the box filling thread 
 * @author Lingar
 *
 */
public class BoxFillingMultithread implements Runnable {
	Box box;

	public BoxFillingMultithread(Box box, ItemsGenerator itemsGenerator) {
		super();
		this.box = box;
		this.itemsGenerator = itemsGenerator;
		this.process = new Thread(this,"process of " + itemsGenerator.id);

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
		System.out.println("Filling process started running...");
		String item = itemsGenerator.generates();
		while (itemsGenerator.itemsGenerated <= itemsGenerator.maxItems) {
			box.items.add(item);
			 item = itemsGenerator.generates();
			if (box.items.size() >= box.itemsLimit) {
				break;
			}
		}

	}
	public void start() {
		System.out.println("Thread started " + process.getState() );
		process.start();

	}

}
