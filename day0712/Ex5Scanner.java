package test.day0712;

import java.util.Scanner;

public class Ex5Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		System.out.println("나이");
		age=sc.nextInt();
		//나이를 age 가 읽은후 엔터문자가 키보드버퍼라는곳에 저장
		//문자열은 키보드버퍼가 비어잇어야 비로소 키보드로 읽는다
		sc.nextLine();//엔터를 읽어서 소멸
		
		System.out.println("이름");
		name=sc.nextLine();
		System.out.println(name+"님의 나이는 "+age+"세입니다!");
	}

}
