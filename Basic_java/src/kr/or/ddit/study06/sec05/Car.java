package kr.or.ddit.study06.sec05;

import java.util.Scanner;

public class Car {
	int gas;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(gas>0) {
			gas-=1;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(gas<3) {
				System.out.println("연료가 부족합니다?");
				System.out.println("주유하시겠습니까? (y/n)");
				String yn = sc.next();
				
				if(yn.equals("y")) {
					System.out.println("얼만큼 주요하시겠습니까?");
					gas+=sc.nextInt();
				}
			} 
			System.out.println("운행중...");
			
		}
	}
}
