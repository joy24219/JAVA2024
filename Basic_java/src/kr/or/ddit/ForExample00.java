package kr.or.ddit;

import java.util.Scanner;

public class ForExample00 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample00 obj = new ForExample00();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
	}
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
//		for(int row=0; row<4; row++) {
//			for(int i=0; i<4-row-1; i++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<row+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		for(int row=1; row<=4; row++) {
			for(int i=1; i<=4-row; i++) {
				System.out.print(" ");
			}
			for(int j=1; j<=row; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		for(int row=1; row<=5; row++) {
			for(int i=1; i<=row-1; i++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5-row+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		for(int i=0; i<5; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.println("@");
			}
			System.out.println("@");
		}
		
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
	}
	
}
