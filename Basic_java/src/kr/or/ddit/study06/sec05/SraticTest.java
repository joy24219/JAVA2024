package kr.or.ddit.study06.sec05;

public class SraticTest {
	static int a;
	int b;
	
	public static void main(String[] args) {
		SraticTest st = new SraticTest();
	}
	
	static void method1() {
		System.out.println(a);
		SraticTest st1 = new SraticTest();
		System.out.println(st1.b);
		
	};
	
	void method2() {
		System.out.println(a);
		System.out.println(b);
	};
}

