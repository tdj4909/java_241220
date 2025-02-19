package java_241220.ch02.third;

public class ArithmeticEx {
	public static void main(String[] args) {

		int a = 7;
		int b = 8;
		
		Arithmetic arithmetic = new Arithmetic(a,b);
		
		arithmetic.sol();
		
		plus(a,b);
	}
	
	static void plus(int a, int b) {
		System.out.printf("%d + %d = %d 입니다"
				,a,b,a+b);
	}
}
