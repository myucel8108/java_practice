package test.day0726;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex11Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//score.txt를 읽은후 갯수,총점,평균을 구하시오
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader("d:/java0711/score.txt");
			br=new BufferedReader(fr);
			
			int cnt=0;
			int sum=0;
			double avg;
			
			while(true)
			{
				//한줄씩 읽기
				String line=br.readLine();
				//마지막 문장까지 읽으면 null값을 반환한다
				if(line==null)
					break;
				//갯수 증가
				cnt++;
				//총점
				try {
					sum+=Integer.parseInt(line);
				}catch(NumberFormatException e) {
					cnt--;
				}
			}
			//평균
			avg=(double)sum/cnt;
			System.out.println("총 "+cnt+"개");
			System.out.println("총점 : "+sum);
			System.out.printf("평균 : %5.2f",avg);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//exception이 발생해야만 실행되는 영역
			//e.printStackTrace();
			System.out.println("파일이 없어요:"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//exception 상관없이 무조건 실행되는 영역
			try {
				//나중에 생성한 자원을 먼저 닫는다
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
