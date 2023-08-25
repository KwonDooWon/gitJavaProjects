package OOP5;
import java.util.Scanner;
public class Run {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num >10) {
			System.out.println("10초과");
		}else if(num <=10 ){
			System.out.println("10이하");
		}
		
		for(int i = 1; i <=num; i++) {
			System.out.print((1000 - i) + " ");
		}
		
		int[] arr = new int[num];
		for(int i = 0; i < arr.length;i++) {
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		Human doowon = new Student("권두원", 26);
		((Student)doowon).swim();
		((Student)doowon).sleep();
		((Student)doowon).makeSound();
	}
}
