package program;

//Item generator can produce only 10 item - each for 500ms
public class ItemsGenerator {
	public static int serialNum = 0; 
	public final int maxItems = 20;
	public static String generates() {
		serialNum++;
		try {
			Thread.sleep(500);

		} catch (Exception e) {
			
		}
		return "item #" + serialNum;
	}
}
