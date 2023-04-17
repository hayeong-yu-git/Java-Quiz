package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO; //다른 패키지에 있는 클래스를 사용(객체생성)하기위해 임포트

public class Application {

	public static void main(String[] args) {
		
		MemberDTO member = new MemberDTO();
		
		System.out.println("변경전 값출력============");
		System.out.println("id : " + member.getId());
		System.out.println("pwd : " + member.getPwd());
		System.out.println("name : " + member.getName());
		System.out.println("age : " + member.getAge());
		System.out.println("gender : " + member.getGender());
		System.out.println("phone : " + member.getPhone());
		System.out.println("email : " + member.getEmail());
		
		
		//필드값 변경 후 출력
		member.setId("user01");
		member.setPwd("pass01");
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('M');
		member.setPhone("010-7942-3976");
		member.setEmail("hong123@greedy.com");
		
		System.out.println("변경후 값출력============");
		System.out.println("변경후 id : " + member.getId());
		System.out.println("변경후 pwd : " + member.getPwd());
		System.out.println("변경후 name : " + member.getName());
		System.out.println("변경후 age : " + member.getAge());
		System.out.println("변경후 gender : " + member.getGender());
		System.out.println("변경후 phone : " + member.getPhone());
		System.out.println("변경후 email : " + member.getEmail());
		
		
	}

}
