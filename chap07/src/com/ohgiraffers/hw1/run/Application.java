package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {

	//(1) 객체배열 할당한뒤 3개의 생성자를 각각 이용해 객체 생성 후 출력
		EmployeeDTO[] empArr = new EmployeeDTO[3];
		
		empArr[0] = new EmployeeDTO();
		empArr[1] = new EmployeeDTO(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		empArr[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

//		for(int i=0; i<empArr.length; i++) {
//			System.out.println("emp[" + i + "] : " + empArr[i].information());
//		}
			
//		//향상 for문으로도 출력 가능
		int n=0;
		for(EmployeeDTO e : empArr) {
			System.out.println("emp[" + n + "] : " + e.information());
			n++;
		}	
		
	//(2) 3개 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		empArr[0].setEmpNo(0);
		empArr[0].setEmpName("김말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAddress("전라도 광주");
		
		empArr[1].setDept("기획부");
		empArr[1].setJob("부장");
		empArr[1].setSalary(4000000);
		empArr[1].setBonusPoint(0.3);
		
		
		System.out.println("==================값 넣은 후=====================");
		for(int i=0; i<empArr.length-1; i++) {
			System.out.println("emp[" + i + "] : " + empArr[i].information());
		}
		
		
	//(3) 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		System.out.println("================보너스 적용된 1년 연봉=============");
		
		//대입용 for문
		int[] incomeArr = new int[3]; 
		for(int i=0; i<incomeArr.length; i++) {
			incomeArr[i] = (int)(empArr[i].getSalary()+(empArr[i].getSalary()*empArr[i].getBonusPoint()))*12;
		}
		
		//출력용 for문
		for(int i=0; i<incomeArr.length; i++) {
			System.out.println(empArr[i].getEmpName() + "의 연봉 : " + incomeArr[i]);
		}
		
		
		//(4) 3명의 직원의 연봉 평균을 구하여 출력 - 직원수가 늘어날 경우를 고려해 for문으로 작성
		System.out.println("===================직원 연봉 평균================");
		int sum = 0;
//		for(int i=0; i<incomeArr.length; i++) {
//			sum += incomeArr[i];
//		}
		for(int i : incomeArr) {
			sum += i;
		}
		System.out.println("직원들의 연봉의 평균 : " + sum / empArr.length);
		

	}

}
