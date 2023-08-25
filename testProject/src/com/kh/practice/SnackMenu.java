package com.kh.practice;
import java.util.*;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	
	private Snack ss = new Snack();
	public SnackMenu () {
		
	}
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		ss.setKind(sc.next());
		
		System.out.print("이름 : ");
		ss.setName(sc.next());
		
		System.out.print("맛 : ");
		ss.setFlavor(sc.next());
		
		System.out.print("개수 : ");
		ss.setNumOf(sc.nextInt());
		
		System.out.print("가격 : ");
		ss.setPrice(sc.nextInt());
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		sc.next();
		
		if(sc.next().equals('y')) {
			System.out.print();
		}
	}
}
