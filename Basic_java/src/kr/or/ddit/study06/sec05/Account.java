package kr.or.ddit.study06.sec05;

public class Account {
	private static Account instance = null;

	private Account() {

	}

	public static Account getInstance() {
		if (instance == null) {
			instance = new Account();
		}
		return instance;
	}
	
	
	
	int money = 10000;
	
	public void getMoney(int num) {
		if(num>money) {
			System.out.println("잔고가 모자릅니다.");
			System.out.println("잔고 : "+money);
			return;
		}
		
		money -= num;
		System.out.println(num+"출금 되었습니다.");
		System.out.println("잔고 : "+money);
	}
}
