package ex5.capsule;

public class CapsuleTest {

	public static void main(String[] args) {
		//1.성적객체를 준비한다.
		//성적 뉴렉성적 = new 성적();
		Exam  뉴렉성적 = new Exam(); //갓 생성된 개체만 가져오는 것 자체가 이름! 초기화 함수!-> 생성자
		
		
		//변수의 객체 초기화를 하고 싶을 때
		뉴렉성적.init();
		//parivate로 은닉시키면 아래와 같은 방식으로는 값을 초기화 못함!
		//뉴렉성적.eng=30;
		//int kor =4;-> 초기화
		//kor=5; 초기화x
		//2.성적을 입력 받는다.
		//뉴렉성적.입력();
		Exam.inputExam(뉴렉성적); //행위다음객체가 거론된다? 클래스에 있는 함수를 호출하는 것 뿐, 매개변수도 들어가는 것 Function
		뉴렉성적.input(); //객체와 행위가 거론된다! Method! 코드를 기능(책임)으로서의 함수!
		
		//3.성적을 출력한다.
		
		//뉴렉성적.출력(); 
		//
		Exam.printExam(뉴렉성적);
		뉴렉성적.print();
		//객체=실체=인스턴스를 통해서 호출되는 모양으로 쓰려면
		//위와 같은 방식을 쓰면된다!
		//인스턴스 메서드
	}



}
