package testProject;
import java.util.Scanner;
public class Study0728 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num,i;
//		i=0;
//
//		while(i==0) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//		if (num >= 1)
//			for(i=1;num>=i;i++)
//				System.out.print(i + " ");
//		else
//			System.out.println("1이상의 숫자를 입력해주세요.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num,sum =0 ;
//		System.out.print("정수를 하나 입력하세요 : ");
//		num= sc.nextInt();
//		
//		for(int i = 1;num>=i;i++) {
//			sum = i + sum;
//			if(i==num)
//				System.out.print(i + " = " + sum);
//			else
//			System.out.print(i + "+ ");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.print("숫자 : ");
//		num = sc.nextInt();
//		System.out.println("=====4단=====");
//		for(int i = 1;i<10;i++) {
//			System.out.println(num + " * " + i + " = " + (i*num));
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		do {
//		System.out.print("숫자 : ");
//		num = sc.nextInt();
//		
//		if(num<10) {
//			for(int j = num;9>=j;j++) {
//				System.out.println("=====" + j + "단=====");
//				for(int i = 1;i<10;i++) {
//					System.out.println(j + " * " + i + " = " + (i*j));
//				}
//			}
//		}else
//			System.out.println("9 이하의 숫자만 입력해주세요.");
//		}while(num>9);
		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2 = 0;
//		
//		System.out.print("시작 숫자 : ");
//		num1 = sc.nextInt();
//		System.out.print("공차 : ");
//		num2 = sc.nextInt();
//		
//		for(int i=0;i<10;i++) {
//			System.out.print(num1+(num2 * i)+" ");
//			/*System.out.print(num1 + " ");
//			  num1 = num1 + num2;*/
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num1, num2;
//		String op;
//		while(true) {
//			System.out.print("연산자(+, -, /, %) : ");
//			op = sc.next();
//			
//			if (op.equals("exit")) {
//				System.out.print("프로그램을 종료합니다.");
//				break;}
//			System.out.print("정수1 : ");
//			num1 = sc.nextInt();
//			System.out.print("정수2 : ");
//			num2 = sc.nextInt();
//		
//		
//			switch(op) {
//				case "+":
//					System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
//					break;
//				case "-":
//					System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
//					break;
//				case "*":
//					System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
//					break;
//				case "/":
//					if(num2 == 0) {
//						System.out.print("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//					}else {
//						System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
//					}break;
//				case "%":
//					System.out.print(num1 + " % " + num2 + " = " + (num1 % num2));
//					break;
//				default:
//					System.out.print("없는 연산자입니다. 다시 입력해주세요.");
//				}
//			
//				
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		//몇줄 실행할 것인가? 세로
//		for(int i = 1 ; i<=num ; i++) {
//			//몇번 실행하고 싶은가? 가로
//			for (int j = 0;j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		do {
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		if(num>0) {
//		for(int i = 1 ; i <= num; i++) {
//			if(i%2==1)
//				System.out.print("박");
//			else
//				System.out.print("수");
//			}
//		}else
//			System.out.println("양수가 아닙니다.");
//		}while(num<1);
		
		Scanner sc = new Scanner(System.in);
		int num1, num2, count = 0;
		
		System.out.print("난수를 입력하세요 : ");
		num1 = sc.nextInt();
		
		while(true) {
		System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
		num2 = sc.nextInt();
		count++;
		
			if (num2==num1) {
				System.out.println("정답입니다!!");
				System.out.println(count + "회만에 맞추셨습니다.");
				break;
			}
			else if(num2<1 || num2>100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				count--;			
			}
			else if (num1<num2) {
				System.out.println("DOWN !");
				
			}
			else if (num1>num2) {
				System.out.println("UP !");
				
			}
			
		}
		
	}

}
