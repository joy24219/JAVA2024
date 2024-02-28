package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {
		Circle c = new Circle();

//		double return1 = c.method1(5);
//		System.out.println(return1);
//
//		double return2 = c.method2(5);
//		System.out.println(return2);
		
		double r = 10;
		System.out.println("반지름 "+r+"짜리 원의 넓이는 "+c.method1(r));
		System.out.println("반지름 "+r+"짜리 원의 둘레는 "+c.method2(r));
		
	}
	//반지름을 매개변수(파라미터)로 받아 넓이를 구하는 메소드를 작성하시오
	//반지름 * 반지름 * 파이
	public double method1(double a) {
		double pi = Math.PI;
		return a*a*pi;
	} 
	
	//반지름을 매개변수(파라미터)로 받아 워늬 둘레를 구하는 메소드를 작성하시오
	//반지름 * 파이 * 2
	public double method2(double a) {
		double pi = Math.PI;
		return a*pi*2;
	} 
	
}
