package kr.or.ddit.study07.animal;

public abstract class Animal {
	String jong;
	
	public abstract void cry();
	// 모든 동물의 울음소리는 존재하지 않음
	// 때문에 자식클레스에서 작업
	// 미구현 상태 abstract를 사용.
	
}
