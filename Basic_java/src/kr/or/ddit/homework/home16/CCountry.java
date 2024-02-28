package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class CCountry implements Nation2 {
	// A 나라에서는 
	// 1. 세금이 20% + 생활비 3000
	// 2. 홀짝 게임   (상금 : 15000)
	@Override
	public int tax(int money) {
		return (int)(money*0.80)-3000;
	}
	private Scanner sc;
	@Override
	public int game() {
		sc = new Scanner(System.in);
		int money = 0;
		System.out.println("!!!홀짝 맞추기!!!");
		System.out.print("홀 | 짝 입력 : ");
		String user = sc.nextLine();
		
		int com = new Random().nextInt(2)+1; 
		
		if((user.equals("홀") && com==1)||(user.equals("짝") && com==2)) {
			System.out.println("맞췄습니다. +15000원");
			return money+15000;
		}else {
			System.out.println("틀렸습니다. +0원");
			return money;
		}
	}

}
