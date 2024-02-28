package kr.or.ddit.study06.sec06;

public class BookExample {
	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.setName("책");
		b1.setPubDate("책");
		b1.setWriter("책");
		b1.setPublisher("책");
		
		System.out.println(b1);
		System.out.println(b1.getName());
	}
}
