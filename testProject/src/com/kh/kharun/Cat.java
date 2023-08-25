package com.kh.kharun;

public class Cat extends Animal {
	public Cat(String name, int age, String gender) {
		super(name, age, gender);
	}
	
	public void welcomeHome() {
		System.out.print("숨는다");
	}
	
	void makeSound() { 
		System.out.println("야옹");
	}
}
