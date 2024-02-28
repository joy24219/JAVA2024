package kr.or.ddit.study06.sec05;

public class BigLoadSingleTon {
	private static BigLoadSingleTon instance = null;

	public BigLoadSingleTon() {		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static BigLoadSingleTon getInstance() {
		if (instance == null) {
			instance = new BigLoadSingleTon();
		}
		return instance;
	}
}
