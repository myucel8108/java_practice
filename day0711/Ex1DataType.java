package test.day0711;

public class Ex1DataType {

	//멤버 변수 선언하는 위치-자동 초기화
	int a;
	// 테스트
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역 변수-자동 초기화 안됨
		int b=0;
		
		//멤버 변수 출력하는 방법
		Ex1DataType ex1=new Ex1DataType();
		System.out.println(ex1.a);
		
		System.out.println(b);
		
		byte c=120;
		System.out.println(c);
		
		byte d=(byte)129;//cast 연산자(강제 형변환 연산자)
		System.out.println(d);//-127: 값이 넘칠경우 음수로 읽는다(2의보수로 읽음)
		
		short su1=32700;
		short su2=20000;
		int sum=su1+su2;
		System.out.println(sum);
		
		int n1=7;
		int n2=4;
		int div1=n1/n2;//int끼리 연산은 결과도 int: 1
		System.out.println(div1);
		
		double div2=n1/n2;
		System.out.println(div2);//1.0
		
		//double div3=(double)n1/n2;//1.75 둘중 하나를 double 로 형변환
		//double div3=n1/(double)n2;//1.75
		double div3=(double)(n1/n2);//1.0
		System.out.println(div3);	
		
	}

}









