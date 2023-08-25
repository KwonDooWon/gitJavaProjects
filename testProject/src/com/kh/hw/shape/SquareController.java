package com.kh.hw.shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		 this.s = new Shape(4, height, width);
		 return s.getWidth()*2 + s.getHeight()*2;
	}
	 
	public double calcArea(double height, double width) {
		this.s = new Shape(4, height, width);
		return s.getHeight() * s.getWidth();
	}
	 
	public void paintColor(String color) {
		s.setColor(color);
		s.getColor();
	}
		
	public String print() {
		return "사각형" + s.information();
	}
}
 