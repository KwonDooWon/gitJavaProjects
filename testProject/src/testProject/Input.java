package testProject;
//1
import java.util.*;

public class Input {
	public static void main(String[] args) {
//		//2
//		int num, num2;
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		num2 = sc.nextInt();
//		System.out.print(num + num2);
		
		String str1, str2, str3;
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.nextLine();
		str3 = sc.next();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}