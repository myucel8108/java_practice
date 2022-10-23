package test.day0713;

import java.util.Scanner;

//어제 내준 문제 풀이 #1
public class Munje1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("숫자 n 입력");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.printf("1~%d까지의 합은 %d입니다",n,sum);
	}

}
