package kr.or.ddit.homework.home16;

import java.util.Random;
import java.util.Scanner;

public class ACountry implements Nation2 {
	// A 나라에서는 
	// 1. 세금이 10% + 생활비 1000
	// 2. 주사위 2개 숫자 맞추기 게임. (상금 : 30000) 
	
	@Override
	public int tax(int money) {
		return (int)(money*0.9)-1000;
	}
	private Scanner sc;
	@Override
	public int game() {
		sc = new Scanner(System.in);
		int money = 0;
		System.out.println("\n=====* 주사위 2개의 합 맞추기 *=====");
		System.out.print("(2에서 12사이) 예상숫자입력:");
		if(sc.nextInt() == dice()+dice()) {
			System.out.println("맞췄습니다! +30000원");
			return money+30000;
		}else {
			System.out.println("틀렸습니다! +0원");
			return money;
		}
	}
	public int dice() {
		int ran = new Random().nextInt(6)+1;
		return ran;
	}
}
