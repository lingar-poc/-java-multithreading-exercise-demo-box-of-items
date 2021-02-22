package program;

//Item generator can produce only 10 item - each for 500ms
public class ItemGenerator {
	public static int serialNum = 0; 
	public static String generates() {
		serialNum++;
		try {
			Thread.sleep(500);

		} catch (Exception e) {
			
		}
		return "item #" + serialNum;
	}
}
