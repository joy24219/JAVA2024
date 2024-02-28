package kr.or.ddit.homework.home16;

import java.util.Scanner;

public class HomeWork16 {
	public static void main(String[] args) {
		HomeWork16 hw = new HomeWork16();
		hw.process();
	}
	
	public void process() {
		/*		
		 *    Nation 클래스 
		 *    1. tax  메소드 생성
		 *    2. game 메소드 생성
		 *    
		 *    1 -> 게임 시행시 모든 보유 금액에 관하여 세금이 매겨짐
		 *    2 -> 각 게임별 성공시 보상 금액 제공
		 * 
		 *    A 나라에서는 
		 *      1. 세금이 10% + 생활비 1000
		 *      2. 주사위 2개 숫자 맞추기 게임. (상금 : 30000)  
		 *    B 나라에서는 
		 *      1. 세금이 15% + 생활비 2000
		 *      2. 가위바위보 게임  (상금 : 20000)
		 *    C 나라에서는 
		 *      1. 세금이 20% + 생활비 3000
		 *    	2. 홀짝 게임   (상금 : 15000)
		 *     
		 */
		int cnt=0;
		int money =10000;
		while(cnt++<10) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n"+cnt+"회차 보유 금액 : "+money+"\n");
			System.out.print("나라를 선택하시오 : ");
			String sel = sc.next();
			Nation2 N = getNation(sel);			
			
			money = N.tax(money);
			System.out.println("납세 후 보유 금액 : "+money+"\n");
			
			money += N.game();			
			
			if(cnt==10)System.out.println("10회차를 진행하여 종료됩니다.");
		}
		
	}
	public Nation2 getNation(String sel) {
		if(sel.equals("A"))return new ACountry();
		if(sel.equals("B"))return new BCountry();
		if(sel.equals("C"))return new CCountry();
		else return null;
	}
}


