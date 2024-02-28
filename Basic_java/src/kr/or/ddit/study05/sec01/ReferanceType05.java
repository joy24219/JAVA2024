package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferanceType05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferanceType05 obj = new ReferanceType05();
		obj.method1();
	}
	public void method1() {
		String str1 = "";
		String str2 = null;
		
		if(str1.equals(str2) || str1 == null) {
			System.out.println("빈문자열");
		}
		
		if(str2.equals(str1) || str2 == null) {
			System.out.println("빈문자열2");
		}
		
		if(str2 == null || str2.equals(str1)) {
			System.out.println("빈문자열3");
		}
		
	}

}
