package program;

//Item generator can produce only 10 item - each for 500ms
public class ItemsGenerator {
	public static int serialNum = 0; 
	public int itemsGenerated = 0;
	public final int maxItems = 20;
	public String id = "noid";
	public ItemsGenerator() {
		
	}
	
	public ItemsGenerator(String id) {
		this.id = id;
	}
	public String generates() {
		if (itemsGenerated >= maxItems) {
			return null;
		}
		serialNum++;
		itemsGenerated++;
		System.out.println(id + " generating item...");

		
		try {
			Thread.sleep(500);

		} catch (Exception e) {
			
		}
		return "item #" + serialNum;
	}
}
