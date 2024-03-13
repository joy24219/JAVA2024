package _06_class;

public class Class2 {
	/*
	 * 챕터 06. 클래스 
	 *	[클래스 ]에서 가장 중요한 포인트가 있습니다! 
	 *	
	 *	4. 오버로딩과 오버라이딩 
	 *	5. 싱글톤 
	 *
	 *	4. 오버러딩과 오버라이딩 
	 *		1) 오버로딩이란? 
	 *		 같은 이름의 군락/ 영역/ 기능 등을 여러개 선언하는 것 
	 *		외부에서 제공되는 다양한 데이터들을 이용해서 객체를 초기화하려면 생성자도 다양화될 필요가 있습니다. 
	 *		예를 들어 Car 객체를 생성할 때 외부에서 제공되는 데이터가 없다면 기본 생성자로 Car객체를 생성해야 하고, 
	 *		외부에서 별도의 1개의 데이터가 제공되거나 별도의 2개이상의 데이터가 제공될 경우에도 Car 객체를 생성할 수 있어야 합니다. 
	 *		생성자가 하나뿐이라면 이러한 요구 조건을 수용할 수 없다. 
	 *		그래서 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공한다.
	 * 
	 *		생성자 오버로딩이란, 매개변수를 달리하는 생성자를 여러 개 선언하는것을 말한다.
	 * 
	 *		2) 오버라이딩이란? 
	 *		부모 클래스로부터 상속받은 메소드의 내용을 재정의 (변경) 하는 것
	 * 
	 * */
	public static void main(String[] args ) { 
		KiaCar kiaCar = new KiaCar(); 
		kiaCar.setName ("아반떼"); 
		kiaCar.setMaxSpeed (100) ; 
		kiaCar.drive();
		kiaCar.stop();
	}
}

// 부모클레스
// 오버라이드 연습해보기
// Car클래스를 부모 클래스로 설계합니다. 
//KiaCar, Hyundai Car를 자식 클래스로 설계합니다.
//자식 클래스는 부모 클래스인 Car 클래스를 상속받아서 부모가 가지고 있는 기능을 사용할 수 있다.
class Car{
	private String color;
	private String oilType;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOilType() {
		return oilType;
	}
	public void setOilType(String oilType) {
		this.oilType = oilType;
	}
	public void drive() {
		System.out.println("출발합니다!");
	}
	public void stop() {
		System.out.println("멈춥니다!");
	}
	
}

class KiaCar extends Car{
	private int maxSpeed;
	private String name;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String nameString) {
		this.name = nameString;
	}
	@Override
	public void drive() {
		System.out.println(name + " 자동차가 출발합니다!");
	}
	@Override
	public void stop() {
		System.out.println(name + " 자동차가 멈춥니다!");
	}
	
	
}