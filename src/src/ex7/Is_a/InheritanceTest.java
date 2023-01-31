package ex7.Is_a;


public class InheritanceTest {
	public static void main(String[] args) {

		//	private Exam exam; //
		NewlecExam exam = new NewlecExam();
		NewlecExam exam2 = new NewlecExam();
		Exam exam3 = new NewlecExam(1,1,1,1); //4가 나왔다?! 부모형식이라서 부모를 불렀지만 spuer.total을 부른줄 알았지만 
		//오버라이드를 만들지 않으면...?
		//안나오는 이유는? 부모에게 없는 함수를 호출할때  호출이 불가능!
		//근데 부모에게 있는 함수는 무조건 자식 함수가 호출됨!
		//Exam exam3 = new NewlecExam(1,1,1,1);
		
		//프레임워크를 이용할때는 함수의 흐름을 잘 알자
		
		System.out.println(exam3.total());
		System.out.println(exam.total()); //내가 만들때 3개까지만 있었고 그대로 상속받았으니! 문제 발생! 즉 틀을 가져다 쓰면서 고치면서 쓰자!
		System.out.println(exam2.total());
		System.out.println(exam.avg());
	}

}
