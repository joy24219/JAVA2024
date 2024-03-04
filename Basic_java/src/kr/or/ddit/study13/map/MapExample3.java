package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapExample3 {
	// 히스토그램 과제 맵으로 바꾸기.
	public static void main(String[] args) {
		MapExample3 me = new MapExample3();
		me.process();
	}
	public void process() {
		printHistoGram(100);
	}
	
	public void printHistoGram(int num) {
		Random random = new Random();
		Map<Integer, Integer> resultMap = new HashMap();
		for(int i=0; i<num; i++) {
			int rollDice = random.nextInt(6)+random.nextInt(6)+2;
			int sum = 1;
			if(resultMap.containsKey(rollDice)) sum+=resultMap.get(rollDice);
			resultMap.put(rollDice, sum);
		}
		for(int i=2; i<=12; i++) {
			for(int star=0; star<100*resultMap.get(i)/num; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
