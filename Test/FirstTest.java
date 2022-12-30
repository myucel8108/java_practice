package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FirstTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		res/data.txt 파일에 다음처럼 빈 공백으로 구분 된 값들이 있다.
//
//		20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 
//
//		문제 1 : 이 값들의 개수를 구하는 코드를 작성하시오.		
		//1.파일을 불러오고 scanner를 이용해야할 것
		//2.split을 사용할 수 있어야 할 것
		//3.for문을 이용해서 갯수를 셀 수 있는 것
		//4.마지막으로 갯수를 내보내면 되는 것?
		
		int count =0; //갯수를 세기위한 세팅
		
		{
//파일 가져오기
			FileInputStream fis =new FileInputStream("res/data.txt");  //버퍼를 읽어오기 위한 객체
			Scanner scan = new Scanner(fis); // 문자열단위로 읽기위한 응용객체
//버퍼를 이용해서 총 개수 구하기
		while(scan.hasNext()) {	
			int temp =scan.nextInt();
			count++;
		}
		System.out.printf("count is %d\n", count);
		scan.close();
		fis.close();
		
		}

		//문제 2 : 이 값들 중에서 가장 큰 값이 무엇인지 출력하는 코드를 작성하시오.
		//1.앞서 count의 값을 알아 났으니 배열에 크기를 정할 수 있다.
        //2.for문과 scan문을 이용할 것
		//3.또한 조건문을 이용해서 최댓값을 구해야 함!
		int max = -1;
		{	
			//파일 가져오기	
			FileInputStream fis =new FileInputStream("res/data.txt");    
			Scanner scan = new Scanner(fis);
			
			int[] arr = new int[count]; 
			//FOR문 이용해서 배열에 값을 넣어주고 비교하기
			for(int i=0; i<count; i++){
				int a = scan.nextInt();
				arr[i]=a;
				if(max < arr[i])
					max = arr[i];
				
		}
			System.out.printf("max is %d\n", max);
			scan.close();
			fis.close();
	}
	
		
/*
 * 
문제 3 : 이 값들 중에 10 을 찾아서 그 위치(인덱스 값)을 출력하시오.
	20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 
*/
		int index = -1;
		{	
			//파일 가져오기	
			FileInputStream fis =new FileInputStream("res/data.txt");    
			Scanner scan = new Scanner(fis);
			String temp= scan.nextLine();
			String[] find = temp.split(" ");
			for(int i=0; i<count; i++)
				if(Integer.parseInt(find[i])==10)
					index=i;
			
			scan.close();
			fis.close();
	}
		System.out.printf("index is %d\n", index);
		
  }

}
