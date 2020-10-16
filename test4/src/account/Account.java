package account;

import java.time.LocalDate;

public class Account {
	private String id;
	private double balance, apr;
	private LocalDate openDate;

	public Account(String id, double balance, double apr, LocalDate openDate) {
		super();
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
	
	public double deposit() {
		return 0;
	}
	public double withdraw() {
		return 0;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", apr=" + apr + ", openDate=" + openDate + "]";
	}

}
