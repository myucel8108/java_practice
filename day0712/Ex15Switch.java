package test.day0712;

import java.util.Scanner;

public class Ex15Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score;
		char grade;
		System.out.println("점수 입력");
		score=sc.nextInt();
		if(score<0 || score>100)
		{
			System.out.println("잘못 입력했어요!");
			return;
		}
		//힌트:100/10=10,95/10=9
		switch(score/10)
		{
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B'; break;
		case 7:
			grade='C'; break;
		case 6:
			grade='D'; break;
		default:
			grade='F';			
			
		}
		System.out.println(score+"점은 "+grade+"학점입니다");
	}

}
