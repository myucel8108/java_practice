package test.day0714;

import java.util.Scanner;

public class Ex1RandomWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int su,rnd,cnt;
		
		Exit:
			while(true)
			{
				cnt=0;
				rnd=(int)(Math.random()*100)+1;
				while(true)
				{
					System.out.print(++cnt+"회:");
					su=Integer.parseInt(sc.nextLine());
					if(su>rnd)
						System.out.println("\t"+su+"보다 작습니다");
					else if(su<rnd)
						System.out.println("\t"+su+"보다 큽니다");
					else {
						System.out.println("** 정답입니다 **");
						System.out.println("계속하려면 y,종료하려면n을 입력해주세요");
						String ans=sc.nextLine();
						if(ans.equalsIgnoreCase("y"))//대소문자 상관없이 비교
						{
							System.out.println("** 새로운 난수 발생함! **");
							continue Exit;//바깥 while문의 처음(조건식)으로 이동							
						}else {
							System.out.println("** 프로그램을 종료합니다 **");
							break Exit;//두개의 while문을 모두 빠져나간다
						}
					}
				}
			}
	}

}











