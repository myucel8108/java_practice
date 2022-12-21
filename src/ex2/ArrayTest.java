package ex2;

import java.util.Random;

public class ArrayTest {
	 static  int[] nums = { 20, 5, 7, 98, 45, 7, 45, 62, 12, 47 };
	
	 static void printNums(int[] nums) {
		 
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);
			if (i < 9)
				System.out.printf(",");
		}
		System.out.println();
	}
	
	 static  double print(boolean x,double y  ,char[][] z) {
		 
		 return 2.2;
		 
	 }
	
	public static void main(String[] args) {
		// 정수를 5개 담을 수 있는 배열을 만들기
		int[] ar1 = new int[5];

		ar1 = new int[7]; // 오 새로 만들 수 있음 통짜여도 나눠지지않는 1차원배열이기 때문에 때문에

		// 정수 5개를 담을 수 있고 3개가 이끄는 배열?
		int[][] ar2 = new int[3][5]; // 3*5*4(바이트)

		ar2 = new int[2][6]; // 중대장

		ar2[0] = new int[9]; // 소대장

		int[][] ar3 = new int[3][];// 소대원을 사이즈를 다르게 할 수 있음!-> 톱니형 배열!
		// 전부다 가능한 이유는 통짜 배열이 아니기 때문



		printNums(nums);
		
		// nums 에서 [0]공간의 값과 [2]공간의 값을 바꾸기
		Random rand = new Random(); // 랜덤하게!
		int s = rand.nextInt(10); // 0부터 9까지 주사위는 6
		int d = rand.nextInt(10);
		int a = rand.nextInt(6) + 1;
		int temp = nums[s];
		nums[s] = nums[d];
		nums[d] = temp;
		
		printNums(nums);

		char[][] names = new char[3][10];
	     double	cnt = print(true,4.0,names);
	}

}
