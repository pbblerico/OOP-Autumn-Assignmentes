package problem4;

import java.util.Vector;
import java.util.Scanner;

public class Bank {
	static int cnt;
	static Vector <Account> bank;
	
	static {
		bank = new Vector <Account>();
		cnt = 0;
	}
	
	public Bank() {}
	
	public void update() {
		double sumToAdd = 100;
		double sumToWithdraw = 50;
		
		for(Account acc: bank) {
			acc.deposit(sumToAdd);
			acc.withdraw(sumToWithdraw);
		}
		
		for(Account acc: bank) {
			if(acc instanceof SavingsAccount) {
				SavingsAccount a = (SavingsAccount) acc;
				a.addInteres();
			}
		}
	}
	
	public void openAccount(int type) {
		if(type == 1) bank.add(new Account(cnt));
		else if(type == 2) bank.add(new SavingsAccount(cnt));
		else if(type == 3) bank.add(new CheckingAccount(cnt));
		cnt++;
	}
	
	public void closeAccount(int id) {
		bank.remove(getAcc(id));
	}
	
	public Account getAcc(int id) {
		for(Account a: bank) {
			if(a.getAccountNumber() == id) return a;
		}
		return null;
	}
}
