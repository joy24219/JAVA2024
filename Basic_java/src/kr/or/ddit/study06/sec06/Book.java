package kr.or.ddit.study06.sec06;

public class Book {
	// 책이름 저자 출판사 출판일
	// toString get/setter 만들어서 3권 호출해볼것
	
	private String name;
	private String writer;
	private String publisher;
	private String pubDate;
	
	
	
	
	public Book(String name, String writer, String publisher, String pubDate) {
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.pubDate = pubDate;
	}
	
	public Book() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + ", publisher=" + publisher + ", pubDate=" + pubDate + "]";
	}
	
	
	
}
