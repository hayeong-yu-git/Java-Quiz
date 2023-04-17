package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student; //객체배열 할당할때 임포트

public class Run {

	public static void main(String[] args) {

		//학생 개체배열
		Student[] sArr = new Student[3];
		
		sArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		sArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student s : sArr) {
			System.out.println(s.information());
		}
		
		
		//사원 객체배열
		Employee[] eArr = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true) {
			//이름,나이,신장,몸무게,급여,부서 입력받기
			System.out.print("사원 이름 : ");
			String name = sc.nextLine();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 신장 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			
			eArr[cnt] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("사원정보를 계속 추가하시겠습니까? (y/n) : ");
			String answer = sc.nextLine().toUpperCase();
			if(answer.equals("N")) break;
			
			cnt++;
			
		}//while
		
		
		
//		for(int i=0; i<eArr; i++) {
//			if(eArr[i]==null) break;
//			System.out.println(eArr[i].information());
//		}
		
//		for(Employee e : eArr) {
//			if(e==null) break;
//			System.out.println(e.information());
//		}
		
		for(int i=0; i<cnt; i++) { //반복 길이를 이렇게 설정하면 if문 안써도됨
			System.out.println(eArr[i].information());
		}
		
		
	}

}
