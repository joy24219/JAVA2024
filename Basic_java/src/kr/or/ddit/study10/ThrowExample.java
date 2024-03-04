package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) {
		ThrowExample te = new ThrowExample();
		try {
			String nickname = te.inputNuck();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String inputNuck() throws Exception{
		Scanner sc = new Scanner(System.in);
		String nickname =sc.next();
		if(nickname.contains("18")) {
			throw new Exception();
		}
		
		return nickname;
	}
}
