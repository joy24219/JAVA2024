package kr.or.ddit.study06.sec05;

public class AccountMain {
	public static void main(String[] args) {
		Account a1 = Account.getInstance();
		Account a2 = Account.getInstance();
		Account a3 = Account.getInstance();
		a1.getMoney(10000);
		a2.getMoney(10000);
		a3.getMoney(10000);
	}
}
