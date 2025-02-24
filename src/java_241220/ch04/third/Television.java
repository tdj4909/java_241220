package java_241220.ch04.third;

public class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
	}

	@Override
	public void setVolume(int volume) {
	}

}
