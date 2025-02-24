package java_241220.ch04.third;

public class TelevisionEx {
	public static void main(String[] args) {
		
		Television television = new Television();
		television.turnOn();
		
		RemoteControl remoteControl = new SettopBox();
		remoteControl.turnOn();
	}
}
