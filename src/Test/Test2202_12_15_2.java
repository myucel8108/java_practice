package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test2202_12_15_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		—--------------------------------------------------------------------------------------------------------------
//		:  제어구조 중첩 + 다차원 배열
//		—--------------------------------------------------------------------------------------------------------------
//
//		문제 6 : 다음 각 절차를 따라 작성하시오.
//
//		// 1. res/bitmap.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
//
//		11111111110000000000
//		11111111100000000000
//		11111111000000000000
//		11111110000000000000
//		11111100000000000000
//		11111000000000000000
//		11110000000000000000
//		11100000000000000000
//		11000000000000000000
//		10000000000000000000
		FileOutputStream fos = new FileOutputStream("res/bitmap.txt");
		PrintStream ps = new PrintStream(fos);
		ps.print("11111111110000000000\r\n"
				+ "11111111100000000000\r\n"
				+ "11111111000000000000\r\n"
				+ "11111110000000000000\r\n"
				+ "11111100000000000000\r\n"
				+ "11111000000000000000\r\n"
				+ "11110000000000000000\r\n"
				+ "11100000000000000000\r\n"
				+ "11000000000000000000\r\n"
				+ "10000000000000000000\r\n"
				+ "");
//
//		2. bitmap이라는 이름으로 20X10크기의 정수를 담을 수 있는 이차원 배열을 생성하시오.
//
		int 	[][]  bitmap = new int[10][20];
	
//
//		3. 다음 그림과 같은 모양이 되도록 값의 위치를 변경하시오
//		00000000001111111111
//		00000000000111111111
//		00000000000011111111
//		00000000000001111111
//		00000000000000111111
//		00000000000000011111
//		00000000000000001111
//		00000000000000000111
//		00000000000000000011
//		00000000000000000001
//
		{
		     // 코드를 작성하는 공간
		FileInputStream fis = new FileInputStream("res/bitmap.txt");
		Scanner scan = new Scanner(fis);
			
		
			for(int i=0; i<bitmap.length;i++) {		
				String	read=	scan.nextLine();
				for(int j=0;j<bitmap[i].length;j++ ) {
					bitmap[i][j]= Integer.parseInt(read.substring(j, j+1));
					System.out.print(bitmap[i][j]);
					}
				
				System.out.println();
			}		
			//버블정렬을 쓰게 된다면 이런방식?
			for(int n=0; n<bitmap.length-1;   n++)
				for(int i=0; i<bitmap.length;   i++) {		
					for(int j=0;j<bitmap[i].length-1;    j++ ) {
						if(bitmap[i][j]>bitmap[i][j+1]) {
							int temp=bitmap[i][j];
							bitmap[i][j]=bitmap[i][j+1];
							bitmap[i][j+1]=temp;					
							}
					}
				}
			//버블정렬 없이 쓴다면 선택정렬
			
			
			
			for(int i=0; i<bitmap.length;i++) {		
				for(int j=0;j<bitmap[i].length;j++ ) {
					System.out.print(bitmap[i][j]);
					}
				System.out.println();
				}
	
		    System.out.println("자리변경 완료");
		}
//
//
//		// 4. res/bitmap-out.txt 파일로 bitmap 배열의 값들을 저장 
	{
	     // 코드를 작성하는 공간
		for(int i=0; i<bitmap.length;i++) {		
			for(int j=0;j<bitmap[i].length;j++ ) {
				ps.print(bitmap[i][j]);
				}
			ps.println();
			}

	    ps.close();
	    fos.close();

		    
	    System.out.println("저장 완료");
		}
//


	}

}
