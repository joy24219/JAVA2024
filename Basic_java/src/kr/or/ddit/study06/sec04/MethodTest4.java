package kr.or.ddit.study06.sec04;

public class MethodTest4 {
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		
		mt.add(10, 10);
		mt.add(10.5, 10);
		mt.add(10f, 10f);
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public float add(float a, float b) {
		return a+b;
	}
}
