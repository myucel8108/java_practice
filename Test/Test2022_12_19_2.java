package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test2022_12_19_2 {

	public static void main(String[] args) throws IOException {
//		—--------------------------------------------------------------------------------------------------------------
//		:  제어구조 중첩 + 수학  문제
//		—--------------------------------------------------------------------------------------------------------------
//
//		문제 9 : 다음 각 절차를 따라 작성하시오.
//
//		 1. 다음 한문장을 반복해서 다음과 같은 출력이 가능하도록 하는 코드를 작성하시오.
//		System.out.printf(“%c”, ‘┼’); 또는 System.out.printf(“%c”, ‘○’);
//
//		○┼┼┼┼┼┼┼┼┼
//		┼○┼┼┼┼┼┼┼┼
//		┼┼○┼┼┼┼┼┼┼
//		┼┼┼○┼┼┼┼┼┼
//		┼┼┼┼○┼┼┼┼┼
//		┼┼┼┼┼○┼┼┼┼
//		┼┼┼┼┼┼○┼┼┼
//		┼┼┼┼┼┼┼○┼┼
//		┼┼┼┼┼┼┼┼○┼
//		┼┼┼┼┼┼┼┼┼○
//
		{
//		      코드를 작성하는 공간
		for(int i=0; i<10;i++) {
			for(int j=0; j<10; j++) {
				 if(i ==j)
					 System.out.print("○");
				else
					System.out.print("┼");
			}
			System.out.println();
		}

	    System.out.println("1번 과제 출력 완료");
	
	}
//
//		// 2. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
//		○┼┼┼┼┼┼┼┼┼○
//		┼○┼┼┼┼┼┼┼○┼
//		┼┼○┼┼┼┼┼○┼┼
//		┼┼┼○┼┼┼○┼┼┼
//		┼┼┼┼○┼○┼┼┼┼
//		┼┼┼┼┼○┼┼┼┼┼
//		┼┼┼┼○┼○┼┼┼┼
//		┼┼┼○┼┼┼○┼┼┼
//		┼┼○┼┼┼┼┼○┼┼
//		┼○┼┼┼┼┼┼┼○┼
//		○┼┼┼┼┼┼┼┼┼○
//
		{
//		      코드를 작성하는 공간
			for(int i=0; i<11;i++) {
				for(int j=0; j<11; j++) {
					 if(i+j==10 || i==j)
						 System.out.print("○");
					else
						System.out.print("┼");
				}
				System.out.println();
			}


		    System.out.println("2번 과제 출력 완료");
	}
//
//
//		// 3. 위의 답을 복사해서 다음과 같은 출력이 가능하도록 코드를 수정하시오.
//		○┼┼┼┼┼┼┼┼┼○
//		┼○┼┼┼┼┼┼┼○┼
//		┼┼○┼┼┼┼┼○┼┼
//		┼┼┼○┼┼┼○┼┼┼
//		┼┼┼┼○┼○┼┼┼┼
//		┼┼┼┼┼○┼┼┼┼┼
//		┼┼┼┼○○○┼┼┼┼
//		┼┼┼○○○○○┼┼┼
//		┼┼○○○○○○○┼┼
//		┼○○○○○○○○○┼
//		○○○○○○○○○○○
//
		{
			for(int y=0; y<11;y++) {
				
				for(int x=0; x<11;x++) {

					  if(((x+y>=10) && x<=y) ||x==y || x+y==10)
						 System.out.print("○");
					 
					else
						System.out.print("┼");
				}
				System.out.println();
			}
		    System.out.println("3번 과제 출력 완료");
		}



	}	

}
