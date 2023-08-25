package com.kh.javai;

public class Student {
	//필드(데이터 집합)
	//이름,나이,성별,수학점수,영어점수,국어점수
	static int count = 0;
	public String name, gender;
	public int age, mathScore, enScore, koScore;
	
	//생성자
	//인스턴스 객체를 생성할 때 데이터를 초기화하기위해
	//자동으로 한번만 실행하는 특별한 메서드
	//메서드처럼 접근해서 실행할 수 없으며 class의 이름과 동일한 이름을 가진다.
	//초기화를 위한 메서드이기 때문에 반환값은 없다.
	
	/*기본생성자
	 * 생성자를 아무것도 작성하지 않았을 때
	 * 컴파일러가 기보적으로 생성해주는 생성자
	 * (아무 기능이 없다.)
	 * public student(){}
	 */
	
	public Student() {
		System.out.println("student의 기본생성자");
	}
	//생성자는 여러개 생성이 가능하다.
	//생성자가 여러개일때는 매개변수를 통해서 식별한다.
	//에매한 생성자는 사용을 지양한다.
	public Student(String tName, int tAge, String tGender) {
		count++;
		name = tName;
		age = tAge;
		gender = tGender;
		
		System.out.println("이름" + name);
		System.out.println("나이" + age);
		System.out.println("성별" + gender);
		System.out.println("학생이 추가 되었습니다.");
	}
	
	
	//매서드(기능 집합)
	//info메서드 생성
	//저는 ㅇㅇ살의 상ㅇㅇ ㅇㅇㅇ입니다.
	public void info() {
		System.out.println(name + "\t" + age + "\t" + gender);
	}
	
	//	public Student(int ec, int kc, int mc) {
	//		enScore = ec;
	//		koScore = kc;
	//		mathScore = mc;
	//		int total = enScore + koScore + mathScore;
	//		
	//		
	//		
	//		System.out.println("영어 점수 : " + enScore);
	//		System.out.println("국어 점수 : " + koScore);
	//		System.out.println("수학 점수 : " + mathScore);
	//		System.out.println("총합 : " + total);
	//		System.out.println("평균 : " + total/3.0f);
	//		
	//		if(enScore >= 40 && koScore >= 40 && mathScore >= 40 && (total/3f) >= 60) {
	//			System.out.println("합격입니다");
	//		}else {
	//			System.out.println("불합격입니다.");
	//		}
	//	}
	
//set메서드 => 필드데이터에 값을 저장하기위한 메서드
   public void setEnScore(int tEnScore) {
	   if(tEnScore < 0) {
		   enScore = 0;
		   return;
	   }
	   enScore = tEnScore;
   }
   public void setKoScore(int tKoScore) {
	   if(tKoScore < 0) {
		   koScore = 0;
		   return;
	   }
	   koScore = tKoScore;
   }
   public void setMathScore(int tMathScore) {
	   if(tMathScore < 0) {
		   mathScore = 0;
		   return;
	   }
	   mathScore = tMathScore;
   }
   public int getEnScore() {
      return enScore;
   }
   public int getKoScore() {
      return koScore;
   }
   public int getMathScore() {
      return mathScore;
   }
   
   public String getGender() {
	   return this.gender;
   }
   public int getAge() {
	   return this.age;
   }
   public String getName() {
	   return this.name;
   }
   public int getTotal() {
	  int total = (mathScore + enScore + koScore); 
      return total;
   }
   public float getAvg() {
	  float Avg = (mathScore + enScore + koScore)/3.0f; 
      return Avg;
   }
	 
   public void checkPass() {
	   if (enScore >= 40 && koScore >= 40 && mathScore >= 40 && getAvg()>= 60) {
         System.out.print("합격입니다.");
	   } else {
         System.out.print("불합격입니다.");
       }
   }
   
//   public void checkPass() {
//	   if (enScore >= 40 && koScore >= 40 && mathScore >= 40 && getAvg()>= 60) {
//         System.out.print("합격입니다.");
//	   } else {
//         System.out.print("불합격입니다.");
//       }
//   }
   
   public void displayMyInfo() {
	   System.out.print("저는 " + age + "살의 " + name + "입니다.");
	   System.out.println("국어 점수 : " + koScore);
	   System.out.println("국어 점수 : " + koScore);
	   System.out.println("수학 점수 : " + mathScore);
	   System.out.println("총합 : " + getTotal());
	   System.out.println("평균 : " + getAvg());
	   
	   if(enScore >= 40 && koScore >= 40 && mathScore >= 40 && getAvg()>= 60) {
		   System.out.println("으로 시험에 합격하였습니다.");
	   }else {
		   System.out.println("으로 시험에 불합격입니다하였습니다.");
	   }
	   
   }
}
