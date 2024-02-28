package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType02 obj = new ReferenceType02();
		obj.method1();
	}
	public void method1() {
		int a = 10;
		int b = 11;
		
		if(true){
			int c= 7;
			int d= 5;
		}
		if(true) {
			int e = 9;
			String f = "테스트";
		}
		
		int g=0;
	}

}
