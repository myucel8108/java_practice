package ex4.classTest;

import java.util.Scanner;

public class ExamApp {

	public static void main(String[] args) { // 함수를 묶어내는곳
		// 기본자료형을 제외한 사용자 형식은 모두 new를 써야한다!
		
		Exam exam1 = new Exam(); // heap공간에 있고 선언된 변수만이 스택으로!
		// [kor] [eng] [math]이란 공간에 있는 애들을 쓰고 싶으면 이름을 붙어야한다!
		exam1.kor = 30; // 스택에 있는 exam1이 가리키는 kor공간은 heap이다!
		exam1.eng = 50;
		
		exam1.math = 100;

		printExam(exam1);

		Exam[] exams = new Exam[3]; // 배열을 만든거지 객체를 선언한건 아니다!->참조 변수만 3개 만든거지 참조 공간을 만든게 아님! exam형식의 변수가 3개 만들어진거임!
		// -> exams는 스택! new는 힙 공간에 있음(동적 메모리 할당)!
		// exams[0].kor =30; //참조할 공간 null 포인트 익셉션 발생!
		exams[0] = new Exam(); // 이제야 객체를 선언해주고 스택에 공간을 만들어 냄!
		exams[0].kor = 30;
		exams[0].eng = 30;
		exams[0].math = 30;
		exams[1] = new Exam();
		exams[1].kor = 31;
		exams[1].eng = 31;
		exams[1].math = 31;
		exams[2] = new Exam();
		exams[2].kor = 32;
		exams[2].eng = 32;
		exams[2].math = 32;
		printExams(exams);
	System.out.println(exam1.kor);

	}

	static void printExams(Exam[] exams) {
		
		for (int i = 0; i < exams.length; i++) {
			Exam exam= exams[i];
			printExam(exam); //이것도 가능하다! 중첩을 제거할 수 있는 방식!
			System.out.printf("exams[%d] kor:%d\n", i, exam.kor);
			System.out.printf("exams[%d] eng:%d\n", i, exams[i].eng);
			System.out.printf("exams[%d] math:%d\n", i, exams[i].math);
			System.out.println("-----------");
		}

	}

	static void printExam(Exam exam1) {
		int kor = exam1.kor;   //호불호가 있지만 자바스크립에서의 ex6에서 쓰니깐 확인!!
		
		System.out.printf("kor:%d\n", kor); 
		System.out.printf("eng:%d\n", exam1.eng);
		System.out.printf("math:%d\n", exam1.math);
		System.out.println("-----------");

	}

}
