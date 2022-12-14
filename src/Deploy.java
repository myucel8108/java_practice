
public class Deploy {
	public static void main(String[] args) {
	
		int kor1, kor2, kor3;
		int total;
		float avg;
	
		kor1 = 80;
		kor2 = 90;
		kor3 = 100;

		total = kor1 + kor2 + kor3;
		avg = total / 3;
	
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n", avg);		
		
		int x = '1'+1; //에러 발생 안나지만 int 2의 값은 안나오네
		int y = 'A'+1; //에러 발생 안나지만 66이 나온다
		//''문자코드를 알려주는거기 때문에 붙인건 문자!
		char C = 'x'; //문자는 캐릭터 2바이트 크기!
		String Str = "a"; //스트링으로 사용해서 
		System.out.println(x);
		System.out.println(y);
		System.out.println(C);
		int i = 3;
		
		i++;  // 3->4
		
		System.out.println(i); //4
		
		++i;
		
		System.out.println(i);
		
		System.out.println(++i);
		
		System.out.println(i++);
		
		System.out.println(i);
	
	}

}