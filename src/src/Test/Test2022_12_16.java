package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test2022_12_16 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/map.txt");
		PrintStream ps = new PrintStream(fos);

//		—--------------------------------------------------------------------------------------------------------------
//		:  제어구조 중첩 + 다차원 배열 + 배열  문제
//		—--------------------------------------------------------------------------------------------------------------
//		문제 7 : 다음 각 절차를 따라 작성하시오.
		// 1. res/map.txt 파일을 생성하고 다음 데이터를 복사/붙여넣으시오.
//		00010
//		01010
//		00000
		ps.print("00010\n01010\n00000");
		// 2. map이라는 이름으로 5x3 크기의 정수를 담을 수 있는 이차원 배열과 board라는 이름의 10X6크기의 문자를 담을 수 있는
		// 이차원 배열을 생성하시오.
		int[][] map = new int[3][5];
		char[][] board = new char[6][10];
		String temp;

		// 3. res/map.txt에서 읽은 데이터로 map 배열을 채우시오.

		inputMap(map);

		// 4. map 데이터 하나는 board 배열의 4칸과 대응되며 다음과 같은 모양으로 대응된다.
		// map에서 0은 다음 모양과 같다.
		// ┌ ┐
		// └ ┘
		// map에서 1은 다음 모양과 같다.
		// ▩▩
		// ▩▩
		// map에서 읽은 데이터를 이용해서 board 배열을 채우시오. 다음은 board 배열에 채워진
		// 모습니다.
		// ┌ ┐┌ ┐┌ ┐▩▩┌ ┐
		// └ ┘└ ┘└ ┘▩▩└ ┘
		// ┌ ┐▩▩┌ ┐▩▩┌ ┐
		// └ ┘▩▩└ ┘▩▩└ ┘
		// ┌ ┐┌ ┐┌ ┐┌ ┐┌ ┐
		// └ ┘└ ┘└ ┘└ ┘└ ┘

		{

			// 코드를 작성하는 공간
		
			for (int i = 0; i < map.length; i++) {
		
				for (int j = 0; j < map[i].length; j++) {
					int a = i*2;
					int b = j*2;
					if (map[i][j] == 0) {
						board[a][b] = '┌';
						board[a][b + 1] = '┐';
						board[a + 1][b] = '└';
						board[a + 1][b + 1] = '┘';
					} else {
						board[a][b] = '▩';
						board[a][b + 1] = '▩';
						board[a + 1][b] = '▩';
						board[a + 1][b + 1] = '▩';
					}
					}
			
				System.out.println();
			}

		}

		System.out.println("board 그리기 완료");

		// 5. board 배열을 화면에 출력하는 코드를 작성하시오.

		printBoard(board);

	}

	static void inputMap(int[][] map) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("res/map.txt");
		Scanner scan = new Scanner(fis);
		String temp;
		// 코드를 작성하는 공간
		for (int i = 0; i < map.length; i++) {

			temp = scan.nextLine();
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Integer.parseInt(temp.substring(j, j + 1));
				System.out.print(map[i][j]);
			}

			System.out.println();
		}

		System.out.println("map 데이터 로드 완료");

	}

	static void printBoard(char[][] board) {
		// 코드를 작성하는 공간
		for (char[]  i : board) {
			for (char  j :i) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("board 출력 완료");

	}
	
}
