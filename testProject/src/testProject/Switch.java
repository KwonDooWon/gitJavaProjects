package testProject;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		/*switch(조건식){
		case 값1:
				수행될 문장;
				break;
	 	case 값2:
	 			수행될 문장;
	 			break;
	 	default:
	 			수행될 문장;
	}*/
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		switch(num) {
//		case 1:
//			System.out.print("1입니다.");
//		case 2:
//			System.out.print("3입니다.");
//		default:
//			System.out.print("갑이 없습니다.");
		
//		Scanner sc = new Scanner(System.in);
//		String day = sc.next();
//		
//		switch(day) {
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//			System.out.print("금일은 정상 영업합니다.");
//			break;
//		case "토":
//		case "일":
//			System.out.print("금일은 휴일입니다.");
//			break;
//		default:
//			System.out.print("잘못 입력하셨습니다.");
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		System.out.println("1. 입력");
//		System.out.println("2. 수정");
//		System.out.println("3. 조회");
//		System.out.println("4. 삭제");
//		System.out.println("7. 종료");
//		
//		System.out.print("메뉴 번호를 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if (num == 1)
//			System.out.println("입력 메뉴입니다.");
//		else if (num == 2)
//			System.out.println("수정 메뉴입니다.");
//		else if (num == 3)
//			System.out.println("조회 메뉴입니다.");
//		else if (num == 4)
//			System.out.println("삭제 메뉴입니다.");
//		else if (num == 7)
//			System.out.println("프로그램이 종료됩니다.");
		
//		switch (num) {
//		case 1:
//			System.out.println("입력 메뉴입니다.");
//			break;
//		case 2:
//			System.out.println("수정 메뉴입니다.");
//			break;
//		case 3:
//			System.out.println("조회 메뉴입니다.");
//			break;
//		case 4:
//			System.out.println("삭제 메뉴입니다.");
//			break;
//		case 7:
//			System.out.println("프로그램이 종료됩니다.");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		
//		System.out.print("숫자를 한 개 입력하세요 : ");
//		num = sc.nextInt();
//		
//		if (num > 0 && num % 2 == 0)
//			System.out.println("짝수다.");
//		else if (num > 0 && num % 2 != 0)
//			System.out.println("홀수다.");
//		else if (!(num>0))
//			System.out.println("양수만 입력해주세요.");
//		
//		if (num>0) {
//			if (num%2==0)
//				System.out.println("짝수다.");
//			else if (num%2==1)
//				System.out.println("홀수다.");
//			
//		}else
//			System.out.println("양수만 입력해주세요.");
		
		
//		Scanner sc = new Scanner(System.in);
//		int sc1, sc2, sc3, total;
//		float avg;
//		
//		System.out.print("국어점수 : ");
//		sc1 = sc.nextInt();
//		System.out.print("수학점수 : ");
//		sc2 = sc.nextInt();
//		System.out.print("영어점수 : ");
//		sc3 = sc.nextInt();
//		
//		total = sc1+ sc2 + sc3;
//		avg = total / 3;
//		if (sc1>=40 && sc2>=40 && sc3>=40 && (avg) >= 60) {
//			System.out.println("국어 : " + sc1);
//			System.out.println("수학 : " + sc2);
//			System.out.println("영어 : " + sc3);
//			System.out.println("합계 : " + (total));
//			System.out.println("평균 : " + avg);
//			System.out.println("축하합니다, 합격입니다!");
//		} else 
//			System.out.println("불합격입니다.");
		
		
//		Scanner sc = new Scanner(System.in);
//		final String Id, Pw;
//		Id = "myId";
//		Pw = "myPassword12";
//		
//		String id, pw;
//		
//		System.out.print("아이디 : ");
//		id = sc.nextLine();
//		System.out.print("비밀번호 : ");
//		pw = sc.nextLine();
//		
//		if (id.equals(Id) && pw.equals(Pw))
//			System.out.println("로그인 성공");
//		else if (id.equals(Id) && !pw.equals(Pw))
//			System.out.println("비밀번호가 틀렸습니다.");
//		else 
//			System.out.print("아이디가 틀렸습니다.");
//		
		
//		Scanner sc = new Scanner(System.in);
//		String str;
//		
//		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
//		str = sc.next();
//		
//		switch(str) {
//		case "관리자":
//			System.out.print("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글조회");
//			break;
//		case "회원":
//			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
//			break;
//		case "비회원":
//			System.out.print("게시글조회");
//		default:
//			System.out.print("잘못 입력하셨습니다.");
			
		
//		if (str.equals("관리자")) {
//			System.out.print("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글조회");
//		} else if ("회원") {
//			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
//		} else if ("비회원"){
//			System.out.print("게시글조회");
//		} else {
//			System.out.print("잘못 입력하셨습니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		double high, weight, bmi;
//		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		high = sc.nextDouble();
//		
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		weight = sc.nextDouble();
//		
//		bmi = weight/(high*high);
//		System.out.println("BMI 지수 : " + bmi);
//		
//		if(bmi<18.5)
//			System.out.print("저체중");
//		else if(bmi>=18.5 && bmi<23)
//			System.out.print("정상체중");
//		else if(bmi>=23 && bmi<25)
//			System.out.print("과체중");
//		else if(bmi>=25 && bmi<30)
//			System.out.print("비만");
//		else
//			System.out.print("고도비만");
		
//		Scanner sc = new Scanner(System.in);
//		int num1,num2;
//		char op;
//			
//		System.out.print("피연산자1 입력 : ");
//		num1 = sc.nextInt();
//		System.out.print("피연산자2 입력 : ");
//		num2 = sc.nextInt();
//		System.out.print("연산자를 입력(+,-,*,/,%) : ");
//		op = sc.next().charAt(0);
//		
//		if (num1>0 && num2>0) {
//			if (op == '+')
//				System.out.print(num1 + num2);
//			else if (op == '-')
//			System.out.print(num1 - num2);
//			else if (op == '*')
//				System.out.print(num1 * num2);
//			else if (op == '/')
//				System.out.print(num1 / num2);
//			else if (op == '%')
//				System.out.print(num1 % num2);
//			else
//				System.out.print("잘못 입력하셨습니다.프로그램을 종료합니다.");
		
//		Scanner sc = new Scanner(System.in);
//		int a,b,c,d;
//		float e;
//		
//		System.out.print("중간 고사 점수 : ");
//		a = sc.nextInt();
//		System.out.print("기말 고사 점수 : ");
//		b = sc.nextInt();
//		System.out.print("과제 점수 : ");
//		c = sc.nextInt();
//		System.out.print("출석 회수 : ");
//		d = sc.nextInt();
//		System.out.println("=============결과=============");
//		
//		System.out.println("중간 고사 점수(20) : " + (a*0.2f));
//		System.out.println("기말 고사 점수(20) : " + (b*0.3f));
//		System.out.println("과제 점수		(20) : " + (c*0.3f));
//		System.out.println("출석 점수		(20) : " + (float)d);
//		
//		e = (a*0.2f)+(b*0.3f)+(c*0.3f)+(d);
//		System.out.println("총점 : " + e);
//		
//		if (e<70)
//			System.out.print("Fail [점수 미달]");
//		else if (d<14)
//			System.out.print("Fail [출석 미달]");
//		else
//			System.out.print("Pass");
		
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		
		System.out.println("1. 권한 확인");
		System.out.println("2. BMI");
		System.out.println("3. 계산기");
		System.out.println("4. P/F");
		System.out.println("선택 : ");
		
	}
}	
