package kr.or.ddit.study07.tell;

public class PriorityAllocation extends Schdeular {
	@Override
	public void getNextCall() {
		System.out.println("우선순위가 높은 상담전화를 대기열에서 가져옴.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 가장 우수한 상담원에게 상담전화 분배");
	}
}
