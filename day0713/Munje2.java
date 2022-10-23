package test.day0713;

import java.util.Scanner;

//어제 내준 문제 풀이 #2
public class Munje2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,y,pow=1;
		System.out.println("두수 x,y 입력");
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i=1;i<=y;i++)
			pow*=x;
		System.out.printf("%d의 %d승은 %d입니다",x,y,pow);
	}

}
