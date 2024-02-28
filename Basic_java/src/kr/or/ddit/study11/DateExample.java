package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
	}
	public void method1() {
		Date date = new Date();
		System.out.println(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date date2 = new Date();
		System.out.println(date2);
		
		long time = date2.getTime() - date.getTime();
		System.out.println(time);
		
		System.out.println(date.getTime());
		
	}
	public void method2() {
		//Date의 getTime은 특정 시점으로 부터 지난 시간이다. 
		//몇년 며칠 몇시간 몇분 몇초 지났는지 출력해보시오.
		Date date = new Date();
		int[] d = new int[5];
		double sec = date.getTime()*100;
		
		
		
//		d[0] = (int) (sec/365);
//		d[1] = d[0]/12;
//		d[2] = ;
//		d[3] = ;
//		d[4] = ;
		
		System.out.println("기준으로 부터"+d[0]+"년 "+d[1]+"일 "+d[2]+"시 "+d[3]+"분 "+d[4]+"초 가 지났습니다.");
		
	}
	public void method3() {
		Date date = new Date();
		
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
		
		
		// Date -> String
		// format(date)
		String result = sdf.format(date);
		System.out.println(result);
	}
	public void method4() {

		Date now = new Date();
//		System.out.println(now);
		String str = "2024.09.23";
		
		// String -> Date
		// parse(String)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("d");
		
		try {
			Date date = sdf.parse(str);
			System.out.println(new Date(date.getTime() - now.getTime()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void method5() {
		// 앞으로 백일뒤는 몇일 일까?
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");
		Date d1 = new Date();
		System.out.println(sdf.format(d1));
		Date d2 = new Date(d1.getTime()+(long)1000*60*60*24*100);
		System.out.println(sdf.format(d2));
		
	}
	public void method6() {
		Calendar cal = Calendar.getInstance();
//		cal.add;
//		cal.add(Calendar.MONTH,1);
//		cal.set;
		cal.set(Calendar.YEAR, 2025);
		
		Date date = cal.getTime();
		System.out.println(date);
	}
}
