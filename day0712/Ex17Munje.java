package test.day0712;

import java.util.Scanner;

public class Ex17Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month;
		/*
		 * 월을 입력후 2 입력시 "28일 또는 29일까지 있습니다"
		 * 4,6,9,11 입력시 "x월은 30일까지 있습니다"
		 * 1,3,5,7,8,10,12 입력시 "x월은 31일까지 있습니다"
		 * 그 이외 "없는 달입니다"
		 * 
		 * 위와 같이 나오도록 if문으로도 구하고 switch로도 구하시오
		 */
		System.out.println("월 입력");
		month=sc.nextInt();
		System.out.println("** if **");
		if(month==2)
			System.out.println("2월은 28일 또는 29일까지 있습니다");
		else if(month==4||month==6||month==9||month==11)
			System.out.println(month+"월은 30일까지 있습니다");
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			System.out.println(month+"월은 31일까지 있습니다");
		else
			System.out.println("없는 달입니다");
		
		System.out.println("** switch **");
		switch(month)
		{
		case 2:
			System.out.println("2월은 28일 또는 29일까지 있습니다");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월은 30일까지 있습니다");
			break;
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12:
			System.out.println(month+"월은 31일까지 있습니다");
			break;
		default:
			System.out.println("없는 달입니다");
			
			
		}
		
		
	}

}
