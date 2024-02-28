package kr.or.ddit.study06.sec04;

public class MethodTest5 {
	public static void main(String[] args) {
		MethodTest5 mt = new MethodTest5();
		mt.method1();
		mt.method2(10);
	}
	public boolean method1() {
		return true;
	}
	public int method2(int num) {
		int sum=0;
		if(num%2==0) {
			for (int i=2; i<=num; i+=2) sum+=i;
		}else if(num%2==1) {
			for (int i=2; i<=num; i+=2) sum+=i;
		}
		return sum;
	}
	public void method3() {
		return;
	}
}
