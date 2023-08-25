package com.kh.javak;

public class Menu {
	String popcorn;
	String drink;
	char size;
	char size2;
	int price;
	int order;
	int totalOrder;
	int pay;
	
	public Menu() {};
	
	public Menu(String tpopcorn, char tsize, String tdrink, char tsize2) {
		popcorn = tpopcorn;
		drink = tdrink;
		size = tsize;
		size2 = tsize2;
		order = 0;
		totalOrder = 0;
		pay = 0;
	}
	public void statusDisplay() {
		System.out.println("주문하신 " + popcorn + "(" + size + ")" + "와(과) " + drink +"(" + size2 + ")" + "은(는) " + price + "입니다."
				+ "총 주문하신 수는 " + order + "개 이시고 결제하실 금액은 " + pay + "원 입니다." );
	}
	public void popcorntype() {
		System.out.println("팝콘 종류는 고소팝콘, 달콤팝콘, 어니언팝콘, 치즈팝콘이 있습니다.");
		System.out.println("사이즈는 M사이즈와 L사이즈만 선택가능합니다.");
	}
	public void drinktype() {
		System.out.println("음료 종류는 탄산음료, 아메리카노가 있습니다.");
		System.out.println("사이즈는 M사이즈와 L사이즈만 선택가능합니다.");
	}
	public void popcornprice() {
		System.out.println("고소팝콘 M : 5000 L : 5500 \n달콤팝콘 M : 6000 L : 6500 \n어니언팝콘 M : 6000 L : 6500 \n치즈팝콘M : 6000 L : 6500");
	}
	public void drinkprice() {
		System.out.println("탄산음료 M : 2500 L : 3000 \n아메리카노 M : 3500 L : 4000");
	}
	public void popcornkeep(String tpopcorn, char tsize) {
		if(tpopcorn.equals("고소팝콘") && tsize == 'M') {
			price = 5000;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("고소팝콘") && tsize == 'L') {
			price = 5500;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("달콤팝콘") && tsize == 'M') {
			price = 6000;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("달콤팝콘") && tsize == 'L') {
			price = 6500;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("어니언팝콘") && tsize == 'M') {
			price = 6000;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("어니언팝콘") && tsize == 'L') {
			price = 6500;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("치즈팝콘") && tsize == 'M') {
			price = 6000;
			popcorn = tpopcorn;
		}else if(tpopcorn.equals("치즈팝콘") && tsize == 'L') {
			price = 6500;
			popcorn = tpopcorn;
		}else 
			System.out.println("주문하신 제품이 없습니다.");
	}
	public void drinkcornkeep(String tdrink, char tsize2) {
		if(drink.equals("탄산음료") && size2 == 'M') {
			price = 2500;
			drink = tdrink;
		}else if(popcorn.equals("탄산음료") && size == 'L') {
			price = 3000;
			drink = tdrink;
		}else if(popcorn.equals("아메리카노") && size == 'M') {
			price = 3500;
			drink = tdrink;
		}else if(popcorn.equals("아메리카노") && size == 'L') {
			price = 4000;
			drink = tdrink;
		}else 
			System.out.println("주문하신 제품이 없습니다.");
	}
	public int buy() {
		pay += price;
		return pay;
	}
	public int add() {
		if(order + 1 >= totalOrder) {
			order = totalOrder;
		}else {
			order += 1;
		}
		return order;
	}
	
	public void statusDisplay(int type) {
		switch(type) {
			case 1: {
				System.out.println("주문하신 " + popcorn + "(" + size + ")" + "와(과) " + drink +"(" + size2 + ")" + "은(는) " + price + "입니다."
						+ "총 주문하신 수는 " + order + "개 이시고 결제하실 금액은 " + pay + "원 입니다." );
			}break;
			case 2: {
				System.out.println("결제가 완료 되었습니다.");
			}
		}
	}
}