package com.kh.javai;
import java.util.*;
//main메서드를 실행해주기위한 class
public class MainStart {
	public static void main(String[] args) {
		//인스턴스 객체생성 방법
		//클래스 객체이름 = new 생성자(클래스와 이름이 동일한 메서드);
//		Student kwon = new Student("권두원", 26, "남자");
//		Student kim = new Student("김라라", 62, "여자");
//		아래 두 코드를 실행되면 각기 다른 결과값이 나타나다.
//		이를통해 각기 다른 메모리공간을 확보하고 사용한다.
//		kwon.info();
//		kim.info();
		
//		Scanner sc = new Scanner(System.in);
//		
//		int ec,kc,mc;
//		
//		ec = sc.nextInt();
//		kc = sc.nextInt();
//		mc = sc.nextInt();
//		
//		Student score = new Student(ec,kc,mc);
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int en, ko, math;
//	      System.out.print("영어점수 : ");
//	      en = sc.nextInt();
//	      kwon.setEnScore(en);
//	      kwon.setEnScore(sc.nextInt());
//	      
//	      System.out.print("국어점수 : ");
//	      kwon.setKoScore(sc.nextInt());
//	      
//	      System.out.print("수학점수 : ");
//	      kwon.setMathScore(sc.nextInt());
//	      
//	      System.out.print("총 합 : " + kwon.getTotal());
//	      System.out.print("평 균 : " + kwon.getAvg());
//	      
//	      System.out.print("영어점수 : " + kwon.getEnScore());
//	      System.out.print("국어점수 : " + kwon.getKoScore());
//	      System.out.print("수학점수 : " + kwon.getMathScore());
//	      
//	      kwon.checkPass();
//	      if (ko >= 40 && en >= 40 && math >= 40 && (kwon.getAvg() >= 60) {
//	         System.out.print("합격입니다.");
//	      } else {
//	         System.out.print("불합격입니다.");
//	      }
//		Scanner sc = new Scanner(System.in);
//		
//		Car doowonCar = new Car("검은색", "벤츠", "중형", "가솔린", "2023-08-04", 150, 5, 100);
//		doowonCar.statusDisplay();
//		boolean isFinish = false;
//		while(!isFinish) {
//			int num;
//			System.out.println("원하는 행동의 버튼을 클릭하세요.");
//			System.out.println("------------------------");
//			System.out.println("1. 달린다.");
//			System.out.println("2. 멈춘다");
//			System.out.println("3. 기름을 충전한다.");
//			System.out.println("4. 속도와 잔여기름양을 확인한다.");
//			System.out.println("다른버튼을 누르면 종료");
//			System.out.println("------------------------");
//			
//			num = sc.nextInt();
//			switch(num) {
//			case 1:
//				doowonCar.onaxel();
//				doowonCar.statusDisplay(2);
//				break;
//			case 2:
//				doowonCar.onBreak();
//				break;
//			case 3:
//				System.out.print("얼마나 충전하시겠습니까?");
//				int cc = sc.nextInt();
//				doowonCar.insertCc(cc);
//				break;
//			case 4:
//				doowonCar.statusDisplay(2);
//			default:
//				isFinish = true;
//			}
//		}
//		
//		System.out.print(choi.count);
//		Student choi = new Student("지원", 32, "남자");
//		System.out.print(choi.count);
//		Student kwon = new Student("두원", 26, "남자");
//		System.out.print(kwon.count);
//		Student lee = new Student("이지", 25, "여자");
//		System.out.print(lee.count);
		
//		Scanner sc = new Scanner(System.in);
//		
//		//객체이름이 각각 yoon,choi,kim인 Student 객체를 생성해라
//		Student yoon = new Student("윤지원", 15, "남자");
//		Student choi = new Student("최소연", 25, "여자");
//		Student kim = new Student("김기범", 42, "남자");
//		Student[] iban = new Student[3];
//		iban[0] = new Student("윤지원", 15, "남자");
//		iban[1] = new Student("최소연", 25, "여자");
//		iban[2] = new Student("김기범", 42, "남자");
		
		Scanner sc = new Scanner(System.in);
		char classRoom;
		int choice;
		//최대 학생에 수는 30인 클래스(i, j, h)를 3개 만들어라
		
		Student[] iban = new Student[30];
		Student[] jban = new Student[30];
		Student[] hban = new Student[30];
		Student[] selectBan;
		
		while(true) {
			//관리할 클래스를 선택해 주세요. (i j k) :
			System.out.print("관리할 클래스를 선택해 주세요. (i j k반 중 선택 다른키워드 입력시 종료) : ");
			classRoom = sc.next().charAt(0);
	
			
			switch(classRoom) {
				case 'i':
					selectBan = iban;
					break;
				case 'j':
					selectBan = jban;
					break;
				case 'h':
					selectBan = hban;
					break;
				default:
					selectBan = null;
			}
			
			if(selectBan == null)
				break;
			//1.학생추가
			//2.학생제거
			//3.학생목록 확인
			//4.학생조회
			//기타입력시 뒤로 그전까지 반복
			boolean isTrue = true;
			while(isTrue) {
				System.out.println("1.학생추가");
				System.out.println("2.학생제거");
				System.out.println("3.학생목록 확인");
				System.out.println("4.학생조회");
				System.out.println("기타입력시 뒤로");
				choice = sc.nextInt();
				
				switch(choice) {
					case 1: {
						int age;
						String name, gender;
						System.out.println("추가할 이름, 나이, 성별을 입력해 주세요.");
						name = sc.next();
						age = sc.nextInt();
						gender = sc.next();
						
						//selectBan의 마지막 빈자리를 찾는다.
						int index = 0;
						while(selectBan[index] != null && index < selectBan.length) {
							index++;
						}
						if (index == selectBan.length) {
							System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
						}else
							selectBan[index] = new Student(name, age, gender);
					}break;
					
					case 2:{
						int index = 0;
						while(index < selectBan.length && selectBan[index] != null) {
							index++;
						}
						if(index == 0)
							System.out.println("삭제할 학생이 없습니다.");
						else
							selectBan[index - 1] = null;
						Student.count--;
					}
					break;
					
					case 3:{
						System.out.println("------------------");
						System.out.println("이름\t나이\t성별");
						for (int i = 0; i < selectBan.length; i++) {
							if ( selectBan[i] == null)
								break;
							selectBan[i].info();
						}	
						System.out.println("------------------");
					}break;
					
					case 4: {
						//조회할 학생의 정보를 입력하세요(이름, 나이, 성별)
						System.out.println("조회할 학생의 정보를 입력하세요(이름, 나이, 성별) : ");
						String name = sc.next();
						int age = sc.nextInt();
						String gender = sc.next();
						Student tmp = null;
						//selectBan에 해당 정보와 동일한 학생조회
						for(int i = 0; i < selectBan.length; i++) {
							if (selectBan[i] == null)
								break;
							else if (selectBan[i].getAge() == age && selectBan[i].getName().equals(name) && selectBan[i].getGender().equals(gender)) {
								tmp = selectBan[i];
								break;
							}
						}
						
						//해당 학생은 이미 등록 완료되었습니다.
						// or 해당학생을 찾을 수 없습니다.
						if (tmp != null)
							System.out.println("해당 학생은 이미 등록 완료되었습니다.");
						else
							System.out.println("해당 학생을 찾을 수 없습니다.");
					}break;
					default:
						isTrue = false;
				}
			}
		}
	}
}
