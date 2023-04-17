package com.greedy.level01.normal.student.run;

import java.util.Scanner;

import com.greedy.level01.normal.student.model.vo.StudentVO;

public class Application {

	public static void main(String[] args) {

		//입력받기
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int classroom = sc.nextInt();
		sc.nextLine(); ////정수,실수,논리값 입력->nextLine(); 버퍼관련 에러
		String name = sc.nextLine();
//		sc.nextLine(); //next();->정수, 실수, 논리값 입력시 버퍼관련 에러가 발생하므로 해당x
		double height = sc.nextDouble();
		sc.nextLine(); //정수,실수,논리값 입력->nextLine(); 버퍼관련 에러
		char gender = sc.nextLine().charAt(0);
		sc.close();
		
		//모든 필드를 초기화하는 생성자로 인스턴스 생성
		StudentVO student = new StudentVO(grade, classroom, name, height, gender);
				
		//출력용메서드 호출
		student.printInformation();
		
	}

}
