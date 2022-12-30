package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test2022_12_15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		문제 5  : 다음 각 절차를 따라 작성하시오.
//
//
//		1. res/alphabet.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
//		   abcdefghijklmn
		{
		FileOutputStream fos = new FileOutputStream("res/alphabet.txt");
		PrintStream ps = new PrintStream(fos);
	ps.print("abcdefghijklmn");
	}
		// 2. alphabet이라는 이름으로 문자 15개를 저장할 수 있는 배열 객체를 생성한다.
		char [ ] alphabet = new char[15];
		int count=0;
		// 3. res/alphabet.txt 파일에 저장된 구분자가 없는 영문자 값들을 alphabet 배열에 로드한다. 
		{
//		     코드를 작성하는 공간
			FileInputStream fis = new FileInputStream("res/alphabet.txt");
//			Scanner scan= new Scanner(fis);
//			String temp =scan.nextLine();
			
//			for(int i=0; i< temp.length(); i++) {
	//			alphabet[i] = temp.charAt(i);
	//			System.out.println(alphabet[i]);
//			}
			int read=0;
			
			while((read= fis.read())!= -1) {
				
				alphabet[count]=(char) read;
				System.out.println(read); //각 해당에 맞는 아스키 코드라는 것을 알 수 있음
				count++;
			}
			System.out.println(alphabet);
	    System.out.println("로드 완료");
		}
//
//		 3. 배열의 값이 다음과 같은 상태가 되도록 자리를 바꾼다.
//	    nmlkjihgfedcba
//
	{
		     // 코드를 작성하는 공간
			for(int i=0; i< alphabet.length-1; i++)
				for(int j=0; j< alphabet.length-1-i; j++) {
						if(alphabet[j]<alphabet[j+1]) {
							char temp=alphabet[j];
							alphabet[j]=alphabet[j+1];
							alphabet[j+1]=temp;
						}
					
				}
				System.out.println(alphabet);
				
		    System.out.println("자리변경 완료");
		}

//		// 4. res/alphabet-out.txt 파일로 배열의 값들을 저장 
		{
	     // 코드를 작성하는 공간
			FileOutputStream fos = new FileOutputStream("res/alphabet.txt");
			PrintStream ps = new PrintStream(fos);
			ps.print(alphabet);
		    System.out.println("저장 완료");
		    ps.close();
		    fos.close();
		}


	}

}
