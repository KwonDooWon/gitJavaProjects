package com.kh.practice.point;

public class RectangleController {
	Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		String str = "면적 : " + r.toString() + " / " + (r.getHeight() * r.getWidth());
		return str;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		String str = "둘레 : " + r.toString() + " / " +(2 * (r.getHeight() + r.getWidth()));
		return str;
	}
}
