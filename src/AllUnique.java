import java.util.HashMap;
import java.util.Map;

public class AllUnique {
	public boolean allUnique(String s) {
		
		String[] arr = s.split("");
		HashMap<String, Integer> letterCount = new HashMap<String, Integer>();
		for (String el : arr) {
			if (letterCount.get(el) == null) {
				letterCount.put(el, 1);
			} else {
				letterCount.put(el, letterCount.get(el) + 1);
			}
		}

		for (Map.Entry<String, Integer> entry : letterCount.entrySet()) {
			if (entry.getValue() > 1) {
				return false;
			}	
		}

		return true;
	}
	
	
	public static void main(String[] args) {
		AllUnique tmp = new AllUnique();
		System.out.println(tmp.allUnique(null));
	}
	
}
