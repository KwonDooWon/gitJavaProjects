package testProject;
import java.util.*;
public class Alone {
	public static void main(String[] args) {
		//1번
//		Scanner sc = new Scanner(System.in);
//		String name;
//		char ch;
//		int num1;
//		float num2;
//		
//		System.out.print("이름을 입력하세요 : ");
//		name = sc.next();
//		System.out.print("성별을 입력하세요(남/여) : ");
//		ch = sc.next().charAt(0);
//		System.out.print("나이를 입력하세요 : ");
//		num1 = sc.nextInt();
//		System.out.print("키를 입력하세요 : ");
//		num2 = sc.nextFloat();
//		
//		System.out.print("키 " + num2 + "cm인 " + num1 + "살 " + ch + "자 " + name + "님 반갑습니다^^");
		
		//2번
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		
//		System.out.print("첫 번째 정수 : ");
//		num1 = sc.nextInt(); 
//		System.out.print("두 번째 정수 : ");
//		num2 = sc.nextInt();
//		
//		System.out.println("더하기 결과 : " + (num1 + num2));
//		System.out.println("빼기 결과 : " + (num1 - num2));
//		System.out.println("곱하기 결과 : " + (num1 * num2));
//		System.out.print("나누기 결과 : " + (num1 / num2));
		
		//3번
//		Scanner sc = new Scanner(System.in);
//		float num1, num2;
//		
//		System.out.print("가로 : ");
//		num1 = sc.nextFloat();
//		System.out.print("세로 : ");
//		num2 = sc.nextFloat();
//		
//		System.out.println("면적 : " + (num1 * num2));
//		System.out.print("둘레 : " + ((num1 + num2)*2));
		
		//4번
//		Scanner sc = new Scanner(System.in);
//		String str;
//		
//		System.out.print("문자열을 입력하세요 : ");
//		str = sc.next();
//		
//		System.out.println("첫 번째 문자 : " + str.charAt(0));
//		System.out.println("두 번째 문자 : " + str.charAt(1));
//		System.out.print("세 번째 문자 : " + str.charAt(2));
		
		//5번
//		Scanner sc = new Scanner(System.in);
//		float num1, num2, num3;
//		
//		System.out.print("국어 : ");
//		num1 = sc.nextFloat();
//		System.out.print("영어 : ");
//		num2 = sc.nextFloat();
//		System.out.print("수학 : ");
//		num3 = sc.nextFloat();
//		
//		System.out.println("총점 : " + (int)(num1 + num2 + num3));
//		System.out.println("평균 : " + (int)((num1 + num2 + num3)/3));
		
		//6번
//		Scanner sc = new Scanner(System.in);
//		String name;
//		int num1, num2, num3;
//		char ch;
//		float score;
//		
//		System.out.print("이름 : ");
//		name = sc.next();
//		System.out.print("학년(숫자만) : ");
//		num1 = sc.nextInt();
//		System.out.print("반(숫자만) : ");
//		num2 = sc.nextInt();
//		System.out.print("번호(숫자만) : ");
//		num3 = sc.nextInt();
//		System.out.print("성별(M/F) : ");
//		ch = sc.next().charAt(0);
//		System.out.print("성적(소수점 아래 둘째자리까지) : ");
//		score = sc.nextFloat();
//		
//		System.out.println();
//		
//		if (ch=='M')
//			ch = '남';
//			else
//				ch = '여';
//		
//		System.out.print(num1 + "학년 " + num2 + "반 " + num3 + "번 " + name + " " + ch + "학생의 성적은 " + score + "이다.");
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//
//		ex.
//		1 2 3 4 5 6 7 8 9 10 

//		int[] arr = new int[10];
//		
//		for(int i = 0; i<arr.length;i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
		
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//
//		ex.
//		양의 정수 : 5
//		1 2 3 4 5 
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		System.out.print("양의 정수 : ");
//		num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for(int i = 0; i <arr.length;i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
		
		
//		길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		배열 인덱스를 활용해서 귤을 출력하세요.
//
//		ex.
//		귤
		
//		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
//		System.out.print(arr[1]);

//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
//
//		ex.
//		문자열 : application
//		문자 : i
//		application에 i가 존재하는 위치(인덱스) : 4 8 
//		i 개수 : 2

//		Scanner sc = new Scanner(System.in);
//		String str;
//		char ch;
//		int count = 0;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		
//		int[] arr = new int[str.length()];
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : " );
//		for(int i = 0; i < arr.length;i++) {
//			if(str.charAt(i)==ch) {
//				System.out.print(i + " ");
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(str.charAt(i)==ch) {
//				arr[i] = i;
//				count++;
//			}
//		}
//		System.out.print( ch + " 개수 : " + count);
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.print("정수 : ");
//		num = sc.nextInt();
		
//		if(num>=1 && num <=10) {
//			if (num % 2 == 0) {
//				System.out.print("짝수입니다.");
//			}else{
//				System.out.print("홀수입니다.");
//			}
//		}
		
//		if(num >=1 && num <= 50) {
//			for(int i = 1; i<=num; i++) {
//				System.out.println(i);
//			}
//		}
		
		int[] arr = new int[10];
		int num = 11;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num++;
			System.out.print(arr[i] + " ");
		}
	}
}