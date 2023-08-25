package com.kh.OOP3;
import java.util.Scanner;
public class Run {
	public static void main(String args[]) {
//		Dog dog = new Dog();
//		dog.eat("고기");
//		dog.move();
//		
//		Cat cat = new Cat();
//		cat.eat("생선");
//		cat.move();
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("a/b...a? ");
			int n1 = sc.nextInt();
			System.out.print("a/b...b? ");
			int n2 = sc.nextInt();
			System.out.printf("%d / %d = %d \n" , n1, n2, n1 /n2);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Good bye~~!");
	}
}
