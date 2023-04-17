package com.ohgiraffers.hw2.run;

import java.util.Scanner;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

public class Application {

	public static void main(String[] args) {

//(1) 객체배열 할당
		StudentDTO[] studentArr = new StudentDTO[10];

//(2) 학생정보 입력부
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		while (true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine(); // 버퍼에 남아있는 개행문자들 처리
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine(); // 버퍼에 남아있는 개행문자들 처리
			
			studentArr[cnt] = new StudentDTO(grade, classroom, name, kor, eng, math);
							// 매개변수 있는 생성자로 객체배열의 인덱스마다 입력받은 값 대입
			cnt++;

			System.out.print("추가로 학생 정보를 입력하시겠습니까? (y/n) : ");
			String answer = sc.nextLine().toUpperCase();
							// 대문자로 변환해주는 메소드 추가하면 y/Y/n/N 다 가능해짐
		
			if(answer.equals("N")) {
				break;
			}

		} // while

//(3) 학생들의 정보를 모두 출력 + 평균까지
//		for(int i=0; i<studentArr.length; i++) {
//			if(studentArr[i]!=null) //객체배열의 값이 비어있는 경우는 제외하고 출력한다. (NullpointerException 해소)
//				System.out.println(studentArr[i].information() 
//						 + ", 평균 : " + (int)((studentArr[i].getKor() + studentArr[i].getEng() + studentArr[i].getMath())/3.0));
//		}

		for (StudentDTO s : studentArr) {
			if (s == null) {
				break;
			}
			int sum = s.getKor() + s.getEng() + s.getMath();
			System.out.println(s.information() + ", 평균 : " + (int) (sum / 3.0));
		}

	}// main
}
