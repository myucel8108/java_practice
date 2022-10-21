package test.day0711;

public class Ex2dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]+args[1]);//"7"+"5"="75"
		//Wrapper Class:타입변환을 위한 클래스들
		//Integer,Long,Char,Boolean,Double 등등등
		//String Type 을 기본형인 int type 으로 변환하는 방법
		int su1=Integer.parseInt(args[0]);
		int su2=Integer.parseInt(args[1]);
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		
		System.out.println("1"+2+3);//123
		System.out.println("1"+(2+3));//15
		
		//2번 배열의 3.5 도 타입은 String
		//String -> double
		double su3=Double.parseDouble(args[2]);
		System.out.println(su3*2);
	}

}







