package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest2Solt {
	public static void main(String[] args) throws FileNotFoundException {
//		—--------------------------------------------------------------------------------------------------------------
//		:  제어구조 + 배열
//		—--------------------------------------------------------------------------------------------------------------
//
//		문제 4 : 다음 각 절차를 따라 작성하시오.
//
// 1. nums라는 이름으로 정수 15개를 저장할 수 있는 배열 객체를 생성한다.
		int[] nums = new int[15];
		int count = 0;
// 2. res/data.txt 파일에 저장된 값들을 nums 배열에 로드한다. 
		{
//		     // 코드를 작성하는 공간

			FileInputStream fis = new FileInputStream("res/data.txt");//
			Scanner scan = new Scanner(fis);
			while (scan.hasNext()) {

				nums[count] = scan.nextInt(); // 스페이스바 기준!
				System.out.print(nums[count]);
				count++;

			}

			System.out.println("로드 완료");

		}

// 3. 0~14 범위의 랜덤값 2개를 얻어서  그 위치의 값을 서로 바꾼다. 그것을 50번 반복한다.
		{
			// 코드를 작성하는 공간
			Random rand = new Random();
			int temp, x, y;
			// 셔플
			for (int i = 0; i < 50; i++) {
				x = rand.nextInt(15);
				y = rand.nextInt(15);
				temp = nums[x];
				nums[x] = nums[y];
				nums[y] = temp;
			}
			System.out.println("번호 섞기 완료");
		}
//
// 4. res/data-out.txt 파일로 배열의 값들을 저장 
		{
//		     // 코드를 작성하는 공간
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream out = new PrintStream(fos);
			for (int i = 0; i < count; i++) { // length 사용
				out.print(nums[i]);
				if (i < 14)
					out.printf(",");
			}

		}

		System.out.println("저장 완료");

		// sort 하기
		{
			FileOutputStream fos = new FileOutputStream("res/data-out.txt");
			PrintStream out = new PrintStream(fos);
			//제일큰 번호를 몇번째까지 구할 것 인지 반복
			for (int j = 0; j < 15 - 1; j++) {
				//제일 큰 번호를 제일 끝으로 옮기기
				for (int i = 0; i < 15 - 1 - j; i++)
					// 오름차순
					if (nums[i] > nums[i + 1]) {
						int temp = nums[i];
						nums[i] = nums[i + 1];
						nums[i + 1] = temp;
					}
			}
			for (int j = 0; j < nums.length; j++)
				out.printf("%d ", nums[j]);

		}

	}

}
