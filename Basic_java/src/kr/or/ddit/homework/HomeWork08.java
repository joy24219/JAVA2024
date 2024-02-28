package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}
	
	public void process() {
		// 5명의 3과목 성적과 이름을 배열에 저장하고
		// 총점, 평균, 등수를 구하여 출력하시오.
		
		String[] stuName = {"미연", "민니", "소연", "우기", "슈화"};
		// 국어 영어 수학 총점 평균 등수
		
		int[][] scores = {{80,70,80,0,0,1},
						  {90,85,90,0,0,1},
						  {90,70,75,0,0,1},
						  {65,75,70,0,0,1},
						  {80,80,70,0,0,1}};
		
		// 1 총점 구하기 // 2 평균 구하기
		for(int people = 0; people<scores.length; people++) {
			int sum = scores[people][0]+scores[people][1]+scores[people][2];
			scores[people][3] = sum;
			scores[people][4] = sum/3;
		}
		
		// 5 정렬하기// 3 등수 구하기
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores.length; j++) {
				if(j!=scores.length-1) {
					if(scores[j][4]<scores[j+1][4]) {
						int[] temp = scores[j];
						scores[j] = scores[j+1];
						scores[j+1] = temp;
						
						String tempTxt = stuName[j];
						stuName[j] = stuName[j+1];
						stuName[j+1] =tempTxt;
					}
				}
			}
			if(i!=0) {				
				if(scores[i][4] == scores[i-1][4]) {scores[i][5] = i;}
				else {scores[i][5] = i+1;}
			}
		}
				
		// 4 출력하기 // 6 출력하기
		System.out.println("\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("=====================================================================");		
		for (int i=0; i<scores.length; i++) {
			System.out.print("\t"+stuName[i]+"\t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
