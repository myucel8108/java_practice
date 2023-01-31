package ex2;

public class StringTest {
	public static void main(String[] args) {
		
	 //.찍은 뒤에 뭔가 나오면 도구화가 되었다!-> 조작할 수 있는 것이 있다.
	//스트림 객체를 가져올때 캡슐화 되어 있는 것을 조작을 할 수 있다는 것!
	//객체가 가진 기능 함수
		String s1="hello";
		String s2=new String("hello");
		String s3=s1+ s2; //우리가 아는 산술연산자가 아니다! String안에 있는 도구임!
		String s ="hello"+3; //어떠한 연산도 같은 문자열이나 같은 숫자만 가능해서 3이 문자열로 바뀌고 더해진다.(+의 기능 중 하나임)
		 // 문자열과 값 사이의 변환
		int n=3;
		//값과 도구!
		//String a =n; 안됨
		String s4= Integer.toString(n);
		String s5=String.valueOf(n);
		String b= "35";
	//	int c= s; 안됨
		
		int x= Integer.parseInt(b);
		  float floatNum = 10.123f;
		  double doubleNum = 10.123;
		 
		  String floatToString = Float.toString(floatNum);
		  String doubleToString = Double.toString(doubleNum);
		  //문자열을 비교할 때의 주의 사항들
		  String name1="아이유";
		  String name2="아이유";
		  String name3="아이유";
		  String name4=new String("아이유");  //이건 내가 직접 만든 객체여서 런타임환경에서 만들애랑 다름!
		  
		  System.out.println(name1==name2); // ==> 객체가 같은건가? 
		  System.out.println(name3==name4); //다른 걸 참조한다!
		  //2개의 객체가 있어서 다른거 아니야...? 값은 우연찮게 같은거 아닐까?
		 // 자바환경은 같은 객체인데 이름을 2개 가진꼴이됨!

		  System.out.println(name3.equals(name4));
	}
	
}
