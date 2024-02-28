package kr.or.ddit.homework.home10;

public class Circle {
	double pi = Math.PI;
	double radious;
	double area;
	
	//원의 넓이 구하는 생성자 만들것
	//원의 넓이 반지름 * 반지름 * PI
	
	public Circle(double radious) {
		this.area = radious*radious*pi;
	}
	
}
