package com.kh.hw.person;

public class Student extends Person {
	private int grade;
	private String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		String str;
		str = getName() + ", " + getAge() + ", " + getHeight() + ", " + getWeight() + ", " + this.grade + ", " + this.major; 
		return str;
	}
}
