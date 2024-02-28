package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExmaple {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExmaple obj = new WhileExmaple();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}
	public void method4() {
		int i = 1;
		do {
			System.out.println(i+++"번 실행");
		}while(i<10);
	}
	public void method3() {
		String menu = "** 커피메뉴 **\n";
		menu += "1. 아메리카노      \t 3000원\n";
		menu += "2. 카페라때        \t 3500원\n";
		menu += "3. 카라멜 마끼야또 \t 4000원\n";
		menu += "4. 딸기 에이드     \t 4000원\n";
		menu += "5. 종료 \n";
		
		int sum=0;
		String bill ="";
		while(true) {
			System.out.println(menu);
			System.out.println("음료를 선택하시오.");
			int choice = sc.nextInt();
			if(choice == 1) {bill+=" 아메리카노"; sum+=3000;}
			if(choice == 2) {bill+=" 카페라때"; sum+=3500;}
			if(choice == 3) {bill+=" 카라멜 마끼야또"; sum+=4000;}
			if(choice == 4) {bill+=" 딸기 에이드"; sum+=4000;}
			if(choice == 5) {break;}
		}
		
		System.out.println("주문내역 : "+bill+"\n주문금액 : "+sum);
	}
	public void method2(){
		int i = 1;
//		while(i>0) {
//			i=i+100;
//			System.out.println(i); 
//			//오버플로우, 언더플로우 타입의 최대 값보다 넘치면 오버플로우 타입의 최소값보다 적어지면 언더플로우가 발생. 
//		}
	}
	public void method1() {
		// 
		System.out.println("10번 찍어 안넘가는 나무 없다.");
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i+"번");
		}
		System.out.println("나무가 넘어갔습니다.");
	}
}
