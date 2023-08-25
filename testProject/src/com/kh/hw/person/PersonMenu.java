package com.kh.hw.person;
import java.util.*;
public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+ pc.personCount().length + "명입니다.");
		System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 "+ pc.personCount().length + "명입니다.");
		System.out.println();
		System.out.println("1. 학생 메뉴 ");
		System.out.println("2. 사원 메뉴 ");		
		System.out.println("9. 끝내기 ");
		System.out.print("메뉴 번호 : ");
		
		boolean isTrue = true;
		while(isTrue) {
			switch(sc.nextInt()) {
				case 1:
					this.studentMenu();
					isTrue = false;
					break;
				case 2:
					this.employeeMenu();
					isTrue = false;
					break;
				case 9:
					System.out.print("종료합니다.");
					isTrue = false;
					break;
				default:
					System.out.print("잘못 입력하셨습니다. 다시 입력해주세요.");
				
			}
		}
		
	}
	
	public void studentMenu() {
		System.out.println("1. 학생 추가 ");
		System.out.println("2. 학생 보기 ");		
		System.out.println("9. 메인으로 ");
		System.out.print("메뉴 번호 : ");
		
		switch(sc.nextInt()) {
			case 1:
				this.insertStudent();
				break;
			case 2:
				this.printStudent();
				break;
			case 9:
				this.mainMenu();
		}
	}
	
	public void  employeeMenu() {
		System.out.println("1. 사원 추가 ");
		System.out.println("2. 사원 보기 ");		
		System.out.println("9. 메인으로 ");
		System.out.print("메뉴 번호 : ");
		
		switch(sc.nextInt()) {
			case 1:
				this.insertEmployee();
				break;
			case 2:
				this.printEmployee();
				break;
			case 9:
				this.mainMenu();
		}
	}
	
	public void insertStudent() {
		for(int i = 0; i < pc.personCount().length; i++) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			
			switch(sc.next().charAt(0)) {
				case 'N':
				case 'n':
					break;
				default : 
					this.insertStudent();
			}
		}
	}
	
	public void  printStudent() {
		
	}
	
	public void  insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
