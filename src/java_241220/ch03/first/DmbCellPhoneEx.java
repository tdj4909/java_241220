package java_241220.ch03.first;

public class DmbCellPhoneEx {

	public static void main(String[] args) {

		CellPhone cellPhone = new CellPhone();
		cellPhone.model = "SAMSUNG";
		cellPhone.color = "Black";
		System.out.println(cellPhone.model);
		
		CellPhone cellPhone1 = new CellPhone();
		cellPhone.model = "iPhone";
		cellPhone.color = "16";
		System.out.println(cellPhone.model);
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		dmbCellPhone.model = "SAMSUNG2";
		dmbCellPhone.color = "Black2";
		System.out.println(dmbCellPhone.model);
		
		CellPhone cellPhone2 = new CellPhone("iPhone 16e", "Black");
		System.out.println(cellPhone2.model);
		
		
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
	}

}
