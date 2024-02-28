package kr.or.ddit.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		// 1년은 365.2422일이다.
		// 1년은 xxx일 x시간 x분 x초 입니다. 출력할것
		
		double year = 365.2422;
		

		int days,hour,minute,second;
		double remainder;
		
		days = (int)year;
		remainder = year-days;		
		
		hour = (int)(24*remainder);
		remainder = 24*remainder;
		remainder = remainder-hour;	
		
		minute = (int)(60*remainder);
		remainder = 60*remainder;
		remainder = remainder-minute;	
		
		second = (int)(60*remainder);
		remainder = 60*remainder;
		remainder = remainder-second;
		
		
		System.out.println("1년은 "+days+"일 "+hour+"시간 "+minute+"분 "+second+"초 입니다");
		
		
		
		
	}
}
