package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	public static void main(String[] args) {
		HomeWork17 hw = new HomeWork17();
		hw.process();
	}
	public void process() {
		// 달력 출력하기.
		// 다음달 입력하면 다음달 달력 출력
		// 이전달 입력하면 이전달 달력 출력
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		while (true) {
			//달의 첫날로 세팅
			cal.set(Calendar.DAY_OF_MONTH, 1);
			//달의 마지막 일
			int last = cal.getActualMaximum(Calendar.DATE);
			//일 1, 월 2, 화 3, 수 4, 목 5, 금 6, 토 7
			int start  =  cal.get(Calendar.DAY_OF_WEEK);
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int day = 1;
			
			System.out.println("---------------------- "+year+"년 "+month+"월 ----------------------");
			System.out.println("<.이전달\t\t\t\t\t다음달.>\t 나가기.!");
			System.out.println("--------------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			for(int i=1; i<last+start; i++) {
				if(i>=start) {
					System.out.print(day+"\t");
					day++;
				}else System.out.print("\t");
				if(i%7==0)System.out.println("");
			}
			System.out.print("\n--------------------------------------------------------\n값입력 :");
			 String userInput = sc.next();
			
			if(userInput.equals("<")) { cal.add(Calendar.MONTH,-1); }
			else if(userInput.equals(">")) { cal.add(Calendar.MONTH,1); }
			else if(userInput.equals("!")) {
				System.out.println("프로그램이 종료됩니다.");
				sc.close();
				break;
			}
			else {System.out.println("잘못된 값 입력.");}
		}
	}
}
