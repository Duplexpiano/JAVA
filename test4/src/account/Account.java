package account;

import java.time.LocalDate;

public class Account {
	private String id;
	private double balance, apr;
	private LocalDate openDate;

	public Account(String id, double balance, double apr, LocalDate openDate) {
		this.id = id;
		this.balance = balance;
		this.apr = apr;
		this.openDate = openDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getApr() {
		return apr;
	}

	public void setApr(double apr) {
		this.apr = apr;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	// ´æ¿î
	public double deposit(double money) {
		setBalance(getBalance() + money);
		return this.balance;
	}

	// È¡¿î
	public double withdraw(double money) {
		setBalance(getBalance() - money);
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [Id=" + id + ", Balance=" + balance + ", APR=" + apr + ", OpenDate=" + openDate + "]";
	}

}
