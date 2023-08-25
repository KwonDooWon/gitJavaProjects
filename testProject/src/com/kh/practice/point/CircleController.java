package com.kh.practice.point;

public class CircleController {
	Circle c = new Circle();
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		String str = "면적 : " + c.toString() + " / " + (Math.PI * c.getRadius() * c.getRadius());
		return str;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		String str = "둘레 : " + c.toString() + " / " + (Math.PI * c.getRadius() * 2);
		return str;
	}
}
