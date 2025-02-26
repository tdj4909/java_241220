package java_241220.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {

		Set<String> computerLangs = new HashSet<>();

		computerLangs.add("HTML");
		computerLangs.add("CSS");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		computerLangs.add("HTML");

		for (String computerLang : computerLangs) {
			System.out.println(computerLang);
		}
	}

}
