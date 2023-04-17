package com.ohgiraffers.hw3.controller;

import java.util.Scanner;

import com.ohgiraffers.hw3.model.vo.ProductDTO;

public class ProductController {

	private ProductDTO[] pro = null;

	//생성된 객체의 수가 저장되는 변수
	public static int count = 0; //static으로 선언하는 이유 ?? - 클래스마다 공유되는 속성?
	
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new ProductDTO[10];
	}

	public void mainMenu() {
		int no = 0;
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 : ");
			no = sc.nextInt();

			switch (no) {
				case 1: productInput(); break;
				case 2: productPrint(); break;
				case 9: System.out.println("프로그램 종료"); return;
				default: System.out.println("메뉴를 잘못 입력하셨습니다."); break;
			}

		} while (no != 9);

	}

	public void productInput() {
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new ProductDTO(pId, pName, price, tax);
	}

	public void productPrint() {
		for(int i=0; i<count; i++) {
			System.out.println(pro[i].information());
		}
	}

}
