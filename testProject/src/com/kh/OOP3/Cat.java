package com.kh.OOP3;

public class Cat implements Animal{

	@Override
	public void eat(String food) {
		System.out.println(food + "가 너무 맛있다(야옹)");
		
	}

	@Override
	public void move() {
		System.out.println("야옹 꼬리를 세우며");
		
	}
	
}
