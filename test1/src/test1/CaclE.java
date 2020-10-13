package test1;

public class CaclE {
	public static void main(String[] args) {
		double e = 1;
		double err = 0.000001;
		double tmp = 1;
		int i = 1;
		while (1 / tmp > err) {
			tmp *= i++;
			e += 1 / tmp;
		}
		System.out.println(e);
	}
}
