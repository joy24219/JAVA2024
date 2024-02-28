package kr.or.ddit.study06.sec02;

public class TvExample {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.company = "LG";
		t1.year = 2023;
		t1.size = 81.5;
		
		Tv t2 = new Tv();
		t2.company = "Samsung";
		t2.year = 2022;
		t2.size = 60;
		
		System.out.println(t1.company+", "+t1.size+", "+t1.year);
		System.out.println(t2.company+", "+t2.size+", "+t2.year);
	}
}
