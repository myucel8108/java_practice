package test.day0714;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열(array):같은 자료형끼리만 묶을수 있다
		//            일괄적으로 처리가 가능하다
		//            자료형에 상관없이 객체로 인식한다
		char[] ch;//선언만..실제 메모리 할당x
		ch=new char[5];
		System.out.println(ch.length);
		ch[0]='H';
		ch[1]=65;//'A'
		ch[3]='X';
		ch[4]='*';
		
		//배열 2번엔 아무값도 안넣었다(0으로초기화)
		System.out.println("** 출력 1 **");
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]+":"+(int)ch[i]);
		
		System.out.println("** 출력 2 **");
		for(char a:ch)//ch배열 갯수만큼 자동반복
			System.out.println(a);
		
	}

}
