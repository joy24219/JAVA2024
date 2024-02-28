package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}
	public void method4() {
		// 스캐너를 통해 입력한 숫자까지 출력하고 for문을 종료
		// ex) 30-> 1 2..... 30
	
		int val = sc.nextInt();
		
//		for(int i=0; i<1000; i++) {
//			if(i<= val) { System.out.println(i); }
//		}
		
		for(int i=0; i<1000; i++) {
			System.out.println(i);
			if(i==val || val<0) { break; }
		}
	}
	public void method3() {
		// 홀수만 출력해보기
				
		//for(int i=1; i<=100; i+=2) { System.out.println(i); }
		//for(int i=1; i<10; i++) { if(i%2==1) {System.out.println(i);} }
		
		for(int i=1; i<10; i++) {
			if(i%2==0) {continue;} 
			// continue를 만나는 순간 해당 for문을 바로 종료해버리고 다음for문으로 넘어 간다.
			System.out.println(i);
		}
	}
	public void method2() {
		// 구구단 출력하기
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for(int i = 2; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			System.out.println("");
		}
	}
	public void method1() {
		// 영어에 포함된 모음의 수를 구하시오
		// 모음 : a e i o u
		// ex) length -> 1개
		
		System.out.println();
		String s =sc.nextLine();
		
		// strring.length() -> 문자열의 길이
		
		int length = s.length();
		
		int count = 0;
		for(int i=0; i<length; i++) {
			char c = s.charAt(i);
			if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ) {
				count++;
			}
		}
		System.out.println(s+"에 포함된 모음의 수는 : "+count+"개 입니다.");
	}

}
