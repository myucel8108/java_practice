package test.day0714;

import java.util.Scanner;

public class Ex6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {2,6,12,8,9,15,17,4,19,16};
		int su;
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		/*
		 * 숫자를 입력후 그 숫자가 몇번째에 있는지 출력
		 * 없을경우 "없습니다" 출력
		 */
		System.out.println("찾고자 하는 숫자 입력");
		su=sc.nextInt();
		for(int i=0;i<data.length;i++)
		{
			if(su==data[i])
			{
				flag=true;
				System.out.println(i+1+"번째 있습니다");
				break;
			}
		}
		
		//if(flag==false)
		if(!flag)
			System.out.println("없어요!!!!");
	}

}












