package _06_class;

import java.util.Arrays;
import java.util.Scanner;

public class Class1 {
	/*
	 *  챕터 06. 클래스 
	 *	[클래스 ]에서 가장 중요한 포인트가 있습니다! 
	 *	1. 클래스란? 
	 *	2. 클래스 3대 요소 
	 *	3. 클래스 사용 방법
	 *
	 *	----------------------------
	 *	 
	 *	1. 클래스란? 
	 *
	 *		1) 클래스란? 
	 *		- 객체라고도 하며, 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있으면서 
	 *		식별 가능한 것을 말합니다. 
	 *		2) 인스턴스 
	 *		자바에서 설계도라고 하는것이 바로 클래스인데, 클래스에는 객체를 생성하기 위한 필드와 메소드가 정의되어 있습니다. 
	 *		클래스로부터 만들어진 객체를 해당 클래스의 인스턴스라고 합니다. 
	 *		그리고, 인스턴스를 만들어내는 과정이 인스턴스화라고 합니다. 
	 *		ex) Product product = new Product(); (인스턴스화 과정)
	 *		> 인스턴스화 과정을 통해서 만들어진 product가곧! 인스턴스다! 인스턴스! ! !! 인스턴스 !
	 *  2. 클래스 3대요소
	 *  
	 *  	1) 필드
	 *  	- 필드는 객체의 고유데이터, 부품객체 , 상태정보를 저장하는 곳이다.
	 *  	- 선언 형태는 변수와 비슷하지만, 필드는 변수라고 부르지 않는다.
	 *  
	 *  	2) 생성자
	 *  	- 생성자는 new 연산자로 호출되는 특별한 중괄호{} 블록이다. 
	 *  	- 생성자의 역활은 객체 갯어시, 초기화를 담당합니다.
	 *  
	 *  	3) 메소드
	 *  	- 메소드는 객체의 동작에 해당하는 중괄호 {} 블록을 말합니다.
	 *  	- 메소드를 호출하게 되면 중괄호 블록에 잇는 모든 코들들이 일괄적으로 실행됩니다.
	 *  3. 클래스 사용방법
	 *  	1)클래스 선언
	 *  	- 클래스명 변수명;
	 *  	2)클래스 생성
	 *  	- 클래스명 변수명 = new 클래스명();
	 *  
	 *  
	 *  public class Person{
	 *  	//필드 부분
	 *  	privat String name ;
	 *  	privat int age ;
	 *    	privat String gender;
	 *    	privat int classNum;
	 *      privat String phone;
	 *  }
	 *  
	 *  // 기본 생성자 부분
	 *  public Person(){} // 기본생성자는 생략이 가능
	 *  
	 *  // 커스텀 생성자
	 *  public Person(String name){
	 *  	this.name = name;
	 *  }
	 *  
	 *  //메소드 부분
	 *  public void setName(String name){
	 *  	this.name = name;
	 *  }
	 *  public String setName(){
	 *  	return name;
	 *  }
	 *  
	 * */

