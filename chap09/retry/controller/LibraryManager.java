package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {
	
//	private Member mem;
	private Member mem = null;
	
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	public void inserMember(Member mem) { //Member객체의 주소값mem을 인자로 받아서
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;//주소 반환
	}
	
	public Book[] searchBook(String keyword) { //키워드를 인자로 받아서
		Book[] searchList = new Book[5];
		int cnt = 0;
		for(Book b : bList) {
			if(b.getTitle().contains(keyword)) {
				searchList[cnt] = b;
				cnt++;
			}
		}
		return searchList; //주소반환
	}
	
	public int rentBook(int index) { //index를 인자로 받아서
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			
			if(((AniBook) bList[index]).getAccessAge()>mem.getAge()) 
				result = 1;
			
		} else if(bList[index] instanceof CookBook) {
			if(((CookBook) bList[index]).isCoupon())
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
		}
		
		return result; //조건별로 다른 int 값을 반환
	}

	
	
	
	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Book[] getbList() {
		return bList;
	}

	public void setbList(Book[] bList) {
		this.bList = bList;
	}
	
	
 
}
