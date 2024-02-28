package kr.or.ddit.homework.home10;

public class Tv {
	String company;
	int year;
	int size;
	
	public Tv(String company,int year, int size){
		this.company=company;
		this.year=year;
		this.size=size;
	}

	@Override
	public String toString() {
		return "Tv [company=" + company + ", year=" + year + ", size=" + size + "]";
	}
}
