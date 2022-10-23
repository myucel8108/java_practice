package test.day0713;

import java.util.Random;
import java.util.Scanner;

//어제 내준 문제 풀이 #3
public class Munje3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rnd,su,cnt=0;
		Random r=new Random();
		//난수 구하기
		rnd=r.nextInt(100)+1;//1~100
		while(true)
		{
			System.out.print(++cnt+":");
			su=sc.nextInt();
			if(su>rnd)
				System.out.println("\t"+su+"보다 작습니다");
			else if(su<rnd)
				System.out.println("\t"+su+"보다 큽니다");
			else {
				System.out.println("짝짝짝! 정답입니다");
				break;
			}
			
			if(cnt==10)
			{
				System.out.println("\t시간초과!! 종료합니다");
				break;
			}
		}
	}

}










