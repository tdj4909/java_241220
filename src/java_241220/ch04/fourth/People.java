package java_241220.ch04.fourth;

public class People {

	public static void main(String[] args) {
		String realname = "실제이름";
		
		Member memberAdmin = new Admin(realname);
		memberAdmin.showMyName();
		
		Member memberUser = new User(realname);
		memberUser.showMyName();

		memberAdmin = memberUser;
		memberAdmin.showMyName();
	}

}
