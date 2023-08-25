package com.kh.iclass;
import java.util.*;
public class CafePos {
	private static CafePos instance;
	private final int MAX_COUNT = 50;
	private final Product[] DRINK_ARR = new Product[MAX_COUNT];
	private Scanner sc = new Scanner(System.in);
	private boolean isRun = true;
	//외부에서 객체를 생성하지 못하도록 생성자의 접근제한자를 private으로 설정
	private CafePos() {
		
	}
	
	public static CafePos getInstance() {
		if(instance == null)
			instance = new CafePos();
		return instance;
	}
	
	public boolean getIsRun() {
		return this.isRun;
	}
	
	public void setIsRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	public int printMenu() {
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		System.out.println("----------------------");
		System.out.println("1. 메뉴 생성");
		System.out.println("2. 메뉴 수정");
		System.out.println("3. 메뉴 조회");
		System.out.println("4. 메뉴 삭제");
		System.out.println("5. 전체 메뉴 확인");
		System.out.println("----------------------");
		System.out.print("원하시는 메뉴를 선택해 주세요 : ");
		return sc.nextInt();
	}
	
	public void insertMenu() {
		String name;
		int price;
		String description;
		
		System.out.print("음료명을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("금액을 입력하세요 : ");
		price = sc.nextInt();
		
		sc.nextLine();
		System.out.print("설명을 입력하세요 : ");
		description = sc.nextLine();
		
		for(int i = 0; i < DRINK_ARR.length; i++) {
			if(DRINK_ARR[i] == null) {
				DRINK_ARR[i] = new Product(name, price, description);
				System.out.println(DRINK_ARR[i].getName() + "가 메뉴에 추가되었습니다.");
				break;
			}else if(DRINK_ARR[i].getName().equals(name)) {
				System.out.println(name + "은 이미 등록되어있습니다.");
				break;
			}else if(i == (DRINK_ARR.length - 1)){
				System.out.println("더이상 메뉴를 추가할 수 없습니다.");
			}
		}
	}
	
	public void printDrinkArr() {
		System.out.println("번호\t메뉴명\t가격\t설명");
		for(int i = 0; i < DRINK_ARR.length; i++) {
			if (DRINK_ARR[i] == null) {
				System.out.println(i +  "\t-\t-\t");
			} else {
				System.out.println(i + "\t" + DRINK_ARR[i].toString());
			}
		}
	}
	//------------수정-------------
	public void updateDrinkUnit() {

		printDrinkArr();
		
		Product selectMenu;
		int number;
		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
		number = sc.nextInt();
		selectMenu = DRINK_ARR[number];
		
		if(selectMenu == null) {
			System.out.print("해당 번호의 메뉴가 존재하지 않습니다.");
		}else {
			System.out.print("수정할 정보를 입력하세요 : ");
			switch(sc.next()) {
				case"이름":
					sc.nextLine();
					System.out.print("새로운 이름을 입력하세요 : ");
					selectMenu.setName(sc.nextLine());
					System.out.println(number + "\t" + selectMenu.toString());
					break;
				case"가격":
					sc.nextLine();
					System.out.print("새로운 가격을 입력하세요 : ");
					selectMenu.setPrice(sc.nextInt());
					System.out.println(number + "\t" + selectMenu.toString());
					break;
				case"설명":
					sc.nextLine();
					System.out.print("새로운 설명을 입력하세요 : ");
					selectMenu.setDescription(sc.nextLine());
					System.out.println(number + "\t" + selectMenu.toString());
			}
		}
	}
	public void deleteDrinkUnit() {
		for(int i = (DRINK_ARR.length - 1); i >= 0; i--) {
			if(DRINK_ARR[i] != null) {
				System.out.println(DRINK_ARR[i].getName() + "가 메뉴에서 삭제되었습니다.");
				DRINK_ARR[i] = null;
				break;
			} else if (i == 0) {
				System.out.println("삭제할 메뉴가 존재하지 않습니다.");
			}
		}
	}
	public void searchDrinkUnit() {
		System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
		String name2 = sc.next();
		for(int i = 0; i < DRINK_ARR.length; i++) {
			if(DRINK_ARR[i] == null) {
				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
				break;
			}else if(name2.equals(DRINK_ARR[i].getName())) {
				System.out.println(i + "\t" + DRINK_ARR[i].toString());
				break;
			}else if (i == (DRINK_ARR.length - 1)){
				System.out.print("해당메뉴가 목록에 존재하지 않습니다.");
			}
		}
	}
}
