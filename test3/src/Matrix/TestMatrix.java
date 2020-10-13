package Matrix;

import java.util.Scanner;

public class TestMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input your choice:");
		System.out.println("1.ADD");
		System.out.println("2.MINUS");
		System.out.println("3.MULTI");
		System.out.println("4.TRANS");
		int x = in.nextInt();
		Matrix m1 = new Matrix(3, 3);
		System.out.println("Matrix1:");
		m1.display();
		System.out.println("------" + "\n" + "resMatrix:");
		switch(x){
		case 1:
			Matrix m2 = new Matrix(3, 3);
			if(m1.add(m2) != null)
				m1.add(m2).display();
			break;
		case 2:
			Matrix m3 = new Matrix(3, 3);
			if(m1.minus(m3) != null)
				m1.minus(m3).display();
			break;
		case 3:
			Matrix m4 = new Matrix(3, 2);
			if(m1.multiple(m4) != null)
				m1.multiple(m4).display();
			break;
		case 4:
			m1.transposition().display();
			break;
		default:
			System.out.println("Input Error!");
			break;
		}

		in.close();
	}

}
