package kr.or.ddit.study06.sec04;

public class MethodTest {
	public static void main(String[] args) {
		System.out.println("메인메소드");
		
		MethodTest mt = new MethodTest();
//		mt.method1();
//		mt.method2();
		int result1 = mt.method2(); 
		System.out.println("메인에서 받을 리턴 값 :"+result1);
		
		mt.method3();
		double result2 = mt.method3(); 
		System.out.println("메인에서 받을 리턴 값 :"+result1);
	}
	public void method1() {
		System.out.println("public void method1()");
		System.out.println("리턴 값이 없어요");
	}
	public int method2() {
		System.out.println("public int method2()");
		System.out.println("리턴값 int");
		return 10;
	}
	public double method3() {
		System.out.println("public double method3()");
		System.out.println("리턴값 double");
		return 3.14;
	}
}
