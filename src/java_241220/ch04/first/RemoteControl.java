package java_241220.ch04.first;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	final String name = "ansdf";
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
}
