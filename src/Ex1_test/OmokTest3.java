package Ex1_test;

import java.util.Scanner;

public class OmokTest3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = 0;
		char[][] board = new char[10][10]; // 문자 100개를 담을 배열 만들기

		for (int y = 0; y < 10; y++)
			for (int x = 0; x < 10; x++)
				board[y][x] = '┼';

		// 상하 마감
		for (int x = 0; x < 10; x++)
			board[0][x] = '┬';

		for (int x = 0; x < 10; x++)
			board[9][x] = '┴';

		// 왼쪽 마감
		for (int y = 0; y < 10; y++)
			if (y == 0)
				board[y][0] = '┌';
			else if (y == 9)
				board[y][0] = '└';
			else
				board[y][0] = '├';

		// 오른쪽 마감
		for (int y = 0; y < 10; y++)
			if (y == 0)
				board[y][9] = '┐';
			else if (y == 9)
				board[y][9] = '┘';
			else
				board[y][9] = '┤';

		// 오목시스템
		while (true) {
			int ox, oy = -1;
			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 10; x++)
					System.out.printf("%c", board[y][x]);

				System.out.println();
			}
			if (count % 2 == 0)
				System.out.println("오목둘 위치를 정하시오. 현재 차례는 흑입니다. (x,y) 나가실거면 1111");
			else
				System.out.println("오목둘 위치를 정하시오. 현재 차례는 백입니다. (x,y) 나가실거면 11 11");
			ox = scan.nextInt();
			oy = scan.nextInt();

			// 종료기능
			if (ox == 11 && oy == 11)
				break;
			// 다시입력기능
			if (ox > 0 || oy > 0)
				if (board[oy - 1][ox - 1] == '●' || board[oy - 1][ox - 1] == '○') {
					System.out.println("다시 입력하세요");
					continue;
				}
			if ((ox <= 0 || ox > 10) || (oy <= 0 || oy > 10)) {
				System.out.println("다시 입력하세요");

				continue;
			}

			// 흑백 나누기
			if (count % 2 == 0)
				board[oy - 1][ox - 1] = '●';

			else
				board[oy - 1][ox - 1] = '○';

			// 승리조건
			// 가로 5새 세로 5개 대각선 5개

			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 10; x++) {
					// 가로세로 승리 조건
					if (x < 7 && y < 7) {
						if (board[y][x] == '●' && board[y][x + 1] == '●' && board[y][x + 2] == '●'
								&& board[y][x + 3] == '●' && board[y][x + 4] == '●') {
							System.out.println("흑의 승리");
							return;
						} else if (board[y][x] == '○' && board[y][x + 1] == '○' && board[y][x + 2] == '○'
								&& board[y][x + 3] == '○' && board[y][x + 4] == '○') {
							System.out.println("백의 승리");
							return;
						}
						if (board[y][x] == '●' && board[y + 1][x] == '●' && board[y + 2][x] == '●'
								&& board[y + 3][x] == '●' && board[y + 4][x] == '●') {
							System.out.println("흑의 승리");
							return;
						} else if (board[y][x] == '○' && board[y + 1][x] == '○' && board[y + 2][x] == '○'
								&& board[y + 3][x] == '○' && board[y + 4][x] == '○') {
							System.out.println("백의 승리");
							return;
						}
					}
					// 오른쪽 대각선
					if (x < 7 && y < 7) {
						if (board[y][x] == '●' && board[y + 1][x + 1] == '●' && board[y + 2][x + 2] == '●'
								&& board[y + 3][x + 3] == '●' && board[y + 4][x + 4] == '●') {
							System.out.println("흑의 승리");
							return;
						} else if (board[y][x] == '○' && board[y + 1][x + 1] == '○' && board[y + 2][x + 2] == '○'
								&& board[y + 3][x + 3] == '○' && board[y + 4][x + 4] == '○') {
							System.out.println("백의 승리");
							return;
						}
					}

					if (x >= 4 && y < 7) {
						if (board[y][x] == '●' && board[y + 1][x - 1] == '●' && board[y + 2][x - 2] == '●'
								&& board[y + 3][x - 3] == '●' && board[y + 4][x - 4] == '●') {
							System.out.println("흑의 승리");
							return;
						} else if (board[y][x] == '○' && board[y + 1][x - 1] == '○' && board[y + 2][x - 2] == '○'
								&& board[y + 3][x - 3] == '○' && board[y + 4][x - 4] == '○') {
							System.out.println("백의 승리");
							return;
						}
					}
				}

			}
			// 판을 기준으로 승리조건 생각하기-> 나머지
			count++;

		}


		System.out.println("오목을 그만 둡니다.");

	}

}
