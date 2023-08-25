package com.kh.generic;

public class Run {
	public static void main (String[] args) {
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> aBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
}
