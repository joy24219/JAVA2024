package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class BCountry implements Nation2 {
	// B 나라에서는 
	// 1. 세금이 15% + 생활비 2000
	// 2. 가위바위보 게임  (상금 : 20000)
	@Override
	public int tax(int money) {
		return (int)(money*0.85)-2000;
	}
	private Scanner sc;
	@Override
	public int game() {
		sc = new Scanner(System.in);
		int money = 0;
		int com = new Random().nextInt(3);
		
		
		System.out.println("\n=====* 가위바위보 게임 *=====");
		System.out.print("0.가위 | 1.바위 | 2.보 중 입력 :");
		
		String user = sc.nextLine();
		
		int userNum = 3;
		
		if(user.equals("0")||user.equals("0.가위")||user.equals("가위")||user.equals("0가위")||user.equals("0 가위")) {
			userNum = 0;
		}else if(user.equals("1")||user.equals("1.바위")||user.equals("바위")||user.equals("1바위")||user.equals("1 바위")) {
			userNum = 1;
		}else if(user.equals("2")||user.equals("2.보")||user.equals("보")||user.equals("2보")||user.equals("2 보")||user.equals("보자기")) {
			userNum = 2;
		}else {
			System.out.println("잘못된 값 입력으로 상금은 0원 입니다. ");
			return money;
		}
		
		if(com==0) {
			if(userNum==0) { System.out.println("비겼습니다. +0원"); return money;}
			else if(userNum==1) { System.out.println("이겼습니다. +20000원"); return money+20000;}
			else if(userNum==2) { System.out.println("졌습니다. +0원"); return money;}
		}else if(com==1) {	
			if(userNum==0) { System.out.println("졌습니다. +0원"); return money;}
			else if(userNum==1) { System.out.println("비겼습니다. +0원"); return money;}
			else if(userNum==2) { System.out.println("이겼습니다 +20000원"); return money+20000;}	
		}else if(com==2) {
			if(userNum==0) { System.out.println("이겼습니다 +20000원"); return money+20000; }
			else if(userNum==1) { System.out.println("졌습니다. +0원"); return money;}
			else if(userNum==2) { System.out.println("비겼습니다. +0원"); return money;}
		}
		return money;
	}
}
