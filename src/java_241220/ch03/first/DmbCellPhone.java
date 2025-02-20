package java_241220.ch03.first;

public class DmbCellPhone extends CellPhone{

	@Override
	void powerOn() {
		System.out.println("DmbCellPhone.전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("DmbCellPhone.전원을 끕니다.");
	}

}
