package testProject;
import java.util.*;
public class Method {
	public static void main(String[] args) {
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();
//	}
//	
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("저의 키는 " + height + "cm 입니다.");
//	}
//	
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다.");
//	}
//	
//	public static void main(String[] args) {
//		int result;
//		result = adder(4, 5);
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 * 3.5 = " + square(3.5));
//	}
//	
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//	
//	public static double square(double num) {
//		return num * num;
//	}
//		System.out.print(factorial(3));
//	
//	}
//	public static int factorial(int n) {
//		if(n==1)
//			return 1;
//		else
//			return n * factorial(n-1);
//	}
//		
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
//		
//		System.out.println(yoon.balance);
//		System.out.println(park.balance);
//		
//		yoon.deposit(1000);
//		park.deposit(2000);
//		
//		System.out.println(yoon.checkMyBalance());
//		System.out.println(park.checkMyBalance());
		
		BankAccount yoon = new BankAccount();
		BankAccount kwon = new BankAccount();
		BankAccount kim = new BankAccount(10000, "김지원");
		
	}
}
class BankAccount {
	int balance = 0;
	String name;
	public BankAccount() {
		balance = 0;
		name = "이름없음";
	}
	
	public BankAccount(int b, String n) {
		balance = b;
		name = n;
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
		
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
		
	}
	
	public int checkMyBalance() {
		System.out.println("이름 : " + name);
		System.out.println("잔액 : " + balance);
		return balance;
		
	}
}