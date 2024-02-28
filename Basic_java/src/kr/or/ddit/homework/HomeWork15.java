package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork15 {
	public static void main(String[] args) {
		HomeWork15 hw = new HomeWork15();
		hw.process();
	}
	
	public void process() {
		// 주사위 2개 던진 전체 값을 히스트그램으로 나타내기
		Scanner sc = new Scanner(System.in);
		System.out.print("시행횟수를 입력하세요 : ");
		
		printHistoGram(sc.nextInt());
	}
	public int dice() {
		int ran = new Random().nextInt(6)+1;
		return ran;
	}
	//시행 회수 n 리턴 값 완성
	public int[] rollNum(int num) {
		int[] ans = new int[num];
		int[] val = new int[11];
		for(int i=0; i<num; i++) {
			ans[i] = dice() + dice();
			for(int j=0; j<11; j++) {
				if(ans[i]==j+2) {val[j]++;}
			}
		}
		return val;	 
	}
	
	public void printHistoGram(int num) {
//		rollNum(num);
		for(int i=0; i<11; i++) {
			int turn =(int)((double)rollNum(num)[i]/num*100);
			System.out.print(i+2+"\t");
			for(int j=0; j<turn; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
