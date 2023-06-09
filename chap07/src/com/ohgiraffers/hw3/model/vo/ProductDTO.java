package com.ohgiraffers.hw3.model.vo;

import com.ohgiraffers.hw3.controller.ProductController;

public class ProductDTO {
	
	private int pId;
	private String pName;
	private int price;
	private double tax;
	
	public ProductDTO() {
		ProductController.count ++;
	}
	public ProductDTO(int pId, String pName, int price, double tax) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductController.count ++;
	}
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public String information() {
		return "pId : " + pId + ", pName : " + pName + ", price : " + price + ", tax : " + tax;
	}
	
	
	// 추가적으로 제품 삭제, 수정, 검색 등등의 메소드를 응용해서 추가해보세요~

	
	
}
