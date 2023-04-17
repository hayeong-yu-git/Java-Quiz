package com.greedy.section02.demensional_array.level02.normal;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {

		/*
		 * 가로와 세로 길이를 정수형으로 입력 받아 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고 각 인덱스에는 랜덤으로 알파벳 대문자
		 * 넣어서 출력
		 * 
		 * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고 그렇지 않은 경우에는
		 * "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
		 * 
		 * -- 입력 예시 -- 가로 행의 수를 입력하세요 : 5 세로 열의 수를 입력하세요 : 4
		 * 
		 * -- 출력 예시 -- F H Z G W F O T O R X V W H J X W S S J
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int garo = 0; 
		int sero = 0;
		do {
			System.out.print("가로 행의 수를 입력하세요 : ");
			garo = sc.nextInt();
			for(;;) { //세로열 입력받기 무한반복
				System.out.print("세로 열의 수를 입력하세요 : ");
				sero = sc.nextInt();
				if(sero<10&&sero>0) //정상값이 들어오면 이 반복문을 나간다
					break;
			}
			
			System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
			
		} while(0>garo || garo >10 || 0>sero || 10<sero);
		
		char[][] carr = new char[garo][sero];
		
		for(int i=0; i<carr.length; i++) { //값대입
			for(int j=0; j<carr[i].length; j++) {
				carr[i][j] = (char) ((int) (Math.random() * (90-65+1)) + 65);
			}
		}
		
		for(int i=0; i<carr.length; i++) { //출력
			for(int j=0; j<carr[i].length; j++) {
				System.out.print(carr[i][j]);
			}
			System.out.println();
		}
		
		
//		//입력부 반복 이렇게 작성할 수도 있다
//		int garo = 0; 
//		int sero = 0;
//		while(true) {
//			System.out.print("가로 행의 수를 입력하세요 : ");
//			garo = sc.nextInt();
//			if(0<garo && garo <11) {break;}
//			System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
//		}
//		while(true) {
//			System.out.print("세로 행의 수를 입력하세요 : ");
//			sero = sc.nextInt();
//			if(0<sero && sero <11) {break;}
//			System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
//		}
		
		
		
		
		
		


		
		//(1) 하나의 while문 무한반복 시켜놓고 그안에서 continue와 break 이용 
		//*****문제점 : 가로 잘 입력하고 세로 잘못 입력했을때 가로부터 다시 입력하게 반복됨

//		while문(무한반복) {
//			
//			숫자입력받기
//			
//			if(잘못된숫자)
//				"반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요."
//				continue;
//				
//			if(옳은숫자)
//				값대입하기
//				break;
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.print("가로 행의 수를 입력하세요 : ");
//			int width = sc.nextInt();
//			
//			if(!((0 < width && width <= 10))) {
//				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
//				continue;
//			}
//			
//			System.out.print("세로 열의 수를 입력하세요 : ");
//			int height = sc.nextInt();
//			int[][] iarr = new int[width][height]; //****char[][] iarr = new char[width][height];
//			
//			if(!((0 < height && height <= 10))) {
//				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
//				continue;
//			}
//			
//			if(0 < width && width <= 10 && 0 < height && height <= 10) {
//				for (int i = 0; i < iarr.length; i++) {
//					for (int j = 0; j < iarr[i].length; j++) {
//						// 랜덤한 알파벳을 대입
//						iarr[i][j] = (int) (Math.random() * (90 - 65 + 1)) + 65; 
//									//****iarr[i][j] = (char) (int) (Math.random() * (90 - 65 + 1)) + 65;
//						System.out.print((char) iarr[i][j] + " ");
//					}
//					System.out.println();
//				 }//for
//				break;
//			}
//		
//		}//while문
		
		
		
		
//		//(2)답 보고 다시 작성 - 반복의 단위가 쪼개어짐
//	
//		Scanner sc = new Scanner(System.in);
//		char c = 'A';
//		int yeol = 0;
//		int hang = 0;
//		
//		while(true) {
//			
//			System.out.print("가로 행의 수 입력 : ");
//			hang = sc.nextInt();
//			
//			if(0>hang || hang>10) {
//				System.out.println("반드시 1~10까지의 정수를 입력하세요.");
//			} else {
//				break;
//			}
//		}//행 입력 while
//		
//		while(true) {
//			System.out.print("세로 열의 수 입력 : ");
//			yeol = sc.nextInt();
//			if(yeol<0 || 10<yeol) {
//				System.out.println("반드시 1~10의 정수 입력해라.");
//			} else { 
//				break;
//			}
//		}//열 입력 while
//		
//		char[][] carr = new char[hang][yeol];
//		
//		for(int i=0; i<carr.length; i++) {
//			for(int j=0; j<carr[i].length; j++) {
//				carr[i][j] = (char)(int)(Math.random() * (90-65+1) + 65);//ASCII에서 65~90까지가 영문대문자
//				System.out.print(carr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}//main
}//class




		
	//아래의 각 부분을 어떻게 조합할지

		//입력받기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가로 행의 수를 입력하세요 : ");
//		int width = sc.nextInt();
//		System.out.print("세로 열의 수를 입력하세요 : ");
//		int height = sc.nextInt();
		
		//입력받아서 배열생성
//		int[][] iarr = new int[width][height];
		
		
		//출력문
//		for (int i = 0; i < iarr.length; i++) {
//			for (int j = 0; j < iarr[i].length; j++) {
//				// 랜덤한 알파벳을 대입
//				iarr[i][j] = (int) (Math.random() * (90 - 65 + 1)) + 65;
//				System.out.print((char) iarr[i][j] + " ");
//			}
//			System.out.println();
//		 }//for
		
		
		// 랜덤한 정수 만들기 -> 그 랜덤한 수를 정수형 배열에 대입->그다음에 각 값들을 문자형으로 출력
		// ASCII 65~90까지가 대문자
//		System.out.println((int) (Math.random()*(90-65+1)) + 65);
		
		
//		if(!(0 < width && width <= 10 && 0 < height && height <= 10)) {
//		System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
//	}

	
		
		
		
