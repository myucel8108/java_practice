package test.day0714;

public class Ex4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str1=new String[4];
		String[] str2= {"red","green","blue","yellow"};
		System.out.println("** str1 출력 **");
		for(String s:str1)
			System.out.println(s);
		System.out.println();
		System.out.println("** str2 출력 **");
		for(String s:str2)
			System.out.println(s);
		
		System.out.println("** str1에 이름4개 넣고 다시 출력**");
		str1[0]="이미자";
		str1[1]="손예진";
		str1[2]="강호동";
		str1[3]="유재석";
		for(String s:str1)
			System.out.println(s);
		System.out.println();
		for(int i=0;i<str1.length;i++)
			System.out.println(i+":"+str1[i]);
	}

}








