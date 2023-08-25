package com.kh.personalProject;

public class Player {
	private String position;
	private String name;
	private String nationality;
	private String team; 
	private String birth;
	private char gender;
	private int age;
	private double height;
	private double weight;
	private int annualSalary;
	
	public Player() {
		
	}
	
	public Player(String position, String name, String nationality, String team, String birth, char gender,
			int age, double height, double weight, int annualSalary) {
		this.position = position;
		this.name = name;
		this.nationality = nationality;
		this.team = team;
		this.birth = birth;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.annualSalary = annualSalary;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNationality() {
		return this.nationality;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public int getAnnualSalary() {
		return this.annualSalary;
	}
	
	public String information() {
		return this.position + '\t' + this.name + '\t' + this.nationality + '\t' + this.team + '\t' + 
				this.birth + '\t' + this.gender + '\t' + this.age + '\t' + this.height + '\t' + 
				this.weight + '\t' + this.annualSalary;
	}
}
