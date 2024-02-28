package kr.or.ddit.study06.sec02;

import java.util.Scanner;

public class CircleExmaple {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 클레스하나 생성후 데이터를 입력 및 출력할것
		// 원의 넓이 = pi*r*r


		double PI = Math.PI;
		System.out.println(PI);
		
		Circle c1 = new Circle();
		
		c1.x = 0;
		c1.y = 0;
		c1.r = 10;
		c1.area = c1.r*c1.r*PI;
		
		System.out.println(c1);
	}
}
