package java_241220.ch04.fourth;

public class Admin implements Member {
	private String realname;
	
	public Admin(String realname) {
		this.realname = realname;
	}
	@Override
	public void showMyName() {
		System.out.println("내 이름은 Admin." + realname);
	}

}
