package kr.or.ddit.study07;

public class PhoneExample {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.model = "폰";
		phone.color = "검정";
		
		System.out.println("smart");
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.model ="스마트폰";
		smartPhone.color ="흰색";
		smartPhone.call();
		smartPhone.internet();
		smartPhone.touch();
		
		System.out.println("dnb");
		DmbPhone dmbPhone = new DmbPhone();
		dmbPhone.call();
		dmbPhone.dmb();
		
		System.out.println("IPhone");
		IPhone iPhone = new IPhone();
		iPhone.camera();			
		System.out.println("IPhone2");
		IPhone2 iPhone2 = new IPhone2();
		iPhone2.camera();
	}
}
