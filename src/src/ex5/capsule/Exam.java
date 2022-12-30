package ex5.capsule;

import java.util.Scanner;

public class Exam {
	private int kor;
	// 여기 안에서만 쓰게 하고 싶을 때
	private int eng;
	private int math;

	//객체를 갓 생성했을때만 사용가능! 생성자(함수는 아니다!)
	public Exam() { //Exam 형식에 해당되는 객체만 생성할 수 있다.
		kor =0;
		eng=0;
		math=0;
	}
	//이건 리셋에 불과 하다!
	public void init() {
		kor =0;
		eng =30;
		math=30;
	}

	// 메서드는 표현방식이 쉽고 에러를 하나의 클래스 안에 넣어서 에러 예측이 가능하다!
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.printf("┌───────────────┐\n");
		System.out.printf("│ 국 어 성 적 입 력                        │\n");
		System.out.printf("└───────────────┘\n");
		do {
			System.out.print("kor1의 값은:");
			kor = scan.nextInt();
			if (0 > kor || kor > 100)
				System.out.println("0부터 100까지만 입력하셔야 합니다!");
		} while (0 > kor || kor > 100);

	}

	public void print() {
		// 뉴렉성적이라는 인스턴스를 쓰겠다! this
		int kor = 100; // this.kor를 지역변수화 할 필요가 없다!
		System.out.printf("kor:%d\n", this.kor); // 이 안에 넘겨받은 this에 객체안에 kor가 있는지 찾아봄!->뉴렉성적에 있는지!
		// 지역변수가 우선순위가 높다!
		// 지역변수가 있어서 우선순위가 밀리면 this를 꼭 붙이자!
		System.out.printf("eng:%d\n", eng);
		System.out.printf("math:%d\n", math);
		System.out.println("-----------");

	}

	// 일반 함수(FUNCTION)는 함수를 만드는 위치가 아무 클래스에 있어도 상관없어서 이들을 정리하거나 작성할때 제약이 없어서 중구난방이 될
	// 가능성이 높다.
	// 그저 자르는 목적이기 때문에 작명하기가 어렵다.
	// 코드가 직관적이지 않다!
	// 다른 파일에서 에러가 나는지 예측이 안된다!
	// static은 인스턴스와 상관없다는 의미!
	// this사용불가!
	// 즉 캡슐화가 되지 않는다! 메서드가 아님!
	static void printExam(Exam 뉴렉성적) {
		int kor = 뉴렉성적.kor; // 호불호가 있지만 자바스크립에서의 ex6에서 쓰니깐 확인!!

		System.out.printf("kor:%d\n", kor);
		System.out.printf("eng:%d\n", 뉴렉성적.eng);
		System.out.printf("math:%d\n", 뉴렉성적.math);
		System.out.println("-----------");

	}

	static void inputExam(Exam 뉴렉성적) {

	}


}
