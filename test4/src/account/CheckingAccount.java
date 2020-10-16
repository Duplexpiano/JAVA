package account;

import java.time.LocalDate;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(String id, double balance, double apr, LocalDate openDate) {
		super(id, balance, apr, openDate);
	}

	@Override
	public String toString() {
		return "CheckingAccount [overdraftLimit=" + overdraftLimit + "]";
	}

}
