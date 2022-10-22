package test.day0712;

import java.util.Scanner;

public class Ex13Munje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int java,html,oracle,tot;
		double avg;
		//이름과 3과목의 점수를 입력받아 tot(총점),avg(평균)을 구한후
		//평균이 60 이상이고 3과목이 모두 40이상일경우 "합격입니다"
		// 그렇지 않을경우 "불합격입니다" 라고 출력후
		//이름과 총점,평균을 추가로 출력하시오
		System.out.println("이름");
		name=sc.nextLine();
		System.out.println("3과목의 점수 입력");
		java=sc.nextInt();
		html=sc.nextInt();
		oracle=sc.nextInt();
		//총점
		tot=java+html+oracle;
		//평균
		avg=tot/3.0;
		
		//합격여부
		if(avg>=60.0 && java>=40 && html>=40 && oracle>=40)
			System.out.println("합격입니다");
		else
			System.out.println("불합격입니다");
		
		System.out.println("총점 : "+tot);
		System.out.printf("평균 :%5.1f\n",avg);
	}

}
