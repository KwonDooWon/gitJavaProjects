package testProject;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		/* for(초기식; 조건식; 증감식){
		 * 수행될 문장
		 * }
		 * 초기식 : 반복문을 시작할 때 한번 세팅을 위한 값
		 * 조건식 : 매번 반복하기 전에 조건에 부합하는지 확인 후 부합하면 반복진행
		 * 증감식 : 반복이 끝날때마다 반복문 탈출을 위해 한번 연산을 진행
		 */
		/*while(조건식){
		 * 
		 * 
		 * 
		 * }
		 */
		/*do{
		 * 
		 * 실행할 식
		 * 
		 * }while(조건식);
		 */
//	for(int i = 1; i <= 10; i++) {
//		System.out.println(i + "출력");
//	}
//	int i = 0;
//	while(i<10) {
//		System.out.println(+ "출력");
//		i++;
//	}
		
//		for (int i= 0; i < 10; i=i+2) {
//			System.out.println(i);
//		}
		
//		int dan = 2;
//		for (int i = 1; i<=9; i++) {
//			System.out.println(dan + "*" + i + "=" + (i*dan));
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num1;
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num1 = sc.nextInt();
//		
//		if(num1 >=1) {
//			for(int i=1;i<=num1;i++) {
//				System.out.print(i);
//			}
//		}else
//			System.out.print("1이상의 숫자를 입력해주세요.");
		
		//입력 1개 받기
		//입력받은 값까지 전부 출력(1~입력)
		//만약 1미만 예외처리 반복
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		do {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num<1)
//				System.out.println("1이상의 숫자를 입력해주세요.");
//			else {
//				int i = 1;
//				while(i<=num) {
//					System.out.print(i + " ");
//					i++;
//				}
//			}
//			
//		}while(num<1);

//		Scanner sc = new Scanner(System.in);
//		int num, sum = 0;
//		System.out.print("정수를 하나 입력하세요 : ");
//		num=sc.nextInt();
//		
//		for(int i = 1; i <= num; i++) {
//			sum = sum + i;
//			if (i== num)
//				System.out.print(i + "=" + sum);
//			else
//				System.out.print(i + "+");
//		}
		

		Scanner sc = new Scanner(System.in);
		int num1, num2, max, min;
		do {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
		
		if (num1>0 && num2 > 0) {
			if (num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		}while(num1 < 1||num2<1);
}
}