package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.method5();
	}
	public void method1() {
		/* 스캐너를 통해 숫자를 입력받고 소수점 2째 자리에서 버림 */
		
		System.out.println("실수를 입력해 주세요.");
		String s1 = sc.nextLine();		
		double d1 = (int)(Double.parseDouble(s1)*100)/100.00;
	
		System.out.println(d1);		
	}
	
	public void method2() {
		/* 스캐너를 통해서 소문자를 입력받고 대문자로 변환 */
		
		System.out.println("소문자를 입력해주세요");
		String s2 = sc.nextLine();
		char c2 = (char)(s2.charAt(0)-32);
		
		System.out.print(c2);
	}
	
	public void method3() {
		/* 스캐너를 통해서 대문자를 입력받고 소문자로 변환 */
		
		System.out.println("대문자를 입력해주세요");
		String s3 = sc.nextLine();
		char c3 = (char)(s3.charAt(0)+32);
		
		System.out.print(c3);
	}
	
	public void method4() {
		/* 스캐너를 통해서 숫자 3자리를 입력받고 각 자리 수의 합을 구하시오 */
		
		System.out.println("숫자 3자리를 입력하시면 각 자리의 수를 합하여 구합니다.");
		String s4 = sc.nextLine();
		int i4 = ((char)s4.charAt(0)-48) + ((char)s4.charAt(1)-48) + ((char)s4.charAt(2)-48);
		
		System.out.print(i4);
	}
	
	public void method5() {
		/* 스캐너를 통해서 숫자를 입력받고 소수점 2째 자리에서 반올림. */
		
		System.out.println("실수를 입력해 주세요.");
		String s5 = sc.nextLine();
		double d5 = (int)(Double.parseDouble(s5)*10+0.5)/10.0;
		
		System.out.println(d5);
	}
}
