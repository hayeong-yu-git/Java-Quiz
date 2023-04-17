package com.greedy.level01.hard.emp.run;

import java.util.Scanner;

import com.greedy.level01.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		
		
//(1) 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("직원 번호 : ");
		int number = sc.nextInt();

		sc.nextLine(); //버퍼에 남아있을 엔터를 처리(int->String입력받을때)
		
		System.out.print("직원 이름 : ");
		String name = sc.nextLine();
		System.out.print("직원 부서 : ");
		String dpt = sc.nextLine();
		System.out.print("직원 직무 : ");
		String job = sc.nextLine();
		System.out.print("직원 나이 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); //버퍼에 남아있을 엔터를 처리(int->String입력)
		
		System.out.print("직원 성별 : ");
		String gender = sc.nextLine();
//		char gender = sc.nextInt().charAt(0);
		
		System.out.print("직원 임금 : ");
		int salary = sc.nextInt();
		System.out.print("직원 보너스 : ");
		double bonusPoint = sc.nextDouble();
		
		sc.nextLine(); //버퍼에 남아있을 엔터를 처리(double->String입력)
		
		System.out.print("직원 연락처 : ");
		String phone = sc.nextLine();
		System.out.print("직원 주소 : ");
		String address = sc.nextLine();
		
		
//(2) 기본생성자로 인스턴스화
		EmployeeDTO employee = new EmployeeDTO();
		
//(3) setter를 이용한 필드값 변경
		employee.setNumber(number);
		employee.setName(name);
		employee.setDept(dpt);
		employee.setJob(job);
		employee.setAge(age);
		employee.setGender(gender.charAt(0));
		employee.setSalary(salary);
		employee.setBonusPoint(bonusPoint);
		employee.setPhone(phone);
		employee.setAddress(address);
		

//(4) getter를 이용해 모든 필드 값 출력	
		System.out.println("직원 정보 출력========");
		System.out.println(employee.getNumber());
		System.out.println(employee.getName());
		System.out.println(employee.getDept());
		System.out.println(employee.getJob());
		System.out.println(employee.getAge());
		System.out.println(employee.getGender());
		System.out.println(employee.getSalary());
		System.out.println(employee.getBonusPoint());
		System.out.println(employee.getPhone());
		System.out.println(employee.getAddress());
		
		
	}

}
