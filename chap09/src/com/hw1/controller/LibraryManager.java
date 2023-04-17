package com.hw1.controller;

import java.util.Scanner;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {
	
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return this.mem;
	}
	
	public Book[] selectAllOfManager() {
		return this.bList;
	}
	
	public Book[] searchBookOfManager(String keyword) {
		//검색된 도서를 담아줄 객체배열 생성
		Book[] searchArr = new Book[5];
		
		//bList에 keyword가 포함되어있는지 비교하여 검색도서 배열에 담기
		int count = 0;
		for(Book b : bList) {
			
//			if(b.getTitle().equals(keyword)) { //equals쓰게되면 keyword를 포함x 완전일치o
//				searchArr[count] = b;  
//				count++;
//			}
			if(b.getTitle().contains(keyword)) {
				searchArr[count] = b;  
				count++;
			}
			
		}
		return searchArr;
		
	}

	
	///////보충필요
	public int rentBook(int index) {
		int result = 0;
		
		if(bList[index] instanceof AniBook) {
			if(mem.getAge() < ((AniBook)bList[index]).getAccessAge() ) {
				result = 1;
			}
		} else if(bList[index] instanceof CookBook) {
			if( ((CookBook)bList[index]).isCoupon() ) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		return result;
	}

	
	
	
	//getter, setter
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
