package com.kh.OOP4;

public class Bird extends Animal implements Flyable {
	public Bird(String name, int age) {
		super(name, age);
	}
	public void fly() {
		System.out.println(this.name + "는 하늘을 날아다닌다.");
	}
	
	public void makeSound() {
		System.out.println(this.name + "이 하늘에서 울고있습니다.");
	}
}
