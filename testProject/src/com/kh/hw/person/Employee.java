package com.kh.hw.person;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	public void SetSalary(int salary) {
		this.salary = salary;
	}
	
	public void SetDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		String str;
		str = getName() + ", " + getAge() + ", " + getHeight() + ", " + getWeight() + ", " + this.salary + ", " + this.dept;
		return str;
	}
}
