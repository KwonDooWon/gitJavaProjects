package testProject;
import java.util.Scanner;
public class Codeup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, d, n;
		int sum= 0;
		a = sc.nextInt();
		d = sc.nextInt();
		n = sc.nextInt();
		
		if(a>=0 && a<=100 && d>=0 && d<=100 && n>=0 && n<=100) {
				sum = a + (d*(n-1));
			System.out.print(sum);
		}
	}
}
