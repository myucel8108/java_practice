package Test;

public class Canvas {
	private char[][] buf;

	public Canvas() {
		buf = new char[20][20];
	}

	public void drawLine(int i, int j, int k, int l) {

		for (int y = 0; y < buf.length; y++) {
			for (int x = 0; x < buf[y].length; x++) {
				if ((x == y) && (y >= j - 1 && y <= l - 1) && (x >= i - 1 && x <= k - 1)) {
					buf[y][x] = '○';
				} else
					this.buf[y][x] = '+';
				System.out.print(buf[y][x]);
			}
			System.out.println();
		}

	}

}
