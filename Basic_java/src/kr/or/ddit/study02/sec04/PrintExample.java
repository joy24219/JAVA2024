package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
		obj.method3();
	}
	
	public void method3() {
		/*
		 * 본인 이름과, 나이를 스캐너를 통해서 입력받아볼것.
		 * printf를 활용하여 출력하기.
		 * */		
		System.out.print("이름을 입력하세요:");		
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요:");
		String age = sc.nextLine();
		
//		System.out.printf("이름: %-6s",name);
//		System.out.printf("나이: %2s",age);

		System.out.printf("이름: %s, 나이: %2s",name,age);
	}
	
	public void method2() {
//		System.out.println("형식지정문자열", 변수리스트);
		
		// - 왼쪽정렬
		// 0 남은왼쪽 빈공간에 0을 채움
		// 8 <- 8개의 공간
		
		System.out.printf("숫자 : %d 입니다", 1000);
		System.out.printf("%8d\n", 1000);
		System.out.printf("%-8d\n", 1000);
		System.out.printf("%08d\n", 1000);
	}
	
	public void method1() {
		//System.out.println(); 줄바꿈기능 있음
		System.out.println("홍길동");
		System.out.println("34061");
		System.out.println("대전시 중구 계룡로");
		System.out.println();

		//System.out.print(); 줄바꿈기능 없음
		System.out.print("홍길동");
		System.out.print("34061");
		System.out.print("대전시 중구 계룡로");
		System.out.println();
	}
}
