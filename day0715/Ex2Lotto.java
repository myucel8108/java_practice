package test.day0715;

import java.util.Random;
import java.util.Scanner;

public class Ex2Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int money;
		int []lotto=new int[6];
		System.out.println("로또 구입금액을 입력해주세요");
		money=sc.nextInt();
		if(money<1000)
		{
			System.out.println("금액이 부족합니다\n종료합니다");
			return;
		}else {
			System.out.println("총 "+money/1000+" 회 구입");
			System.out.println("거스름돈 : "+money%1000+"원");
		}
		System.out.println("---------------------");
		for(int n=0;n<money/1000;n++)
		{
			System.out.printf("%2d회 : ",n+1);
			//1~45로또숫자구하기-중복처리
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=r.nextInt(45)+1;
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
			//정렬
			for(int i=0;i<lotto.length-1;i++)
			{
				for(int j=i+1;j<lotto.length;j++)
				{
					if(lotto[i]>lotto[j])
					{
						int temp=lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=temp;
					}
				}
			}
			//출력
			for(int a:lotto)
				System.out.printf("%4d",a);
			System.out.println();
		}//n end
	}

}











