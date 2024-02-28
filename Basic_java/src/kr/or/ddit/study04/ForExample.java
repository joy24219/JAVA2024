package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	public void method6() {
		//a~z까지 출력해보기,
		
//		int a = 64;
//		
//		for(int i=0; i<=24; i++) {
//			a+=1;			
//			System.out.print((char)a+" \t");
//		}
//		
//		char ch ='a';
//		for(char i='a'; i<'z'; i++) {
//			System.out.print(i);
//		}
		
		// 스캐너로 문자를 입력받고 해당 문자부터 ~z까지 출력해보기
		System.out.print("입력:");
		String val = sc.nextLine();
		
		char alp = val.charAt(0);
		int test = alp;
		
		if(test>=65 && test<=90) {
			for( ; alp<='Z'; alp++) {
				System.out.print(alp+"  ");
			}
		}else if(test>=97 && test<=122) {
			for( ; alp<='z'; alp++) {
				System.out.print(alp+"  ");
			}
		}else {
			System.out.println("영어 한글자를 입력해주세요.");
		}
		
	}
	public void method5() {
		/*
		 * 1~100 홀수의 합을 구하시오.
		 * */
		
		int val = 0;
		for(int i=1; i<=100; i+=2) { val+=i; }
//		for(int i=1; i<=100; i++) { if(i%2==1) { val+=i;} }
		System.out.println(val);
	}
	public void method4() {
		//1~10까지 짝수의 합을 구하시오.
		
		int sum = 0;
		
		
		//for(int i=1; i<=10; i++) { if(i%2==0) { sum+=i;} }
		for(int i=2; i<=10; i+=2) { sum+=i; }
		
		System.out.println(sum);
		
	}
	public void method3() {
		//11~20까지의 숫자를 더하시오.
		int sum = 0;

		for(int i=11; i<=20; i++) {
			sum+=i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
	public void method2() {
		//1~5까지의 숫자를 더하시오
		int sum = 0;

		for(int i=1; i<=5; i++) {
			sum+=i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
	
	public void method1() {
		/*
		 * 반복문
		 * for, while문
		 * 
		 *									실행순서 
		 * i=0  <- 초기화식 : 시작조건			1
		 * i<10 <- 조건식   : 종료조건			2
		 * 실행문 								3
		 * i++  <- 증감식   : 반복시 실행		4
		 * 
		 * */
		
		for(int i=0; i<10; i++) {
			System.out.print(i+"\t");
		}
	}
}
