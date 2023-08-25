package testProject;
import java.util.*;
import java.math.*;
public class Array {
	public static void main(String[] args) {
		//자료형[]배열이름;           //배열의 선언
		//배열이름 = new 자료형[길이]; //배열의 메모리 생성
		//int[] arr = {1, 2, 3}; //배열생성 및 초기화
//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] +ar[2];
//		System.out.print(num);
//		
//		//길이가 5인 int형 1차원 배열 생성
//		int[] ar1 =new int[5];
//		
//		//길이가 7인 double형 1차원 배열 ar2생성
//		double[] ar2 = new double[7];
//		
//		//배열의 변수선언과 메모리할당을 분리하여 길이가 9인 float형 배열 ar3생성
//		float[] ar3;
//		ar3 = new float[9];
//		
//		System.out.println("ar1의 길이 : " + ar1.length);
//		System.out.println("ar2의 길이 : " + ar2.length);
//		System.out.println("ar3의 길이 : " + ar3.length);
//		
//		String str = "doowon";
//		System.out.println("str의 길이 : " + str.length());
//		
//		String str[] = new String[5];
//		str[0] = "jiwon";
//		str[1] = new String("cafe");
//		str[4] = "hi";
//		str[2] = "tree";
//		str[3] = "choi";
//		
//		int sum = 0;
//		
//		for (int i = 0; i < str.length; i++)
//			sum += str[i].length();
//		
//		System.out.println("총 문자의 수는 " + sum);
//		
//		int sum = str[0].length() + str[1].length() + str[4].length() + str[2].length() + str[3].length();
//		System.out.println("총 문자의 수는 " + sum);
//		
//		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.print(arr1[2]);
		
//		//깊은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = new int[5];
			
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println("arr1[" + i + "] :" + arr1[i]);
//		}
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println("arr2[" + i + "] :" + arr2[i]);
//		}
		
		//보편적인 배열 복사방법 : arr2 = arr1.clone();
		
		//배열 arr1을 전부 7로 초기화
		//Arrays.fill(arr1, 7);
		
//		int[] arr = new int[10];
//		
//		for (int i = 1;i<=10;i++) {
//			arr[i - 1] = i;
//			System.out.print(i + " ");
//		}
		
//		int[] arr = new int[10];
//		
//		for (int i = 10;i>=1;i--) {
//			arr[i-1] = i;
//			System.out.print(i + " ");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.print("양의 정수 : ");
//		num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for (int i = 0; i<arr.length;i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i]+ " ");
//		}
//		
//		String[] arr = {"사과","귤","포도","복숭아","참외"};
//		System.out.print(arr[1]);
		
//		Scanner sc = new Scanner(System.in);
//		String str;
//		char ch;
//		int[] strLoc;
//		int count = 0;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		strLoc = new int[str.length()];
//		
//		System.out.print("문자 : ");
//		ch = sc.next().charAt(0);
//		
//		System.out.print("application에 i가 존재하는 위치(인덱스) : " );
//		for(int i =0; i<=str.length();i++) {
//			if(str.charAt(i)==ch) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		
//		System.out.print(ch + " 개수 : " + count);
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		String[] str = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
//		 
//		
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		num = sc.nextInt();
//		
//		switch(num) {
//		case 0:
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//			System.out.print(str[num]);
//			break;
//		default:
//			System.out.print("잘못 입력하셧습니다.");
		
//		Scanner sc = new Scanner(System.in);
//		int num,a,total=0;
//		
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		
//		for(int i = 0;i < arr.length;i++) {
//			System.out.print("배열 " + i +"번째 인덱스에 넣을 값 : ");
//			arr[i] = sc.nextInt();
//		}
//		for(int i = 0;i< arr.length;i++) {
//			total += arr[i];
//			System.out.print(arr[i] + " ");
//		}
//		System.out.print("\n총 합 : " + total);
		
//		Scanner sc = new Scanner(System.in);
//		int num, count = 0;
//		int[] arr;
//		
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		arr = new int[num];
//		do{
//			if(num>=3 && num%2==1) {
//				for(int i = 0; i < arr.length;i++) {
//					if((arr.length / 2) < i) {
//						count--;
//					}else {
//						count++;
//					}
//					arr[i] = count;
//				}	
//				for(int i = 0; i < arr.length;i++) {
//					System.out.print(arr[i] + ", ");
//				}
//				break;
//			}else
//				System.out.println("다시 입력해주세요.");
//		}while(true);
		
//		Scanner sc = new Scanner(System.in);
//		String str;
//		String[] arr = {"양념","후라이드","반반"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		str = sc.next();
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (str.equals(arr[i])) {
//				System.out.print(str + " 치킨 배달 가능");
//				break;
//			} else {
//				System.out.print(str + " 치킨은 없는 메뉴입니다.");
//				break;
//			}
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		char[] arr1 = new char[14];
//		char[] arr2 = new char[14];
//		
//		System.out.print("주민등록번호(-포함) : ");
//		arr1 = sc.next().toCharArray();
//		
//		for(int i = 0; i < arr1.length;i++) {
//			arr2[i] = arr1[i];
//		}
//		for(int i = 0; i < arr2.length;i++) {
//			if(i>=8)
//				arr2[i] = '*';
//		}
//		System.out.print(arr2);
		
		//Math.random() : 0보다 크고 1보다 작은 난수 발생
		// 값을 곱하고 int형으로 변환해서 정수형 난수를 발생시킬 수 있다.
		//(int)(Math.random() * 10 + 1);
		
//		int[]arr = new int[10];
//		int min = 11;
//		int max = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10 + 1);
//			System.out.print(arr[i] + " ");
//			max = (max>arr[i])? max : arr[i];
//			min = (min<arr[i])? min : arr[i];
//		}
//		
//		System.out.println("\n최대값 : " + max);
//		System.out.print("최소값 : " + min);
//		
//		int[]arr = new int[10];
//		
//		int i = 0;
//		while(i < arr.length) {
//			int nan = (int)(Math.random() * 10 + 1);
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			
//			if (nan==0)
//				continue;
//			else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		
//		for (i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		//int형 변수 num을 생성하고 값을 10으로 초기화
//		int num = 10;
//		//String형 변수 str을 생성하고 값을 "hi"로 초기화
//		String st;
//		st = "hi";
//		//num과 str을 출력
//		System.out.println(num);
//		System.out.println(st);
//		//만약 num이 5보다 크다면 "num은 5보다 큰 수 입니다"출력]
//		if (num>5)
//			System.out.println("num은 5보다 큰 수 입니다");
//		//더 작다면 "num은 5보다 작은 수 입니다"출력
//		if (num<5)
//			System.out.println("num은 5보다 작은 수 입니다");
//		//5라면 "num은 5입니다" 출력
//		if (num == 5)
//			System.out.println("num은 5입니다");
//		//반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
//		//ex) num = 3일때 1 2 3출력
//		//for while각각 작성
//		for (int i = 1;i<=num;i++)
//			System.out.print(i + " ");
//		
//		int i = 1;
//		while(i<num+1) {
//			System.out.print(i + " ");
//		}
//		//길이가 20인 int형 배열 arr생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
//		int[] arr1 = new int[20];
//		
//		for (int j = 0; j<arr1.length;i++)
//			arr1[j] = i+1;
//		//반복문을 이용하여 arr 요소 전체출력
//		for (int m = 0;m<arr1.length;m++)
//			System.out.print(arr1[m] + " ");
//		//string형 길이가 5인 배열 arr2을 생성하고 생성과 동시에 {"사과", "포도", "귤", "파인애플", "바나나"}로 초기화
//		String[] arr2 = {"사과", "포도", "귤", "파인애플", "바나나"};
//		//반복문을 이용하여 arr2 요소 전체출력
//		for (int k = 0; k<arr2.length;k++)
//			System.out.print(arr2[i] + " ");
		
		//Arrays.sort(배열)    *오름차순
		//Arrays.sort(배열, Collections.reverseOrder());   *내림차순 정렬
		
//		int[] arr = new int[6];
//		
//		int i = 0;
//		while(i < arr.length) {
//			int nan = (int)(Math.random() * 45 + 1);
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			
//			if (nan==0)
//				continue;
//			else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		
//		Arrays.sort(arr);
//		for (i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String str;
//		char[] strArray;
//		
//		System.out.print("문자열 : ");
//		str = sc.next();
//		//application
//		 strArray= new char[str.length()];
// 		
//		int i = 0, j = 0;
//		while(i < str.length()) {
//			strArray[j] = str.charAt(i);
//			//중복검사
//			for(int k =0;k<j;k++) {
//				if(strArray[j]==strArray[k]) {
//					j--;
//					break;
//				}
//			}
//			i++;
//			j++;
//		}
//		System.out.print("문자열에 있는 문자 : ");
//		for (int h =0; h<strArray.length; h++) {
//			if(h == (strArray.length -1) || strArray[h + 1] == 0) {
//				System.out.println(strArray[h]);
//				System.out.print("문자 개수 : " + (h +1));
//				break;
//			} else
//				System.out.print(strArray[h] + ", ");
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		String str;
//		String[] strArray, strArray2;
//		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		num = sc.nextInt();
//		sc.nextLine();
//		
//		strArray = new String[num];
//		int i = 0;
//		while(true) {
//			//문자열을 입력받는 부분
//			for(;i < strArray.length; i++) {
//				System.out.print((i+1) + "번째 문자열 : ");
//				strArray[i] = sc.nextLine();
//			}
//			
//			//더 입력할지 안할지 확인부분
//			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
//			
//			// 더 입력하겠다.
//			if('Y' == sc.next().charAt(0)) {
//				System.out.print("더 입력하고 싶은 개수 : ");
//				num = sc.nextInt();
//				sc.nextLine();
//				strArray2 = new String[strArray.length + num];
//				
//				for (i = 0; i < strArray.length; i++) {
//					strArray2[i] = strArray[i];
//				}
//				strArray = strArray2;
//				//배열 추가로 크게 생성해주고
//				//복제
//			}else {
//				System.out.print("[");
//				for (i = 0; i < strArray.length; i++) {
//					if(i== strArray.length -1)
//						System.out.print(strArray[i] + "] ");
//					else
//						System.out.print(strArray[i] + ", ");
//				}
//				break;
//				//끝
//			}
//		}
		
		
		
//		int[][] arr = new int[3][4];
		
//		arr[0][0] = 1; 
//		arr[0][1] = 2; 
//		arr[0][2] = 3; 
//		arr[0][3] = 4; 
//		arr[1][0] = 5; 
//		arr[1][1] = 6; 
//		arr[1][2] = 7; 
//		arr[1][3] = 8; 
//		arr[2][0] = 9; 
//		arr[2][1] = 10; 
//		arr[2][2] = 11; 
//		arr[2][3] = 12;
//		
//		arr[2][0]=5;
//		arr[2][1]=5;
//		arr[2][2]=5;
//		arr[2][3]=5;
//		
//		arr[1][0] = 3;
//		arr[1][1] = 3;
//		arr[1][2] = 3;
//		arr[1][3] = 3;
//		
//		for(int i = 0; i < arr[1].length;i++) {
//			arr[1][i] = 5;
//			System.out.print(arr[1][i] + " ");
//		}
//		
//		
//		for (int i = 0; i < arr.length;i++) {
//			arr[i][0] = 5;
//			System.out.print(arr[i][0] + " ");
//		}
		
//		for (int i = 0; i < arr.length;i++) {
//			for(int j = 0; 0 <arr[i].length;j++) {
//				arr[i][j] = 5;
//				System.out.print(arr[j][i]);
//			}
//		}s
		
//		int[][] arr = {{10,10,10,10},
//					   {10,10,10},
//					   {10,10,10,10,10},
//					   {10,10}};
		
//		String[][] arr1 = {{"(0,0)","(0,1)","(0,2)"},{"(1,0)","(1,1)","(1,2)"},{"(2,0)","(2,1)","(2,2)"}};
//		
//		System.out.print(arr1[0][0]+arr1[0][1]+arr1[0][2]+ "\n" + arr1[1][0]+arr1[1][1]+arr1[1][2]+ "\n" +arr1[2][0]+arr1[2][1]+arr1[2][2]);
		
		
//		char[][] arr = {{'a','b','c'},{'d','e','f'},{'G','h','i'}};
//		System.out.print(arr[0][0]+ " " + arr[0][1]+ " " +arr[0][2]+ "\n" + arr[1][0]+ " " + arr[1][1]+" "+arr[1][2]+ "\n" +arr[2][0]+ " " +arr[2][1]+ " " +arr[2][2]);
//		
		
//		char[][] arr = new char[3][3];
//		char ch = 'a';
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j =0; j < arr[i].length; j++) {
//				arr[i][j] = ch++;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j =0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr = new int[4][4];
//		int num = 1;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num++;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}	
		
//		int[][] arr = new int[4][4];
//		int num = 16;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num--;
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}	
//		
//		int[][] arr = new int[4][4];
//		int num = 1;
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum = 0;
//			if(i<arr.length-1) {
//				for(int j = 0; j < arr[i].length; j++) {
//					if (j<arr[i].length-1) {
//						arr[i][j] = num++;
//						System.out.print(arr[i][j] + " ");
//						sum = sum + arr[i][j];
//					}else if(j == 3){
//						arr[i][j] = sum;
//						System.out.print(arr[i][j]);
//					}
//				}
//			}
//		}
//			System.out.println();
//		}
		
		
//		int[][] arr = new int[3][4];
//		int nan;
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum = 0;
//			for(int j = 0; j < arr[i].length; j++) {
//				nan = (int)(Math.random() * 10 + 1);
//				if (j<3) {
//					arr[i][j] = nan;
//					System.out.print(arr[i][j] + " ");
//					sum = sum + arr[i][j];
//				}else {
//					arr[i][j] = sum;
//					System.out.print(arr[i][j]);
//				}
//			}
//			System.out.println();
//		}
		
//		String str = "안녕하세요";
//		
//		if(str.equals("hi"))
//			System.out.print("hi");
//		else
//			System.out.print(str);
//		
//		int[] arr = new int[8];
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = 5;
//			System.out.print(arr[i] + " ");
//		}
		
//		char[][] arr2 = new char[3][2];
//		char ch = 'a';
//		
//		for(int i = 0; i < arr2.length; i++) {
//			for(int j = 0; j < arr2[i].length; j++) {
//				arr2[i][j] = ch++;
//				System.out.print(arr2[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
