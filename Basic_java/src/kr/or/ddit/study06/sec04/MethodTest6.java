package kr.or.ddit.study06.sec04;

import java.util.Date;

public class MethodTest6 {
	public static void main(String[] args) {
		MethodTest6 mt = new MethodTest6();
		mt.process();
	}
	public void process() {
//		System.out.println(method1());
//		System.out.println(method1(10));
//		System.out.println(sum(5));
		
		Date d1 = new Date();
		System.out.println(febo(4));
		Date d2 = new Date();
		System.out.println(d2.getTime()-d1.getTime()+"ms");
	}
	public int method1() {
		//1*2*3*....10
		
		int ans = 1;
		for(int i=1; i<=10; i++) {
			ans *=i;
		}
		return ans;
	}
	
	public int method1(int num) {
		//1*2*3*....10
		
		if(num==1) return 1;
		return num*method1(num-1);
	}
	
	public int sum(int num) { // 재귀함수 사용시 코드가 단순해짐
		//1+2+3+...num   // 재귀함수에서는 종료조건이 필수
		return num==1? 1 : num+sum(num-1); // 단계별로 어떤것을 줄것인지
	}
	// 피보나치 수열 구하기
	// 1 1 2 3 5 8 13 21 34 55....
	// 2 = 1+1
	// 3 = 2+1
	// 5 = 3+2
	
	long[] feboResult = new long[10000]; 
	
	public long febo(int n) { 
		if(n<=2) return 1 ;
		long f1 =feboResult[n-1];
		long f2 =feboResult[n-2];
		if(f1 == 0)  {
			f1 = febo(n-1);
			feboResult[n-1] = f1;
		}
		if(f2 == 0) {
			f2 = febo(n-2);
			feboResult[n-2] =  f2;
		}
		return f1+f2; 
	}
	
//	public long febo(int num) { 
//		//1+2+3+...num   
//		if(num==1 || num==2) return 1;
//		return febo(num-2)+febo(num-1); 
//	}
	
}
