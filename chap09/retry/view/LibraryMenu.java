package com.hw1.view;

import java.util.Scanner;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

public class LibraryMenu {
	private LibraryManager Im = new LibraryManager();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("성별: ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		Im.inserMember(mem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴 번호 입력: ");
			int no = sc.nextInt();
			sc.nextLine();
			
			switch(no) {
				case 1 : System.out.println(Im.myInfo()); break;
				case 2 : selectAll(); break;
				case 3 : searchBook(); break;
				case 4 : rentBook(); break;
				case 0 : System.out.println("프로그램을 종료합니다. "); return;
				default : System.out.println("번호를 잘못 입력하셨습니다. "); break;
			}
		}//while
	}
	
	public void selectAll() {
		Book[] blist = Im.selectAll(); //주소값 blist를 받아서 객체배열에 저장
		
		System.out.println("전체도서목록=========");
		int cnt = 0;
		for(Book b : blist) {
			System.out.println(cnt + "번 도서 : " + b.toString());
			cnt++;
		}
	}
	
	public void searchBook() {
		System.out.println("책검색메뉴===========");
		System.out.print("검색할 제목 키워드: ");
		String keyword = sc.nextLine();
		Book[] searchList = Im.searchBook(keyword);
		
//		for(Book b : searchList) {
//			if(b==null) break;
//			System.out.println(b.toString());
//		}
		for(Book b : searchList) {
			if(b != null)				
				System.out.println(b);
		}

	}
	
	public void rentBook() {
		selectAll(); //대여할 도서 목록 띄워주기
		System.out.print("대여할 도서 번호 선택 : ");
		int result = Im.rentBook(sc.nextInt());
		
		System.out.println((result==0)? "성공적으로 대여되었습니다. " 
				: (result==1)? "나이 제한으로 대여 불가능입니다." 
						: "성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		
		
	}
	

}
