package kr.or.ddit.study05.sec03;

import java.util.Scanner;

public class WeekExample {	
	public static void main(String[] args) {
		// 월화수목금토일을 입력을 숫자로 각각 받고
		// 출력하는 프로그램 만들기.
		// 월=1, 화=2, ... 일=7
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		if(num==1) System.out.println("월");
//		if(num==2) System.out.println("화");
//		if(num==3) System.out.println("수");
//		if(num==4) System.out.println("목");
//		if(num==5) System.out.println("금");
//		if(num==6) System.out.println("토");
//		if(num==7) System.out.println("일");
//		
//		String str = sc.next();
//		
//		if(str.equals("mon")) System.out.println("월");
//		if(str.equals("mon")) System.out.println("화");
//		if(str.equals("mon")) System.out.println("수");
//		if(str.equals("mon")) System.out.println("목");
//		if(str.equals("mon")) System.out.println("금");
//		if(str.equals("mon")) System.out.println("토");
//		if(str.equals("mon")) System.out.println("일");
//		
//		
//		Week week = Week.MON;
//		if(Week.MON == week) System.out.println("월요일입니다.");
		
		for(Week week: Week.values()){
			System.out.println(week+", "+week.kor);
		}
		
		Week[] allWeeks = Week.values(); // Week 열거형의 모든 열거 상수를 배열로 얻음

		for (int i = 0; i < allWeeks.length; i++) {
		    Week week = allWeeks[i];
		    // 여기에 해당 열거 상수에 대한 작업을 수행하는 코드가 들어갑니다.
		}
		
		
	}
}
