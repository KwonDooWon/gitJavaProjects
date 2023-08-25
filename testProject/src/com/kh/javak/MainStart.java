package com.kh.javak;
import java.util.*;
public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu doowonMenu = new Menu();
		
		boolean isFinish = false;
		
		while(!isFinish) {
			int num;
			System.out.println("원하는 행동의 버튼을 클릭하세요.");
			System.out.println("------------------------");
			System.out.println("1. 팝콘메뉴보기.");
			System.out.println("2. 음료메뉴보기.");
			System.out.println("3. 팝콘선택하기.");
			System.out.println("4. 음료선택하기.");
			System.out.println("5. 주문현황.");
			System.out.println("6. 결제하기.");
			System.out.println("다른버튼을 누르면 종료");
			System.out.println("------------------------");
			
			num = sc.nextInt();
			switch(num) {
			case 1:
				doowonMenu.popcorntype();
				break;
			case 2:
				doowonMenu.drinktype();
				break;
			case 3:
				System.out.print("팝콘을 선택해주세요.");
				String tpopcorn = sc.next();
				System.out.print("사이즈를 선택해주세요.");
				char tsize = sc.next().charAt(0);
				doowonMenu.popcornkeep(tpopcorn, tsize);
				doowonMenu.buy();
				doowonMenu.add();
				break;
			case 4:
				System.out.print("음료를 선택해주세요.");
				String tdrink = sc.next();
				System.out.print("사이즈를 선택해주세요.");
				char tsize2 = sc.next().charAt(0);
				doowonMenu.popcornkeep(tdrink, tsize2);
				doowonMenu.buy();
				doowonMenu.add();
				break;
			case 5:
				doowonMenu.statusDisplay(1);
				break;
			case 6:
				doowonMenu.statusDisplay(2);
				break;
			default:
				isFinish = true;
			}
		}
	}
}