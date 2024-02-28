package kr.or.ddit.homework.home10;

public class Cylinder {
	int height = 10 ;
	int circle;
	int cylinder;
	
	public Cylinder() {
		Circle c1 = new Circle(5);
		this.circle = (int)(c1.area);
		this.cylinder = circle*height;	
	}

	@Override
	public String toString() {
		return "Cylinder [height=" + height + ", circle=" + circle + ", cylinder=" + cylinder + "]";
	}


	
}
