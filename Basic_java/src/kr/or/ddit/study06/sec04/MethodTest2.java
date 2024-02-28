package kr.or.ddit.study06.sec04;

public class MethodTest2 {
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		mt.method1();
		mt.method2(10);
		mt.method3(7,10);
	}
	
	public void method1() {
		System.out.println("public void method1()");
		System.out.println("파라미터 값 없음");
	}
	public void method2(int a) {
		System.out.println("public void method2(int a)");
		System.out.println("파라미터 값 : "+ a);
	}
	public void method3(int a, int b) {
		System.out.println("public void method3(int a, int b)");
		System.out.println("파라미터 값 : "+a+", "+b);
	}
}
