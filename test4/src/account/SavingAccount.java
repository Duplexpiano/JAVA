package account;

import java.time.LocalDate;

public class SavingAccount extends Account {

	public SavingAccount(String id, double balance, double apr, LocalDate openDate) {
		super(id, balance, apr, openDate);
	}

}
