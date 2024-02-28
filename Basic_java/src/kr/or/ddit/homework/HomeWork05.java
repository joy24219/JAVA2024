package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}
//	public void method1() {
//		//스캐너를 통해 입력받은 단의 구구단 출력
//		// ex) 4 | 4*1=4 
//		
//		System.out.print("알고싶은 구구단의 단수를 입력 : ");
//		int dan = sc.nextInt();
//		
//		System.out.println("\n"+dan+"단을 출력합니다.");
//		for(int i=1; i<=9; i++) {
//			System.out.printf("%d * %d = %d\n",dan, i, dan*i);
//		}		
//	}
	public void method1() {
		//스캐너를 통해 입력받은 단의 구구단 출력
		// ex) 4 | 4*1=4 
		
		System.out.print("출력할 구구단을 입력 : ");
		int dan = sc.nextInt();
		
		System.out.println("\n"+dan+"단을 출력합니다.");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}		
	}
	
	public void method2() {
		// 구구단 전체 출력
		// 2*1=2 3*1=3 ....... 9*1=9
		// 2*2=4..........
		// ....
		// 2*9=18 ......
		
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\t",dan,i,dan*i);
			}
			System.out.println("");
		}
	}
	public void method3() {
		//구구단을 전체 출력 하돼. 입력받은 단 제외
		
		System.out.print("제외할 단은 입력하세요 : ");
		int del = sc.nextInt();
		
		for(int j=1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				if(del == i) continue;
				System.out.printf("%d*%d=%d\t",i,j,j*i);
			}
			System.out.println("");
		}
		
	}
//	public void method4() {
//		// 스캐너를 통해서 숫자를 입력받고 홀수인 경우
//		// 홀수인 경우에는 입력값의 까지 홀수값 전체를 더하고
//		// 짝수인 경우에는 입력값의 까지 짝수값을 제곱하여 출력
//		
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int val = sc.nextInt();
//		int reply = 0;
//		String replyTxt = "";
//		if(val%2==0) {
//			for(int i=2; i<=val; i+=2) {
//				replyTxt += "("+i+"*"+i+")";
//				if(i!=val) {replyTxt += "+";}
//				reply+= i*i;
//			}
//		}else if(val%2==1) {
//			for(int i=1; i<=val; i+=2) {
//				replyTxt += ""+i;
//				if(i!=val) {replyTxt += "+";}
//				reply+=i;
//			}
//		}
//		
//		System.out.println(replyTxt+"="+reply);
//	}
	public void method4() {
		// 스캐너를 통해서 숫자를 입력받고 홀수인 경우
		// 홀수인 경우에는 입력값의 까지 홀수값 전체를 더하고
		// 짝수인 경우에는 입력값의 까지 짝수값을 제곱하여 출력
		
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		if(num%2==0) {
			for(int i=1; i<=num; i+=2) sum+=i;
		}
		else if(num%2==1) {
			for(int i=2; i<=num; i+=2) sum+=i*i;
		}
		
	}
}
