package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScannerExample {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScannerExample obj = new ScannerExample();
		obj.method1();
		
	}
	
	public void method2() {
		System.out.println("메소드2");
	}
	
	
	
	public void method1() {
		// 
		System.out.println("국어 점수를 입력하세요: ");
		String kor_str = sc.nextLine();
		System.out.println("영어 점수를 입력하세요: ");
		String eng_str = sc.nextLine();
		System.out.println("수학 점수를 입력하세요: ");
		String mat_str = sc.nextLine();
		
		
		int kor = Integer.parseInt(kor_str);
		int eng = Integer.parseInt(eng_str);
		int mat = Integer.parseInt(mat_str);
		
		int total = kor+eng+mat;
		double avg = (double)total/3;
		
		System.out.println("점수의 총합은 :"+total);
		System.out.println("점수의 평균은 :"+avg);
	}

}
