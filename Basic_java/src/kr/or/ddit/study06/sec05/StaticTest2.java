package kr.or.ddit.study06.sec05;

public class StaticTest2 {
	int a1 = 1;
	static int a2 = 2;
	
	public static void main(String[] args) {
		StaticTest2 st = new StaticTest2();
		st.method1();
		st.smethod2();
		
		StaticTest2.smethod2();
		
	}
	
	public void method1() {
		
	}
	public void method2() {
		
	}
	public static void smethod1(StaticTest2 st) {
		System.out.println(st.a1);
	}
	public static void smethod2() {
		
	}
}
