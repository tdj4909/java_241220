package java_241220.ch04.fourth;

public class User implements Member {
	private String realname;
	
	public User(String realname) {
		this.realname = realname;
	}

	@Override
	public void showMyName() {
		System.out.println("내 이름은 User." + realname);
	}

}
