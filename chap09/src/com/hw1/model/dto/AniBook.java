package com.hw1.model.dto;

public class AniBook extends Book {
	
	private int accessAge;
	
	public AniBook() {}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	@Override
	public String toString() {
		return super.toString()  + ", " + this.getAccessAge();
	}

	
	//getter, setter
	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}

	@Override
	public String getAuthor() {
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		super.setAuthor(author);
	}

	@Override
	public String getPublisher() {
		return super.getPublisher();
	}

	@Override
	public void setPublisher(String publisher) {
		super.setPublisher(publisher);
	}
	

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	
	

	
	
	
	

}
