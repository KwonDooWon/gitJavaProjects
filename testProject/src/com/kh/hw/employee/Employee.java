package com.kh.hw.employee;

public class Employee {
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	public Employee() {
		
	}
	
	public Employee(int empNo, String name, char gender, String phone) {
		
	}
	
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		
	}
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus
	}
}
