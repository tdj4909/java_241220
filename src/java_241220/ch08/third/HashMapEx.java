package java_241220.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("장원영키", 170);
		friends.put("전지현키", 171);
		friends.put("장동건키", 172);
		
		for (String strkey : friends.keySet()) {
			Integer strValue = friends.get(strkey);
			System.out.println(strkey + " : " + strValue);
		}
	}

}
