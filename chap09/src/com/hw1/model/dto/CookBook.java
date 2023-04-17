package com.hw1.model.dto;

public class CookBook extends Book {
	
	private boolean coupon;
	
	public CookBook() {}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", " + this.isCoupon();
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


	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	

	

}
