package com.kh.hw.shape;
import java.util.*;
public class ShapeMenu {
	 Scanner sc = new Scanner(System.in);
	 SquareController scr = new SquareController();
	 TriangleController tc = new TriangleController();
	 
	 public void inputMenu() {
		 boolean isTrue = true;
		 while(isTrue) {
			 System.out.println("===== 도형 프로그램 =====");
			 System.out.println("3. 삼각형");
			 System.out.println("4. 사각형");
			 System.out.println("9. 프로그램 종료");
			 System.out.print("메뉴 번호 : ");
			 
			 switch(sc.nextInt()) {
				 case 3: 
					 triangleMenu();
				 	 isTrue = false;
				 	 break;
				 case 4: squareMenu();
				 	 isTrue = false;
				 	 break;
				 case 9:
					 System.out.print("프로그램을 종료합니다.");
					 break;
				 default:
					 System.out.print("잘못된 번호입니다. 다시 입력하세요.");
			 }
		 }
		 
	 }
	 
	 public void triangleMenu() {
		 System.out.println("===== 삼각형 =====");
		 System.out.println("1. 삼각형 면적");
		 System.out.println("2. 삼각형 색칠");
		 System.out.println("3. 삼각형 정보");
		 System.out.println("9. 메인으로");
		 System.out.print("메뉴 번호 : ");
		 
		 switch(sc.nextInt()) {
			 case 1: 
				System.out.print("높이 : ");
				double num1 = sc.nextDouble();
				System.out.print("너비 : ");
				double num2 = sc.nextDouble();
				tc.calcArea(num1, num2);
				System.out.print("삼각형 둘레 : ");
				System.out.print(tc.calcArea(num1, num2));
			 	break;
			 case 2: 
				 System.out.print("색깔을 입력하세요 : ");
				 String str = sc.next();
				 tc.paintColor(str);
				 System.out.println("색이 수정되었습니다.");
			 	break;
			 case 3:
				 System.out.print(tc.print());
				 break;
			 case 9:
				 System.out.println("메인으로 돌아갑니다.");
				 inputMenu();
		 }
		 
	 }
	 
	 public void squareMenu() {
		 System.out.println("===== 사각형 =====");
		 System.out.println("1. 사각형 둘레");
		 System.out.println("2. 사각형 면적");
		 System.out.println("3. 사각형 색칠");
		 System.out.println("4. 사각형 정보");
		 System.out.println("9. 메인으로");
		 System.out.print("메뉴 번호 : ");
		 
		 switch(sc.nextInt()) {
			 case 1: 
				System.out.print("높이 : ");
				double num1 = sc.nextDouble();
				System.out.print("너비 : ");
				double num2 = sc.nextDouble();
				scr.calcPerimeter(num1, num2);
				System.out.print("사각형 둘레 : ");
				System.out.print(scr.calcPerimeter(num1, num2));
			 	break;
			 case 2: 
				System.out.print("높이 : ");
				double num3 = sc.nextDouble();
				System.out.print("너비 : ");
				double num4 = sc.nextDouble();
				scr.calcArea(num3, num4);
				System.out.print("사각형 면적 : ");
				System.out.print(scr.calcArea(num3, num4));
			 	break;
			 case 3:
				 System.out.print("색깔을 입력하세요 : ");
				 String str = sc.next();
				 tc.paintColor(str);
				 System.out.println("색이 수정되었습니다.");
			 case 4:
				 System.out.print(tc.print());
				 break;
			 case 9:
				 System.out.println("메인으로 돌아갑니다.");
				 inputMenu();
		 }
	 }
	 
	public void inputSize(int type, int menuNum) {

		if (type == 3) {

			if (menuNum == 1) {

				System.out.print("높이: ");

				double height = sc.nextDouble();

				System.out.print("너비: ");

				double width = sc.nextDouble();

				double area = tc.calcArea(height, width);

				System.out.println("삼각형 면적: " + area);

			} else if (menuNum == 2) {

				System.out.print("색깔을 입력하세요: ");

				String color = sc.next();

				tc.paintColor(color);

				System.out.println("색이 수정되었습니다.");

			}

		} else if (type == 4) {

			System.out.print("높이: ");

			double height = sc.nextDouble();

			System.out.print("너비: ");

			double width = sc.nextDouble();

			if (menuNum == 1) {

				double perimeter = scr.calcPerimeter(height, width);

				System.out.println("사각형 둘레: " + perimeter);

			} else if (menuNum == 2) {

				double area = scr.calcArea(height, width);

				System.out.println("사각형 면적: " + area);

			} else if (menuNum == 3) {

				System.out.print("색깔을 입력하세요: ");

				String color = sc.next();

				scr.paintColor(color);

				System.out.println("색이 수정되었습니다.");

			}

		}

	}

	public void printInformation(int type) {

		if (type == 3) {

			System.out.println(tc.print());

		} else if (type == 4) {

			System.out.println(scr.print());

		}

	}

	public static void main(String[] args) {

		ShapeMenu shapeMenu = new ShapeMenu();

		shapeMenu.inputMenu();

	}
}
