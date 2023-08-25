package com.kh.hw.shape;

public class TriangleController {
	Shape s = new Shape();
	
	 public double calcArea(double height, double width) {
		 this.s = new Shape(3, height, width);
		 return s.getWidth()*2 + s.getHeight()*2;
	 }
	 
	 public void paintColor(String color) {
		 s.setColor(color);
		 s.getColor();
	 }
	 
	 public String print() {
		 return "삼각형" + s.information();
	 }

		 
}
