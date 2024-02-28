package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType01 obj = new ReferenceType01();
//		obj.method1();
//		obj.method2();
	}
	public void method1() {
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "강감찬";
		String str4 =  new String("강감찬");
		String str5 =  new String("강감찬");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		
		//equals 주소값이 아닌 값을 비교.
		System.out.println(str3.equals(str4));
	}

	
}
