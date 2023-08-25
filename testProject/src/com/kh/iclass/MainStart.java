package com.kh.iclass;
import java.util.*;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CafePos pos = CafePos.getInstance();
		//메뉴 생성, 삭제, 수정, 조회, 전체출력
		
		
//		while(pos.getIsRun()) {
//			int number = pos.printMenu();
//			switch(number) {
//				case 1:{//생성
//					pos.insertMenu();
//				}break;
//				case 2:{//수정
//					pos.updateDrinkUnit();
//				}break;
//				case 3:{//조회
//					pos.printDrinkArr();
//				}break;
//				case 4:{//삭제
//					pos.deleteDrinkUnit();
//				}break;
//				case 5:{//전체메뉴확인
//					pos.searchDrinkUnit();
//				}break;
//				default:
//					pos.setIsRun(false);
//			}
//		}
//		final int MAX = 20;
//		Product[] drinkArr = new Product[MAX];
//		drinkArr[0] = new Product("아메리카노", 1000, "고소한 아메리카노");
		
		//아이스아메리카노, 카페라떼, 핫초코
//		Product iceAme = new Product("아이스아메리카노", 1600, "고소한 아이스 아메리카노");
//		Product cafeLatte = new Product("카페라떼", 2500, "부드러운 라떼");
//		Product hotChoco = new Product("핫초코", 2000, "달콤한 핫초코");
//		
//		System.out.println(iceAme.toString());
//		System.out.println(cafeLatte.toString());
//		System.out.println(hotChoco.toString());
//		
//		Product[] menu = new Product[3];
//		
//		menu[0] = new Product("아이스아메리카노", 1600, "고소한 아이스 아메리카노");
//		menu[1] = new Product("카페라떼", 2500, "부드러운 라떼");
//		menu[2] = new Product("핫초코", 2000, "달콤한 핫초코");
//		
//		for(int i = 0; i < menu.length; i++) {
//			System.out.println(menu[i].toString());
//		}
		//음료명, 금액, 설명을 입력받아 drinkArr에 추가해 보아라
		//음료명을 입력하세요 :
		//금액을 입력하세요 :
		//설명을 입력하세요 :
		//ㅇㅇㅇ가 메뉴에 추가되었습니다.
		//또는 ㅇㅇㅇ는 이미 등록되어있습니다.
//		String name;
//		int price;
//		String description;
//		
//		System.out.print("음료명을 입력하세요 : ");
//		name = sc.next();
//		System.out.print("금액을 입력하세요 : ");
//		price = sc.nextInt();
//		System.out.print("설명을 입력하세요 : ");
//		description = sc.next();
//		
//		for(int i = 0; i < drinkArr.length; i++) {
//			if(drinkArr[i] == null) {
//				drinkArr[i] = new Product(name, price, description);
//				System.out.println(drinkArr[i].getName() + "가 메뉴에 추가되었습니다.");
//				break;
//			}else if(drinkArr[i].getName().equals(name)) {
//				System.out.println(name + "은 이미 등록되어있습니다.");
//				break;
//			}else if(i == (drinkArr.length - 1)){
//				System.out.println("더이상 메뉴를 추가할 수 없습니다.");
//			}
//		}
//		System.out.println("번호\t메뉴명\t가격\t설명");
//		for(int i = 0; i < drinkArr.length; i++) {
//			if (drinkArr[i] == null) {
//				System.out.println(i +  "\t-\t-\t");
//			} else {
//				System.out.println(i + "\t" + drinkArr[i].toString());
//			}
//		}
		//가장 최신으로 저장된 목록 1개 삭제
//		for(int i = (drinkArr.length - 1); i >= 0; i--) {
//			if(drinkArr[i] != null) {
//				System.out.println(drinkArr[i].getName() + "가 메뉴에서 삭제되었습니다.");
//				drinkArr[i] = null;
//				break;
//			} else if (i == 0) {
//				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
//			}
//		}
		
		//조회
		//조회할 메뉴의 이름을 입력하세요 : 
		//번호 아메리카노 1000 시원해요
		//해당메뉴가 목록에 존재하지 않습니다.
//		System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
//		String name2 = sc.next();
//		for(int i = 0; i < drinkArr.length; i++) {
//			if(drinkArr[i] == null) {
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
//				break;
//			}else if(name2.equals(drinkArr[i].getName())) {
//				System.out.println(i + "\t" + drinkArr[i].toString());
//				break;
//			}else if (i == (drinkArr.length - 1)){
//				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
//			}
//		}
		
		//수정할 메뉴의 번호를 입력하세요 : ㅇ
		//수정할 정보를 입력하세요 : (이름, 가격, 설명)
		//새로운 ㅇㅇ을 입력하세요 : ㅇㅇㅇㅇ
		//selectMenu이용해서 해당정보 수정 후 아래와 같이 출력
		//번호 아메리카노 1000 시원해요
		
//		Product selectMenu;
//		int number;
//		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
//		number = sc.nextInt();
//		selectMenu = drinkArr[number];
//		
//		if(selectMenu == null) {
//			System.out.print("해당 번호의 메뉴가 존재하지 않습니다.");
//		}else {
//			System.out.print("수정할 정보를 입력하세요 : ");
//			switch(sc.next()) {
//				case"이름":
//					sc.nextLine();
//					System.out.print("새로운 이름을 입력하세요 : ");
//					selectMenu.setName(sc.nextLine());
//					System.out.println(number + "\t" + selectMenu.toString());
//					break;
//				case"가격":
//					sc.nextLine();
//					System.out.print("새로운 가격을 입력하세요 : ");
//					selectMenu.setPrice(sc.nextInt());
//					System.out.println(number + "\t" + selectMenu.toString());
//					break;
//				case"설명":
//					sc.nextLine();
//					System.out.print("새로운 설명을 입력하세요 : ");
//					selectMenu.setDescription(sc.nextLine());
//					System.out.println(number + "\t" + selectMenu.toString());
//					
//					break;
//				default:
//					System.out.print("잘못입력하셧습니다");
//			}
//		}
	}
}

