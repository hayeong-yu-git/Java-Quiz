package com.hw1.model.dto;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	public Student() {}
	
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);//age, height, weight는 부모 생성자를 통해 초기화
		super.name = name;////name값은 부모필드 값에 직접 접근해 초기화
		this.grade = grade;
		this.major = major;
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}


	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return super.getHeight();
	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		super.setHeight(height);
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return super.getWeight();
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		super.setWeight(weight);
	}
	
	
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	
	@Override
	public String information() {
		return super.information()+ " , " + this.grade + ", " + this.major;
	}

	
	
	
	

}
