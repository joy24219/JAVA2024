package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0,0,10,0,0,10);
		System.out.println(t1);
		
		Point p1 = new Point(0, 0);
		
		Triangle t2 = new Triangle(p1, new Point(10,0), new Point(0,10));
		//변수명을 선언하지 않아도 이미 클레스 값이 선언되어 있기 때문에 관계가 없음.
		
		
		System.out.println(t2);
	}
	
}
