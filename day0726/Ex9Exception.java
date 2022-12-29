package test.day0726;

import java.io.FileWriter;
import java.io.IOException;

public class Ex9Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
		try {
			fw=new FileWriter("d:/java0711/memo.txt");
			fw.write("이름:홍길동\n");
			fw.write("주소:비트캠프\n");
			
			System.out.println("파일을 확인하세요");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}













