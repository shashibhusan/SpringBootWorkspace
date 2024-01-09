import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationExceptionExample {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("shashi", 1);
		hashMap.put("bhusan", 2);
		hashMap.put("patel", 3);

		for (String key : hashMap.keySet()) {
			if (key == "bhusan") {
				// hashMap.remove(key);
			}
		}

		Iterator<Map.Entry<String, Integer>> ite = hashMap.entrySet().iterator();
		while (ite.hasNext()) {
			Map.Entry<String, Integer> ab = ite.next();
			// hashMap.remove("shashi");
			// ite.remove();
		}

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("shashi");
		alist.add("bhusan");
		alist.add("patel");
		Iterator it = alist.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		for (String value : alist) {
			if (value == "shashi") {
				// alist.remove(value);
			}
		}
		System.out.println("Removing pair successfully");

	}

}
