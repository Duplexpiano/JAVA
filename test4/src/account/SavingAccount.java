package account;

import java.time.LocalDate;

public class SavingAccount extends Account {
	public SavingAccount(String id, double balance, double apr, LocalDate openDate) {
		super(id, balance, apr, openDate);
	}

//	@Override
//	public double deposit(double money) {
//		setBalance(getBalance() + money);
//		return super.getBalance();
//	}
//	@Override
//	public double withdraw(double money) {
//		if(super.getBalance() - money >= 0) {
//			super.setBalance(getBalance() - money);
//			return super.getBalance();
//		}
//		else {
//			System.out.println("Balance of SavingAccount is not enough.");
//			return 0;
//		}
//	}

}