	Person[] ps = new Person[50];
	int maxPs = 0;
	
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		c1.question2();
	}
	public void question1() {
		// 문자열 타입의 크기 17인 배열 생성
		String[] arr = new String[17];
		arr[0] = "정윤지";
		arr[1] = "이성훈";
		arr[3] = "추은주";
		
		String[] names = {
				"정윤지","이성훈", "추은주", "김성도", "추현주", "신동민","이준수", "장수연",
				"임승환","길도연","추석준", "김용호","양학균","장민","정보규","황혜원",
				"김은혜","조현준"
		};
		
		// 생성한 배열에 17명의 Person 객체를 만들어보세요.
		
		Person[] personArr = new Person[17];
		for(int i=0; i<personArr.length; i++) {
			Person person = new Person();
			person.setName(names[i]);
			personArr[i] = person;
		}
		for (int i = 0; i < personArr.length; i++) {
			if (i%2 ==0) { // index 짝수 이름만.
				System.out.println(personArr[i].getName());
			}
		}
		// 문제 1)
		// index 5의 배수에 해당하는 Person 객체에 age를 25으로 넣고 
		// 5의 배수에 해당하는 Person 객체에 name과 age를 출력해주세여.
		// 출력예시)
		// index 5 - person
		// 이름 : 홍길동 | 나이 : 25
		
		int age = 25;
		for(int i=0; i<personArr.length; i++) {
			if (i%5==0) {
				Person person = new Person();
				person.setName(names[i]);
				person.setAge(age);
				personArr[i] = person;
				
				System.out.println("index "+i+"-Person\n이름 : "+personArr[i].getName()+" | 나이 : "+personArr[i].getAge());
			}
		}
	}
	public void question2() {
		Scanner sc = new Scanner(System.in); 
		// 문제 2)
		// 1.학생추가 2.학생조회 3.학생변경 4.학생삭제 5.전체조회 6.학급반 조회 7.종료
		// 학생의 필드는 이름, 나이, 성별, 전화번호, 이메일 , 학급반으로 구성되어 있습니다.
		
		int sel = 0;
		
		while (true) {
			System.out.println("                학급관리                ");
			System.out.println("────────────────────");
			System.out.println("────────────────────");
			System.out.println(" 1. 학생추가");
			System.out.println(" 2. 학생조회");
			System.out.println(" 3. 학생변경");
			System.out.println(" 4. 학생삭제");
			System.out.println(" 5. 전체조회");
			System.out.println(" 6. 학급조회");
			System.out.println(" 7. 종료");
			System.out.println("────────────────────");
			System.out.println("────────────────────");
			System.out.print(" 입력(숫자만) : ");
			if (sc.hasNextInt()) {
		        sel = sc.nextInt();
		    } else {
		        System.out.println("숫자를 입력하세요.");
		        sc.next(); // 잘못된 입력을 소비하여 무한 루프 방지
		        continue;
		    }
			switch (sel) {
				case 1:	add(maxPs);
				case 2:	inquiry();
				case 3:	change();
				case 4:	delete();
				case 5:	allInquiry();
				case 6:	classInquiry();
				case 7:	end(); break;
				default: System.out.println("입력 값을 확인해 주세요."); 
			}
		}
		
	}
	public void add(int maxPs) {
		Scanner scAdd = new Scanner(System.in);
		// 1. 학생 추가를 선택할 시. // 학생 1명의 정보를 추가
		maxPs++;
		Person p = new Person();
		String name; int age; String gender; int classNum; String phone;
		
		System.out.print("\n이름을 입력하세요 : ");
		name = scAdd.next();
		p.setName(name);
		
		System.out.print("\n나이를 입력하세요 : ");
		age = scAdd.nextInt();
		p.setAge(age);
		
		System.out.print("\n성별를 입력하세요 : ");
		gender = scAdd.next();
		p.setGender(gender);
		
		System.out.print("\n학급번호를 입력하세요 : ");
		classNum = scAdd.nextInt();
		p.setClassNum(classNum);
		
		System.out.print("\n전화번호를 입력하세요 : ");
		phone = scAdd.next();
		p.setPhone(phone);
		
		ps[maxPs] = p;
		
		System.out.println(ps[maxPs].getName());
	}
	public void inquiry() {
		Scanner scInq = new Scanner(System.in);
		// 2. 학생 조회를 선택할 시.
		// 학생의 이름을 입력받아서 해당 학생의 정보를 조회합니다.
		// 조회하신 학생의 이름은 [홍길동] 입니다.
		//------------------------------------------------
		// 이름 	: 홍길동
		// 나이 	: 25
		// 성별 	: 남자
		// 전화번호 : 010-1234-1234
		// 이메일   : ddit@naver.com
		// 학급반 	: 304호
		
		System.out.print("\n조회할 이름을 입력하세요 : ");
		String name = scInq.next();
		for (int i = 0; i < maxPs; i++) {
		}
	}
	public void change() {
		// 3. 학생변경을 선택 할시,
		// ┌─────────────────────┐
		// │  번호  │    이름    │  나이  │  성별  │
		// │--------│------------│--------│--------│		
		// │    1   │   홍길동   │   25   │  남자  │
		// │    2   │   홍길순   │   25   │  여자  │
		// │    3   │   유재석   │   25   │  남자  │
		// │    4   │   정형돈   │   25   │  남자  │
		// .....
		// 번호 또는 이름을 입력받아서, 선택한 학생의 이름, 나이, 성별, 전화번호, 이메일 중 하나를 선택해서 변경하도록 합니다.
		// 1. 이름  2. 나이  3. 성별  4. 전화번호  5. 이메일
		// 총 5개의 메뉴중 선택해 변경하도록 합니다.
	}
	public void delete() {
		// 4. 학생 삭제
		// ┌─────────────────────┐
		// │  번호  │    이름    │  나이  │  성별  │
		// │--------│------------│--------│--------│		
		// │    1   │   홍길동   │   25   │  남자  │
		// │    2   │   홍길순   │   25   │  여자  │
		// │    3   │   유재석   │   25   │  남자  │
		// │    4   │   정형돈   │   25   │  남자  │
		// ......
		// 번호 또는 이름을 입력받아서, 해당 학생을 삭제합니다.
	}
	public void allInquiry() {
		// 5. 전체조회
		// ┌─────────────────────┐
		// │  번호  │    이름    │  나이  │  성별  │
		// │--------│------------│--------│--------│		
		// │    1   │   홍길동   │   25   │  남자  │
		// │    2   │   홍길순   │   25   │  여자  │
		// │    3   │   유재석   │   25   │  남자  │
		// │    4   │   정형돈   │   25   │  남자  │
		// ......
		// 등록된 학생 모두를 출력합니다.
	}
	public void classInquiry() {
		// 6. 학급반 조회
		// 학급반을 입력하게 하고 예를 들어 '304호'를 입력하면 
		// 304호 학생들만 목록에 나타나게 해주세요.
	}
	public void end() {
		// 7. 종료를 선택 시, 프로그램이 종료됩니다.
	}
}

class Person{
	private String name ;
	private int age ;
	private String gender;
	private int classNum;
	private String phone;
	
 
	// 기본 생성자 부분
	public Person(){}
	
	// 생성자 부분 // 오버로딩이 존재할 때 기본생성자는 필수
	public Person(String name, int age, String gender, int classNum, String phone){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.classNum = classNum;
		this.phone = phone;
	}
	
	//getter, setter 메소드 (public이 아닌 private 필드를 받기위해)
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int setClassNum() {
		return classNum;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
}
