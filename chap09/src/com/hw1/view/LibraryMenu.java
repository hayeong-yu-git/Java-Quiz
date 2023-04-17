package com.hw1.view;

import java.util.Scanner;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Member;
import com.hw1.model.dto.Book;

public class LibraryMenu {

	private LibraryManager Im = new LibraryManager();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("회원 이름 : ");
		String name = sc.nextLine();
		System.out.print("회원 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("회원 성별 : ");
		char gender = sc.nextLine().charAt(0);

		//멤버객체 생성하고 매니저클래스에 전달
		Member mem = new Member(name, age, gender); 
		Im.insertMember(mem);

		
		while (true) {
			System.out.println("======메뉴=====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			
			System.out.print("메뉴 번호 입력 : ");
			int answer = sc.nextInt();
			sc.nextLine();

			switch (answer) {
			case 1:
				System.out.println(Im.myInfo());  break;
			case 2:
				selectAllOfMenu(); break;
			case 3:
				searchBookOfMenu(); break;
			case 4:
				rentBook(); break;
			case 0: 
				System.out.print("프로그램을 종료합니다."); return;
			default:
				System.out.println("메뉴번호를 잘못 입력하셨습니다."); break;
			}
		}

	}//mainMenu()메소드


	public void selectAllOfMenu() {
		Book[] bList = Im.selectAllOfManager();
		for(int i=0; i<bList.length; i++) {
			System.out.println( i + "번 도서 : " + bList[i]);
		}
	}

	public void searchBookOfMenu() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] searchList = Im.searchBookOfManager(keyword);
		
		for(Book b : searchList) {
			if(b != null)
			System.out.println(b);
		}
	}

	public void rentBook() {
		
		selectAllOfMenu();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = Im.rentBook(index);
		
//		if (result == 0) {
//			System.out.println("성공적으로 대여되었습니다.");
//		} else if (result == 1) {
//			System.out.println("나이 제한으로 대여 불가능입니다.");
//		} else if (result == 2) {
//			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
//		}
		System.out.println(result==0? "성공적 대여" : (result==1? "나이제한됨" : "성공적대여, 요리학원쿠폰발급"));

	}
	
	

	// getter, setter
	public LibraryManager getIm() {
		return Im;
	}

	public void setIm(LibraryManager im) {
		Im = im;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

}
