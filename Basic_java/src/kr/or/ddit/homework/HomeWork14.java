package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork14 {
	public static void main(String[] args) {
		HomeWork14 hw = new HomeWork14();
		hw.process();
	}
	
	Mem[] memList = new Mem[100];
	int cur =0; 
	public void process() {
		Scanner scPrcs = new Scanner(System.in);
		System.out.println("!!회원관리 시스템!!");
		while(true) {
			System.out.println("\n1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 전체 정보 출력");
			System.out.println("5. 종료");
			
			System.out.print("입력 : ");
			
			int cho = scPrcs.nextInt();
			if(cho==1) addMember();
			else if(cho==2) removeMember();
			else if(cho==3) updateMember();
			else if(cho==4) printListMember();
			else if(cho==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력값을 확인해 주세요.\n");
			}
		}
	}
	
	public void addMember() {
		Mem mem = new Mem();
		Scanner scAdd = new Scanner(System.in);
		
		System.out.print("\n아이디 입력 : ");
		String id = scAdd.next();
		mem.setId(id);
		
		System.out.print("비밀번호 입력 : ");
		String pw = scAdd.next();
		mem.setPass(pw);
		
		System.out.print("이름 입력 : ");
		String name = scAdd.next();
		mem.setName(name);		
		
		System.out.print("나이 입력(숫자만) : ");
		int age = scAdd.nextInt();
		mem.setAge(age);
		
		System.out.println("\n"+mem);
		
		memList[cur++] = mem;
		scAdd.close();
	}
	
	public void removeMember() {
		Scanner scDel = new Scanner(System.in);
		printListMember();
		
		// 삭제
		System.out.print("삭제 할 회원 번호 입력 : ");
		int num = scDel.nextInt();
		num = num-1;
		
		if(memList[num] == null) {
			System.out.println("회원번호를 확인해주세요!");
			return;
		}
		
		Mem[] thmeList= new Mem[memList.length - 1];
		for(int i=0, j=0; i< memList.length; i++) {
			if(i==num) continue;
			thmeList[j++] = memList[i];
		}
		
		memList = thmeList;
		
		System.out.println("삭제되었습니다!");
		scDel.close();
	}
	
	public void updateMember() {
		Scanner scUpDate = new Scanner(System.in);
		printListMember();
		
		// 수정 적용
		System.out.print("수정할 회원 번호 입력 : ");
		int num = scUpDate.nextInt();
		num = num-1;
		
		if(memList[num] == null) {
			System.out.println("회원번호를 확인해주세요!");
			return;
		}
		
		System.out.print("\n아이디 입력 : ");
		String id = scUpDate.next();
		memList[num].setId(id);
		
		System.out.print("비밀번호 입력 : ");
		String pw = scUpDate.next();
		memList[num].setPass(pw);
		
		System.out.print("이름 입력 : ");
		String name = scUpDate.next();
		memList[num].setName(name);	
		
		System.out.print("나이 입력(숫자만) : ");
		int age = scUpDate.nextInt();
		memList[num].setAge(age);

		System.out.println("수정되었습니다!");
		scUpDate.close();
	}
	
	public void printListMember() {
		System.out.println("");
		for(int i=0; i<cur; i++) {
			Mem mem = memList[i];
			if(memList[0] == null ) {
				System.out.println("조회할 정보가 없습니다.");
				return;
			}
			if(memList[i] != null ) {
				System.out.println(i+1+"번"+mem);
			}
		}
		System.out.println("");
	}
	
	
}
class Mem{
	private String id;
	private String pass;
	private String name;
	private int age;
	

	public Mem(String id, String pass, String name, int age) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
	}
	public Mem() {}
	
	public String getId() { return id; }
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPass() { return pass; }
	public void setPass(String pass) {
		
		this.pass = pass;
	}
	
	public String getName() { return name; }
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() { return age; }
	public void setAge(int age) {
		if(age<0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		this.age = age;
	}

	@Override
	public String toString() {
		return "정보 [id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + "]";
	}
	
}