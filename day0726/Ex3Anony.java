package test.day0726;

interface Hello
{
	public void draw();
	public void add();
}

public class Ex3Anony {
	//member 내부 클래스
	class SubHello1 implements Hello
	{

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("draw");
		}

		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("add");
		}
		
	}
	
	//익명 내부 클래스
	Hello hello2=new Hello() {
		
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("draw2");
		}
		
		@Override
		public void add() {
			// TODO Auto-generated method stub
			System.out.println("add2");
		}
	};
	
	public void process()
	{
		//내부클래스 선언
		SubHello1 s1=new SubHello1();
		s1.draw();
		//익명 내부 클래스
		hello2.draw();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3Anony ex=new Ex3Anony();
		//Ex3Anony.SubHello1 in1=ex.new SubHello1();
		//in1.draw();
		
		ex.process();
	}

}








