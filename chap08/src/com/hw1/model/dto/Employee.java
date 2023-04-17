package com.hw1.model.dto;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	public Employee() {}
	
	
	//name값은 부모필드 값에 직접 접근해서 초기화
	//age, height, weight는 부모 생성자를 통해 초기화
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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
	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
	@Override
	public String information() {
		return super.information()+ " , " + this.salary + ", " + this.dept;
	}
	
	
	

}
