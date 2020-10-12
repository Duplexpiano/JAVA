package KnightTravel;

import java.util.Scanner;

public class KnightTravel {
	static int X = 8, Y = 8;
	static int[][] map = new int[8][8];
	static int index = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("«Î ‰»Î≥ı ºŒª÷√:");
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		if (getAWay(x, y, 1) == false) {
			System.out.println("ERROR");
		}
	}

	public static void outputMap() {
		int i, j;
		for (i = 0; i < X; i++) {
			for (j = 0; j < Y; j++)
				System.out.printf("%-3d", map[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	public static Boolean getAWay(int x, int y, int step) {
		map[x][y] = step;
		int count = 0, x1 = x, y1 = y;
		boolean flag = false;
		if (X * Y == step) {
			outputMap();
			return true;
		}
		while (count < 8) {
			flag = false;
			x1 = x;
			y1 = y;

			while (!flag && count < 8)
				flag = nextxy(x1, y1, count);
			if (flag && getAWay(x1, y1, step + 1))
				return true;
		}
		if (count == 8) {
			map[x][y] = 0;
			return false;
		}
		return flag;
	}

	public static boolean nextxy(int x, int y, int count) {
		switch (count) {
		case 0:
			if (x + 1 < X && y - 2 >= 0 && map[x + 1][y - 2] == 0) {
				x = x + 1;
				y = y - 2;
				return true;
			}
			break;
		case 1:
			if (x + 2 < X && y - 1 >= 0 && map[x + 2][y - 1] == 0) {
				x = x + 2;
				y = y - 1;
				return true;
			}
			break;
		case 2:
			if (x + 2 < X && y + 1 < Y && map[x + 2][y + 1] == 0) {
				x = x + 2;
				y = y + 1;
				return true;
			}
			break;
		case 3:
			if (x + 1 < X && y + 2 < Y && map[x + 1][y + 2] == 0) {
				x = x + 1;
				y = y + 2;
				return true;
			}
			break;
		case 4:
			if (x - 1 >= 0 && y + 2 < Y && map[x - 1][y + 2] == 0) {
				x = x - 1;
				y = y + 2;
				return true;
			}
			break;
		case 5:
			if (x - 2 >= 0 && y + 1 < Y && map[x - 2][y + 1] == 0) {
				x = x - 2;
				y = y + 1;
				return true;
			}
			break;
		case 6:
			if (x - 2 >= 0 && y - 1 >= 0 && map[x - 2][y - 1] == 0) {
				x = x - 2;
				y = y - 1;
				return true;
			}
			break;
		case 7:
			if (x - 1 >= 0 && y - 2 >= 0 && map[x - 1][y - 2] == 0) {
				x = x - 1;
				y = y - 2;
				return true;
			}
			break;
		}
		return false;
	}
}
