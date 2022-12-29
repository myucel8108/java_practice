package test.day0725;

//super class
class Super1
{
	private void writeA()
	{
		System.out.println("private method");
	}
	
	void writeB()
	{
		System.out.println("default method");
	}
	
	protected void writeC()
	{
		System.out.println("protected method");
	}
	
	public void writeD()
	{
		System.out.println("public method");
	}
}
/////////////////////////////////
//sub class
class Apple extends Super1
{
	@Override   //@:어노테이션,@Override:부모가 가진 메서드를 오버라이드한다는뜻
	public void writeD()
	{
		System.out.println("public sub method");
	}
	
	@Override
	void writeB() {
		// TODO Auto-generated method stub
		super.writeB();//부모가 먼저 처리
		System.out.println("sub class 의 writeB가 처리");
	}
	
	public void process()
	{
		System.out.println("부모의 레퍼런스 변수인 super로 호출");
		super.writeB();
		super.writeC();
		super.writeD();//this에도 writeD가 있으나 super로 호출시 부모 writeD 가 호출
		System.out.println("같은 이름의 메서드가 나에게 없다면 this 로도 호출가능");
		this.writeB();
		this.writeC();
		this.writeD();//sub class 에 같은 이름의 메서드가 있으므로 sub메서드가 우선호출
	}
}

public class Ex1Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple=new Apple();
		apple.writeB();
		apple.writeC();
		apple.writeD();
		apple.process();
		
	}

}


