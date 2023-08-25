package testProject;

import java.util.Scanner;

public class Iftest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		
//		if (num1>=100) {
//			System.out.println("3자리 수 이상입니다.");
//		} else if (num1<100){
//			System.out.println("3자리 수 이하입니다.");
		
//		int num = sc.nextInt();
//		
//		if (num>0) {
//			System.out.print("양수다");	
//		} else if (num==0) {
//			System.out.print("0이다.");
//		} else {
//			System.out.print("양수가 아니다.");
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		
//		if (num==0) {
//			System.out.print("0이다.");
//		} else if(num%2==0){
//			System.out.print("짝수다.");
//		} else {
//			System.out.print("홀수다.");
//		}
		
//		System.out.print("인원 수 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("사탕 개수 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("\n인당 사탕 개수 : " + (num2 / num1));
//		System.out.print("남는 사탕 개수 : " + (num2 % num1));
		
		
//		String name;
//		char gender;
//		int grade, classroom, number;
//		float score;
//		
//		System.out.print("이름 : ");
//		name = sc.nextLine();
//		
//		System.out.print("학년(숫자만) : ");
//		grade = sc.nextInt();
//		
//		System.out.print("반(숫자만) : ");
//		classroom = sc.nextInt();
//		
//		System.out.print("번(숫자만) : ");
//		number = sc.nextInt();
//		
//		System.out.print("성별(M/F) : ");
//		gender = sc.next().charAt(0);
//	// gender = (sc.next().charAt(0) == 'M') ? '남' : '여';
//		if (gender == 'M') {
//			gender = '남';
//		} else {
//			gender = '여';
//		}
//		
//		System.out.print("성적(소수점 아래 둘째자리까지) : ");
//		score = sc.nextFloat();
//		
//		System.out.print(grade + "학년 " + classroom + "반 " + number + "번 " + name +" " + gender + "자의 성적은 " + score + "이다.") ;
//		
//		
//		
//		
//		int age;
//		System.out.print("나이 : ");
//		age = sc.nextInt();
//		
//		if(age<13) {
//			System.out.print("어린이");
//		} else if (age > 13 && age <= 19){
//			System.out.print("청소년");
//		} else {
//			System.out.print("성인");
//		}
//		
//		int age;
//		String grade;
//		System.out.print("나이 : ");
//		age = sc.nextInt();
//		
//		if(age<13) 
//			grade = ("어린이");
//		 else if (age > 13 && age <= 19)
//			grade = ("청소년");
//		 else 
//			grade = ("성인");
//		
//		grade = (age <= 13) ? "어린이" : ((age > 13 && age <= 19) ? "청소년" : "성인");
//		System.out.print(grade);
		
//		int num1, num2, num3, total;
//		float average;
//		
//		System.out.print("국어 : ");
//		num1 = sc.nextInt();
//		System.out.print("영어 : ");
//		num2 = sc.nextInt();
//		System.out.print("수학 : ");
//		num3 = sc.nextInt();
//		
//		total = num1 + num2 + num3;
//		System.out.println("합계 : " + total);
//		
//		average = total / (float)3;
//		System.out.println("평균 : " + average);
//		
//		if ((num1>=40 && num2>=40 && num3>= 40) && average>=60)
//				System.out.print("합격");
//		else
//			System.out.print("불합격");
//		
//		String pn;
//		
//		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		pn = sc.next();
//		
//		if (pn.charAt(7) == '1' || pn.charAt(7) == '3')
//			System.out.print("남자");
//			else
//				System.out.print("여자");
		
		int A,B,C;
		float a,b;
		double c;
		System.out.print("A사원의 연봉 : ");
		A = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		B = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		C = sc.nextInt();
		
		System.out.println();
		
		a = A + (A * 0.4f);
		System.out.println("A사원의 연봉/연봉+a : " + A + "/" + a);
		if (a>=3000)
			System.out.println("3000이상");
		else
			System.out.println("3000미만");
		// System.out.print((A + (A * 0.4f)) >= 3000 ? "3000이상" : "3000미만");
		b = B +(B * 0.0f);
		System.out.println("B사원의 연봉/연봉+a : " + B + "/" + b);
		if (b>=3000)
			System.out.println("3000이상");
		else
			System.out.println("3000미만");
		
		c = C*1.15;
		System.out.println("C사원의 연봉/연봉+a : " + C + "/" + c);
		if (c>=3000)
			System.out.print("3000이상");
		else
			System.out.print("3000미만");
		
		
	}

}
