package java_241220.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputerExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.print("원의 반지름: ");
		double param = Double.parseDouble(br.readLine());
		
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.print("원면적: " + calculator.calPAI(param));
		
		System.out.println("\n");
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.print("원면적: " + computer.calPAI(param));
	}

}
