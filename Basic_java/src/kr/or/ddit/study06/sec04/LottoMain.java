package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {
	public static void main(String[] args) {
		LottoMain lm = new LottoMain();
		
//		System.out.println(Arrays.toString(lm.generateLotto()));
//		int[] lotto = lm.generateLotto();
//		System.out.println(Arrays.toString(lotto));
		
//		System.out.println(Arrays.deepToString(lm.lottoPaper()));
//		int[][] paper = lm.lottoPaper();
//		for(int[] lotto:paper) {
//			System.out.println(Arrays.toString(lotto));
//		}

//		System.out.println(Arrays.deepToString(lm.lottoBundel(10000)));

		int[][][] bundel = lm.lottoBundel(20000);
		lm.printBundle(bundel);
		
	}
	
	public void printBundle(int[][][] bundle) {
		for(int [][] paper: bundle) {
			System.out.println("================================");
			for(int[] lotto:paper) {
				System.out.println(Arrays.toString(lotto));
			}
			System.out.println("================================");
		}
	}
	
	public int[][][] lottoBundel(int money) {
		int papers = money/5000;
		int nmg = (money%5000)/1000;
		if(nmg != 0) papers++;
		
		int[][][] bundel = new int[papers][5][6];
		
		for(int i=0; i<papers; i++) {
			if(nmg != 0 && i==papers-1) bundel[i] = lottoPaper(nmg);
			else bundel[i] = lottoPaper();
		}
		return bundel;		
	}
	
	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];
		
		for(int i=0; i<paper.length; i++) {
			paper[i] = generateLotto();
		}
		return paper;
	}
	
	public int[][] lottoPaper() {
		return lottoPaper(5);
	}
	
	public int[] generateLotto() {
		//로또 번호 6개 만들고 리턴할것.
		
		int[] lotto = new int[6];
		
		//
		for(int i=0; i<lotto.length; i++) {
			int ran =new Random().nextInt(45)+1;
			lotto[i] = ran;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) 
				{
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	public void sort(int[] lotto) {
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=0; j<lotto.length-1; j++) {
				if(lotto[j] > lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
	}
	public String arrayToString(int[] lotto) {
		String result = "[ ";
		
		for(int i=0; i<lotto.length; i++) {
			result+=lotto[i];
			if(i!=lotto.length-1) result+=", ";
		}
		result+=" ]";
		return result;
	}
}
