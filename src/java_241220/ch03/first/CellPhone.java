package java_241220.ch03.first;

public class CellPhone {

	String model;
	String color;
	
	CellPhone() {
	}

	CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
