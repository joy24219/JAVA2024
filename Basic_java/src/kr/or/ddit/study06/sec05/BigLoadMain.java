package kr.or.ddit.study06.sec05;

import java.util.Date;

public class BigLoadMain {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("클래스를 생성합니다");
		BigLoadSingleTon bs1 = BigLoadSingleTon.getInstance();
		
		System.out.println("클래스를 생성합니다");
		BigLoadSingleTon bs2 = BigLoadSingleTon.getInstance();
		
		System.out.println("클래스를 생성합니다");
		BigLoadSingleTon bs3 = BigLoadSingleTon.getInstance();
		Date date2 = new Date();
		
		BigLoadSingleTon aaaaaaaaa = BigLoadSingleTon.getInstance();
		
		
		System.out.println(date2.getTime()-date.getTime()+"ms");
	}
}
