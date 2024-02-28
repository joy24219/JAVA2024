package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		obj.process();
	}
	public void process() {
		// 0 =가위, 1=바위, 2=보
		// 컴퓨터가 랜덤으로 내는 가위바위보와 내가 입력한 가위바위보를 비교해서 승패를 출력하시오.
		
		// ex) 컴퓨터: 가위 | 사람: 보 -> 결과 졌다./ 이겼다./ 비겼다
		
		// 조건. math 랜덤을 사용하여 컴퓨터가 가위바위보를 내게 할것.
		
		//Math.random() 0~0.999999 까지의 double 값 랜덤한 값을 만듬
		
		int com = (int)(Math.random()*30)/10;
		
		
//		String user =sc.nextLine();
		
		while(true) {
			System.out.println("\n=====* 가위바위보 게임 *=====");
			System.out.println("0.가위 1.바위 2.보를 입력하세요.");
			
			String user =sc.nextLine();
			
			int userNum = 3;
			
			if(user.equals("0")||user.equals("0.가위")||user.equals("가위")||user.equals("0가위")||user.equals("0 가위")) {
				userNum = 0;
			}else if(user.equals("1")||user.equals("1.바위")||user.equals("바위")||user.equals("1바위")||user.equals("1 바위")) {
				userNum = 1;
			}else if(user.equals("2")||user.equals("2.보")||user.equals("보")||user.equals("2보")||user.equals("2 보")||user.equals("보자기")) {
				userNum = 2;
			}else {
				System.out.println("입력값을 확인해 주세요.");
				break;
			}
			
			if(com==0) {
				if(userNum==0) { System.out.println("비겼다.");}
				else if(userNum==1) { System.out.println("!!이겼다!!"); break;}
				else if(userNum==2) { System.out.println("졌다 ㅜㅜ");}
			}else if(com==1) {	
				if(userNum==0) { System.out.println("졌다 ㅜㅜ"); }
				else if(userNum==1) { System.out.println("비겼다.");}
				else if(userNum==2) { System.out.println("!!이겼다!!"); break;}	
			}else if(com==2) {
				if(userNum==0) { System.out.println("!!이겼다!!"); break; }
				else if(userNum==1) { System.out.println("졌다 ㅜㅜ");}
				else if(userNum==2) { System.out.println("비겼다.");}
			}
		}
	}
}
