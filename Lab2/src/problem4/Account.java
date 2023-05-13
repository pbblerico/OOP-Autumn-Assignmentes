package problem4;

import java.util.Objects;

public class Account {
	private double balance;
	private int accNumber;
	
	{
		balance = 0.0;
	}
	
	public Account() {}
	
	public Account(int a) {
		accNumber = a;
	}
	
	public boolean canWithdraw(double sum) {
		return sum <= this.balance;
	}

	public void deposit(double sum) {
		if(sum > 0) this.balance += sum;
	}
	
	public void withdraw(double sum) {
		if(canWithdraw(sum)) this.balance -= sum;
	}
	
	public final double getBalance() {
		return this.balance;
	}
	
	public final int getAccountNumber() {
		return this.accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if(canWithdraw(amount)) {
			withdraw(amount);
			other.deposit(amount);
		}
	}
	
	public String toString() {
		return "balance: " + this.balance + ", account num: " + this.accNumber;
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		Account acc = (Account) o;
		return this.balance == acc.getBalance() && this.accNumber == acc.getAccountNumber();
	}
}
