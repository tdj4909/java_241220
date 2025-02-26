package java_241220.ch08.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {

		List<String> friends = new ArrayList<>();
		
		System.out.println("size : " + friends.size());
		friends.add("Tony");
		friends.add("Tom");
		System.out.println("size : " + friends.size());
		
		System.out.println("===============================");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		
		System.out.println("===============================");
		for (String friend : friends) {
			System.out.println(friend);
		}
		
		
		
//		test.removeLast();
//		System.out.println("size : " + test.size());
//		test.remove(test.get(0));
//		System.out.println("size : " + test.size());
	}

}
