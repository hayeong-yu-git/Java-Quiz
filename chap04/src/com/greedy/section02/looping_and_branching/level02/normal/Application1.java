package com.greedy.section02.looping_and_branching.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요
		 * 
		 * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
		 * 
		 * -- 입력 예시 --
		 * 문자열을 입력하세요 : apple
		 * 
		 * -- 출력 예시 --
		 * 0 : a
		 * 1 : p
		 * 2 : p
		 * 3 : l
		 * 4 : e
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("입력받은 문자열 : " + str);
		
		/* 문자열에서 문자 추출하는 방법 :  str.charAt(index) */
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);   //굳이 여기서 문자로 뽑아내지 않고 출력문 안에서 chatAt(인덱스)메소드 사용해도 됨
//			System.out.println(i + "번째 인덱스의 문자는 " + str.charAt(i) + "입니다.");
			System.out.println((i+1) + "번째 문자는 " + ch + "입니다.");
		}
	}
}
