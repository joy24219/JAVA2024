package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType04 obj = new ReferenceType04();
		//obj.method1();
		obj.method2();
	}
	public void method1() {
		
		int a1 = 10;
		int a2 = 11;
		//1번상황
		
		String s1 = null;
		//2번상황
		
		if(true) {
			int a3 = 12;
			int a4 = 13;
			//3번상황
		}
		//4번상황
		
		a1 = 15;
		a2 = 17;
		String s2 = "테스트";
		//5번상황
	}
	public void method2() {
		
		String s1 = null;
		//1
		int a1 = 100;
		int a2 = -a1;
		
		//2
		int sum = 0;
		
		//3
		for(int i=0; i<10; i++) {
			sum+=i;
			//4
		}
		
		s1 = "테스트";
		//5
		
		String s2 = new String("테스트");
		//6
	}
}
