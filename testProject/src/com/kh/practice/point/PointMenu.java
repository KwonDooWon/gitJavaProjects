package com.kh.practice.point;
import java.util.*;
public class PointMenu {
	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		System.out.print("메뉴 번호 : ");
		
		switch(sc.nextInt()) {
			case 1:
				this.circleMenu();
				break;
			case 2:
				this.rectangleMenu();
				break;
			case 9:
				System.out.print("프로그램이 종료되었습니다.");
		}
	}
	
	public void circleMenu() {
		System.out.println("=====원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		switch(sc.nextInt()) {
			case 1:
				this.calcCircum();
				break;
			case 2:
				this.calcCircleArea();
				break;
			case 9:
				this.mainMenu();
		}
	}
	
	public void rectangleMenu() {
		System.out.println("=====사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		switch(sc.nextInt()) {
		case 1:
			this.calcPerimeter();;
			break;
		case 2:
			this.calcRectArea();
			break;
		case 9:
			this.mainMenu();
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();
		System.out.println(cc.calcCircum(num1, num2, num3));
		
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("반지름 : ");
		int num3 = sc.nextInt();
		System.out.println(cc.calcArea(num1, num2, num3));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();
		System.out.println(rc.calcPerimeter(num1, num2, num3, num4));
	}
	
	public void calcRectArea(){
		System.out.print("x 좌표 : ");
		int num1 = sc.nextInt();
		System.out.print("y 좌표 : ");
		int num2 = sc.nextInt();
		System.out.print("높이 : ");
		int num3 = sc.nextInt();
		System.out.print("너비 : ");
		int num4 = sc.nextInt();
		System.out.println(rc.calcArea(num1, num2, num3, num4));
	}
	
}
