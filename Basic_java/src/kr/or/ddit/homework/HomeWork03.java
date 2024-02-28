package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork03 obj = new HomeWork03();
//		obj.question1();
		obj.question2();
	}
	public void question1() {
		/*
		 * question 변수에 랜덤한 숫자 1~100 숫자가 입력되어 있다.
		 * if 문 조건식을 완성하여 해당 숫자를 맞추는 프로그램을 완성하시오.
		 * 1번 시행시 cnt 값이 1증가 되어야함.
		 * */
		
		//Math.random()
		//0~0.999999 까지의 double 값
		//랜덤한 값을 만듬
		
		int question = (int)(Math.random()*100)+1;
		System.out.println(question);
		
		int cnt = 0;
		
		while(true) {
			System.out.println("숫자를 입력하세요. (1~100)");
			int ans =sc.nextInt();
			cnt++;
			
			if(question<ans) {
				System.out.println("더 작은수를 입력하세요.");
			}else if(question>ans) {
				System.out.println("더 큰수를 입력하세요.");			
			}else if(question==ans) {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println(cnt+"번 시행 되었습니다.");
	}

	public void question2() {
		/*
		 * 논리연산자 : && || ! 이용할것.
		 *   4의 배수 윤년 1992 1996 2004
		 * 100의 배수 평년 1700 1800 1900
		 * 400의 배수 윤년 1600 2000
		 * */
		
		System.out.print("년도 입력 :");
		int year = sc.nextInt();
		
		
		if( (year%100 != 0 && year%4 == 0) || year%400 == 0  ) {
			System.out.println(year+" 년은 윤년입니다.");
		}else {
			System.out.println(year+" 년은 평년입니다.");
		}
	}
}
