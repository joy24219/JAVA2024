package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork13 {
	 public static void main(String[] args) {
		 Reserve r = Reserve.getInstance();
		 Person p = new Person();
		 r.resevation(p);
	}
}
class Person{ String name; }
class Reserve{
	Scanner sc = new Scanner(System.in);
	Person person = null;

	private static Reserve instance = null;
	private Reserve() {}
	public static Reserve getInstance() {
		if (instance == null) instance = new Reserve();
		return instance;
	}
	// 싱글톤 활용할것.
	
	
	public void resevation(Person p) {
		int choice = 0;
		
		
		while(true) {
			System.out.println("\n미용실 예약시스템");
			System.out.println("1.예약");
			System.out.println("2.완료");
			System.out.println("3.종료");
			choice = sc.nextInt();
			
			if(choice==1) {
				if(p.name!=null) { 
					System.out.println(p.name+"님이 예약중입니다."); 
				}else {
					System.out.print("예약자명 입력 : ");
					sc.nextLine(); // 버퍼비우기
					p.name = sc.nextLine();	
					System.out.println("\n"+p.name+"님으로 예약이 되었습니다.");					
				}						
			}else if(choice==2) {
				p.name = out(p.name);
				
			}else if(choice==3) {
				System.out.println("종료됩니다.");
				break;
			}else{
				System.out.println("입력값을 확인해 주세요.");
			}
		}
		
	}
	
	public String out(String chk) {
		if(chk==null) {
			System.out.println("예약완료 할 사람이 없습니다.");
		}else {
			System.out.println(chk+"님의 예약을 완료하였습니다.");
			chk = null;	
		}
		return chk;
	}
}
