package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Test { //야구게임에서 int타입으로 네자리 숫자를 입력받으면 안되는 이유
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0123을 입력해보세요 : ");
		int num2 = sc.nextInt();
		System.out.println(num2); //0123이 아닌 123출력 (0으로 시작하는 네자리 정수로 입력받을 수 없음)
	}
}
