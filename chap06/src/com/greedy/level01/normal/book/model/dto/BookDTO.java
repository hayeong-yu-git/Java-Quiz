package com.greedy.level01.normal.book.model.dto;

public class BookDTO {
	
	//필드
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	//기본생성자
	public BookDTO() {}

	
	//매개변수가 있는 생성자
	public BookDTO(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public BookDTO(String title, String publisher, String author, int price, double discountRate) { //오버로딩
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}

	
	//setter, getter 메소드
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	
	//출력용 메소드 추가
	public void printInformation() {
		System.out.println(this.title + ", " + this.publisher + ", " + this.author + ", " + this.price + ", " + this.discountRate); 
	}
	
	
	
}
