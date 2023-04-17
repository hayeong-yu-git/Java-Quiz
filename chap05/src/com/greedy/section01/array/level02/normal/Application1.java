package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
		 * 검색할 문자를 하나 입력 받아 
		 * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 문자열을 하나 입력하세요 : helloworld
		 * 검색할 문자를 입력하세요 : l
		 * 
		 * -- 출력 예시 --
		 * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 하나 입력하세요 >>> ");
		String str = sc.nextLine();
		
		//(1) 입력받은 문자열을 하나씩 문자로 뽑아내어고, 문자배열을 생성하여 인덱스마다 값저장하기
		char[] carr = new char[str.length()];
		
		
		for(int i=0; i<carr.length; i++) {
			carr[i] = str.charAt(i);
//			System.out.println("carr[" + i + "] : " + carr[i]); 각 인덱스에 입력문자열에서 뽑아낸 문자가 하나씩 제대로 들어가는지 확인
		}
		
		System.out.print("검색할 문자를 입력하세요 >>> ");
		String str2 = sc.nextLine();
		char ch = str2.charAt(0);
		
		//(2) 입력받은 문자열2의 첫글자(0번째인덱스값)를 문자로 저장한뒤 그것을 i번째 인덱스값과 비교하여 같을때 누적함->을 반복
		int count = 0;
		for(int i=0; i<carr.length; i++) {
			if(ch==carr[i]) {
				count++;	 //검색하다 걸릴때마다 하나씩 카운트가 올라가도록
			}
		}	
		System.out.println("입력하신 문자열 \"" + str + "\"에서 찾으시는 문자 '" + str2 + "'은 " + count + "개 입니다.");
		
	}
	
	
	//cf. charAt(인덱스) 말고 toCharArray() 메소드를 이용하여 문자열 값들을 하나씩 뽑아내어->문자배열로 만들 수 있다.
	//	char[] carr = str.toCharArray();
	

}
