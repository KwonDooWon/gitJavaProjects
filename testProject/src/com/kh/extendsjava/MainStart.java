package com.kh.extendsjava;
import java.util.*;

public class MainStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human kwon = new Human("권두원","남자",26,60.0);
		Human[] people = new Human[10];
		people[0] = new Human("권두원","남자",26,60.0);
		
		String name, gender;
		int age;
		double weight;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("성별을 입력하세요 : ");
		gender = sc.next();
		System.out.print("나이을 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("몸무게을 입력하세요 : ");
		weight = sc.nextDouble();
		
		people[1] = new Human(name, gender, age, weight);
		
		System.out.println("이름\t성별\t나이\t몸무게");
		for(int i = 0; i < people.length; i++) {
			if(people[i] == null) {
				break;
			}else {
				System.out.println(people[i].toString());
			}
		}
		
//		for(int i = (people.length - 1); i >=0; i--) {
//			if(people[i] != null) {
//				people[i] = null;
//			}
//		}
		Human selectPeople;
		int number;
		System.out.print("수정할 사람의 번호를 입력하세요 : ");
		number = sc.nextInt();
		selectPeople = people[number];
		
		if(selectPeople == null) {
			System.out.println("해당 번호의 사람 존재하지 않습니다.");
		}else {
			System.out.print("수정할 정보를 입력하세요 : ");
			switch(sc.next()) {
				case"이름":
					sc.nextLine();
					System.out.print("새로운 이름을 입력하세요 : ");
					selectPeople.setName(sc.nextLine());
					System.out.println(selectPeople.toString());
					break;
				case"성별":
					sc.nextLine();
					System.out.print("새로운 성별을 입력하세요 : ");
					selectPeople.setGender(sc.nextLine());
					System.out.println(selectPeople.toString());
					break;
				case"나이":
					sc.nextLine();
					System.out.print("새로운 나이을 입력하세요 : ");
					selectPeople.setAge(sc.nextInt());
					System.out.println(selectPeople.toString());
					break;
				case"몸무게":
					sc.nextLine();
					System.out.print("새로운 몸무게를 입력하세요 : ");
					selectPeople.setWeight(sc.nextDouble());
					System.out.println(selectPeople.toString());	
				default:
					System.out.print("잘못입력하셧습니다");
			}
		}
	}
}
