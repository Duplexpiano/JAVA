package account;

import java.time.LocalDate;

public class TestAccount {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		Account a1 = new Account("Tom", 200, 0.02, date);
		System.out.println(a1);
	}

}
