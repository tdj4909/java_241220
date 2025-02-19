package java_241220.ch02.third;

public class Arithmetic {

	int x;
	int y;
	
	Arithmetic(int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	void sol() {
		System.out.printf("%d + %d = %d 입니다\n"
				,x,y,x+y);
	}
}
