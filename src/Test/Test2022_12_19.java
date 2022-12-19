package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
	
public class Test2022_12_19 {
	
	static  Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		System.out.println("원하는 배열의 크기를 만들어 보세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[][] map = new int[a][b];

		char[][] board = new char[a * 2][b * 2];

		SettingMap(map);

		inputMap(map);

		inputBoard(board, map);

		printBoard(board);

	}

	static void SettingMap(int[][] map) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("res/map.txt");
		PrintStream ps = new PrintStream(fos);
		System.out.println("0과 1로원하는 배열을 만들어 보세요 그만 두실려면 a를 눌러주세요 ");
		while (scan.hasNext()) {
			String temp = scan.next();
			if (temp.equals("a"))
				break;
			ps.print(temp + "\r\n");

		}

	}

	static void inputMap(int[][] map) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("res/map.txt");
		Scanner filescan = new Scanner(fis);
		String temp;
		for (int i = 0; i < map.length; i++) {

			temp = filescan.nextLine();
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Integer.parseInt(temp.substring(j, j + 1));
				System.out.print(map[i][j]);
			}

			System.out.println();
		}

		System.out.println("map 데이터 로드 완료");

	}

	private static void inputBoard(char[][] board, int[][] map) {

		System.out.println("Map 0번에 해당하는 board 배열의 원하는 무늬를 입력하세요(왼쪽 위부터 시계방향입니다.)");
		String board0 = scan.next();
		char board0Leftup = board0.charAt(0);
		char board0RightUp = board0.charAt(1);
		char board0RightBottom = board0.charAt(2);
		char board0LeftBottom = board0.charAt(3);
		System.out.println("Map 1번에 해당하는 board 배열의 원하는 무늬를 입력하세요(왼쪽 위부터 시계방향입니다.)");
		String board1 = scan.next();
		char board1Leftup = board0.charAt(0);
		char board1RightUp = board0.charAt(1);
		char board1RightBottom = board0.charAt(2);
		char board1LeftBottom = board0.charAt(3);

		int a = 0;
		for (int i = 0; i < map.length; i++) {
			int b = 0;
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 0) {
					board[a][b] = board1Leftup;
					board[a][b + 1] = board1RightUp;
					board[a + 1][b] = board0LeftBottom;
					board[a + 1][b + 1] = board0RightBottom;
				} else {
					board[a][b] = board1Leftup;
					board[a][b + 1] = board1RightUp;
					board[a + 1][b] = board1LeftBottom;
					board[a + 1][b + 1] = board1RightBottom;
				}
				b = b + 2;
			}
			a = a + 2;
			System.out.println();
		}
		System.out.println("board 그리기 완료");

	}

	static void printBoard(char[][] board) {

		for (char[] i : board) {
			for (char j : i) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("board 출력 완료");

	}
}
