package test.day0714;

import java.util.Scanner;

public class Munje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String msg;
		int []alpha=new int[26];
		System.out.println("영어 문장 입력");
		msg=sc.nextLine();
		//문자열의 갯수만큼 반복한다
		for(int i=0;i<msg.length();i++)
		{
			//일단 소문자로 변경후 한글자씩 얻는다
			char a=msg.toLowerCase().charAt(i);
			//알파벳인 경우에만 갯수에 포함한다
			if(a>='a' && a<='z')
				alpha[a-'a']++;			
		}
		
		for(int i=0;i<alpha.length;i++)
		{
			System.out.printf("%c:%d개\t",i+'A',alpha[i]);
			if(i%5==4)
				System.out.println();
		}
	}

}
