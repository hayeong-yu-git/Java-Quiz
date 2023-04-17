package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application6 {

	public static void main(String[] args) {

		/*
		 * 두 개의 정수를 입력 받아 변수에 저장하고, 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요. 단,
		 * 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
		 * 
		 * -- 입력 예시 -- 첫 번째 정수 : 4 두 번쨰 정수 : 3 연산 기호를 입력하세요 : +
		 * 
		 * -- 출력 예시 -- 4 + 3 = 7
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력 > ");
		int first = sc.nextInt();
		
		System.out.print("두번째 정수를 입력 > ");
		int second = sc.nextInt();
		
		System.out.print("연산기호 입력 > "); // 문자로 입력받는 메소드는 없고 문자열만 가능 cf.문자열을 charAt(index)로 뽑아내는 방식
//		String op = sc.next(); //case옆에 "+", "-" 등이 들어가면 정상작동
		char op = sc.next().charAt(0);
		
//		(1) switch문
		int result = 0;
		switch (op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		case '%':
			result = first % second;
			break;
		default:
			System.out.println("입력하신 연산은 없습니다.");
			return;
		}
		System.out.println(first + " " + op + " " + second + " = " + result);


//		//(2) if-else문
//		int result = 0;
//		if(!(op=='+' || op =='-'|| op=='*'||op=='/'||op=='%')) {
//			System.out.println("입력하신 연산은 없습니다. 프로그램 종료합니다.");
//		} else {
//			if(op=='+') result = first + second;
//			if(op=='-') result = first - second;
//			if(op=='*') result = first * second;
//			if(op=='/') result = first / second;
//			if(op=='%') result = first % second;
//			System.out.println(first + " " + op + " " + second + " = " + result);
//		}

		//cf. next() 또는 nextLine()으로 입력받아 String으로 저장한 문자열 값을 비교 : op.equals(문자열)
		// 그걸 charAt(인덱스)로 뽑아낸 문자 값을 비교 : ==로 할 수 있음

	}
}
