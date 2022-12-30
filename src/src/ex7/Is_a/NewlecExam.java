package ex7.Is_a;
public class NewlecExam extends Exam{//이것이 is_a방식 Exam은 부모,상위,기반클래스 NewlecExam 자식,하위,확장클래스
	private int com;
	
	
	public NewlecExam() {
		//아무리 자식클래스여도 kor =1;(Exam-> 부모의 private의 값은)은 쓸 수 없다!
		//setKor(1);
		//단 set을 이용하면 사용 가능함!-> 근데 kor를 내가 가지고 있지 않은데 사용해도 되나?
		//->set은 초기화가 아닌데 사용해야하나? 라는 의문점
		//부모가 초기화 하게 해주자!
		//부모가 있는 객체를 만들어주면 super라는 걸 쓴다!
		//따끈한 exam객체! 한번 사용된 객체는 초기화된 객체를 사용할 수 없다!
		this(1,1,1,1); //집중화!!
		
	}
	
	public NewlecExam(int kor, int eng ,int math, int com) {
		super(kor, eng, math);
		this.com= com;

	}
	
	@Override //내가 새로 정의해서 쓸 수 있다는 것! 부모것을 못보게 하고 자기 것 을 보게 하는 것!
	public int total() {
		
		return super.total()+this.com;
	}
	
	@Override
		public double avg() {
			
			return total()/4.0;
		}

	
	
	//오버로드는 적재! 오버라이드는 덮어쓰기!
	//왜 1.3333이 나왔나?
	//클래스가 부모자식관계일때 되는 방식!
	//객체와 참조형식의 개수
	//Exam exam = new NewlecExam();->가능
	//NewlecExam exam = new Exam(); ->말이 안됨!
	//이유 참조형식은 2가지 가능!
	//부모는 자식도 부를 수 있다는 점!
	//참조형식과 호출되는 메소드의 관계!
	//
	
}
