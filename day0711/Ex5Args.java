package test.day0711;

public class Ex5Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args: 송혜교 67 78 80 이렇게 값을 준후
		//이름은 String name 에 저장
		//3과목의 점수는 int kor,eng,mat 에 저장후
		//총점(int tot),평균(double avg) 를 계산후
		//printf를 이용해서 출력하시오
		
		String name=args[0];//송혜교
		int kor=Integer.parseInt(args[1]);
		int eng=Integer.parseInt(args[2]);
		int mat=Integer.parseInt(args[3]);
		//총점
		int tot=kor+eng+mat;
		//평균
		double avg=tot/3.0;
		//출력
		System.out.printf("이 름 : %s\n",name);
		System.out.printf("국어 : %d점,영어 : %d점,수학 : %d점\n",kor,eng,mat);
		System.out.printf("총점 : %d점\n평균 : %5.1f\n",tot,avg);
			
	}

}
