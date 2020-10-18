package account;

import java.time.LocalDate;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(String id, double balance, double apr, LocalDate openDate, double overdraftLimit) {
		super(id, balance, apr, openDate);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

////	@Override
//	public double deposit(double money) {
//		return super.getBalance() + money;
//	}
////	@Override
//	public double withdraw(double money) {
//		if((super.getBalance() - money) > this.overdraftLimit) {
//			super.setBalance(getBalance() - money);
//			return super.getBalance();
//		}
//		else {
//			System.out.println("CheckingAccount Overdraft limit.");
//			return super.getBalance();
//		}
//	}

}
