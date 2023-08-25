package com.kh.OOP4;
import java.util.*;
public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		if(num % 2 == 1) 
			System.out.println("홀수입니다.");
		else
			System.out.println("짝수 입니다.");
		
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		Bird bird = new Bird("까마귀",1);
		bird.fly();
		bird.makeSound();
		
		Animal fish = new Fish("참치",1);
		((Fish)fish).swim();
		fish.makeSound();
	}
}
