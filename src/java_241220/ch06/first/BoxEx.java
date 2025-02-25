package java_241220.ch06.first;

public class BoxEx {

	public static void main(String[] args) {

		Box<Integer> box = new Box();
		box.setT(1);
		System.out.println(box.getT());
		
		Box<String> box2 = new Box();
		box2.setT("Tony");
		System.out.println(box2.getT());
	}

}
