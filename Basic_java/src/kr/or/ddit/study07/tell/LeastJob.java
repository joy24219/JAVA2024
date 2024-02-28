package kr.or.ddit.study07.tell;

public class LeastJob extends Schdeular {
	@Override
	public void getNextCall() {
		System.out.println("1-> 상담전화를 대기열에서 차례대로 가져옴");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("2-> 대기열에서 가장 짧은 상담원에게 상담전화 분배");
	}
}
