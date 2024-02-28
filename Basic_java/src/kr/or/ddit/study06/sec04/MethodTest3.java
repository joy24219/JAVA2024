package kr.or.ddit.study06.sec04;

public class MethodTest3 {
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
		
		
		int retrun1 = mt.method1(10, 10);
		System.out.println(retrun1);
		
		int retrun2 = mt.method2(10, 10);
		System.out.println(retrun2);
		
		int retrun3 = mt.method3(10, 10);
		System.out.println(retrun3);
		
		int retrun4 = mt.method4(10, 10);
		System.out.println(retrun4);
		
		
	}
	//a+b 메소드를 만들고 결과값을 메인에 받아서 출력
	public int method1(int a, int b) {
		return a+b;
	}
	//a-b 메소드를 만들고 결과값을 메인에 받아서 출력
	public int method2(int a, int b) {
		return a-b;
	}
	//a/b 메소드를 만들고 결과값을 메인에 받아서 출력
	public int method3(int a, int b) {
		return a/b;
	}	
	//a*b 메소드를 만들고 결과값을 메인에 받아서 출력
	public int method4(int a, int b) {
		return a*b;
	}
}
