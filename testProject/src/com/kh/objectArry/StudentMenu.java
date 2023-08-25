package com.kh.objectArry;

int[] arr = {1,2,3,4,5,6,7,8,9,10};

public class StudentMenu {
	private StudentController ssm;
	
	public StudentMenu() {
		StudentController ssm = new StudentController();
		
		printStudentList();
		
		printStudentScore();
		
		printResult();
		
	}
	public void printStudentList() {
		System.out.println("==========학생 정보 출력==========");
		
		Student[] sArr = ssm.printStudent();
		for(int i = 0; i < sArr.length; i++) {
			Strudent : student = sArr[i];
			System.out.println("이름 : " + student.getName() + " / 과목 : " + student.getSubject() + )
		}
	}
}
