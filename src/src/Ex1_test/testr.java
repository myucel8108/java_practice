package Ex1_test;

import java.util.Scanner;

public class testr {
	public static void main(String[] args) {
		char[][] board = new char[10][10];
		// 배열에 값 대입
		for (int y = 1; y <= 10; y++)
			for (int x = 1; x <= 10; x++)
				board[y - 1][x - 1] = '┼';
		// 윗판 마감
		for (int x = 1; x <= 10; x++)
			board[0][x - 1] = '┬';
		// 아래판 마감
		for (int x = 1; x <= 10; x++)
			board[9][x - 1] = '┴';
		// 왼쪽 마감
		for (int y = 1; y <= 10; y++) {
			if (y == 1) {
				board[y - 1][0] = '┌';
			} else if (y == 10) {
				board[y - 1][0] = '└';
			} else {
				board[y - 1][0] = '│';
			}
		}
		// 오른쪽 마감
		for (int y = 1; y <= 10; y++)
			if (y == 1) {
				board[y - 1][9] = '┓';
			} else if (y == 10) {
				board[y - 1][9] = '┛';
			} else {
				board[y - 1][9] = '│';
			}

		// 바둑판 그리기
		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++)
				System.out.print(board[y - 1][x - 1]);
			System.out.println();
		}
		// 사용자로부터 다음 모양의 입력을 요청한다.
		// (x,y)>3 3
		int ox, oy;
		boolean order = true;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("(x,y)>");
			ox = sc.nextInt();
			oy = sc.nextInt();
			// 값 제한

			if (ox < 1 || ox > 10 || oy < 1 || oy > 10) {
				System.out.printf("잘못된 좌표입니다. <%d,%d>\n", ox, oy);
				continue;
			}

			// 이미 돌이 있다면 돌을 두지 않는다
			if (board[oy - 1][ox - 1] == '●' || board[oy - 1][ox - 1] == '○') {
				System.out.println("이미 돌이 있습니다.");
				continue;
			}

			// 흑백 바꾸기 삼항연산자 해보자~
			if (order)
				board[oy - 1][ox - 1] = '○';
			else
				board[oy - 1][ox - 1] = '●';

			order = !order;

			// 바둑판 그리기
			for (int y = 1; y <= 10; y++) {
				for (int x = 1; x <= 10; x++)
					System.out.print(board[y - 1][x - 1]);
				System.out.println();
			}

		}
	}
}