package _06_class;

public class ClassTest01 {
	public static void main(String[] args) {
		
		Student std1 = new Student();
		std1.setName("홍길동");
		std1.setAge(20);
		std1.setBan("304호");
		
		System.out.print("학생이 실행한 기능은 ");
		std1.work();
	}
}
class Person1{
	String name;
	int age;
	
	public Person1() {}
	public Person1(String name) {}
	
	public void work() {
		System.out.println("부모에서 실행합니다. / 걷다");
	}
	public void run() {
		System.out.println("부모에서 실행합니다. / 뛰다");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Student extends Person1{
	String ban;
	
	public Student() {}
	
	
	@Override
	public void work() {
		System.out.println("자식에서 실행합니다. / 걷다");
	}
	@Override
	public void run() {
		System.out.println("자식에서 실행합니다. / 뛰다");
	}


	public String getBan() {
		return ban;
	}


	public void setBan(String ban) {
		this.ban = ban;
	}
	
}