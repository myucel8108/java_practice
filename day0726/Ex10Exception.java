package test.day0726;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex10Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader("D:\\java0711\\javawork\\Java0711Project\\src\\test\\day0726\\Ex3Anony.java");
			br=new BufferedReader(fr);
			//앞에 라인번호도 출력해보자
			int n=0;
			while(true)
			{
				//한줄씩 읽기
				String line=br.readLine();
				//마지막 문장까지 읽으면 null값을 반환한다
				if(line==null)
					break;
				//읽은 line을 행번호와 함께 출력해보자
				System.out.println(++n+":"+line);
			}
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









