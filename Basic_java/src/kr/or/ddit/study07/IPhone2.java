package kr.or.ddit.study07;

public class IPhone2 extends IPhone{
	
	//ctrl+스페이스
	@Override 
	public void camera() {
		super.camera(); //부모에 있는 카메라 기능
		System.out.println("모션 인식 기능 추가");		
	}
}
