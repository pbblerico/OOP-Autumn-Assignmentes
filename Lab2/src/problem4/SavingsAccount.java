package problem4;

public class SavingsAccount extends Account{
	private final static double interestRate;
	private final static double MIN_BALANCE;
	
	static {
		interestRate = 0.1;
		MIN_BALANCE = 1000;
	}
	
	public SavingsAccount() {}
	
	public SavingsAccount(int a) {
		super(a);
	}
	
	public void addInteres() {
		super.deposit(interestRate * super.getBalance());
	}
	
	public void withdraw(double sum) {
		if(sum + MIN_BALANCE <= super.getBalance()) super.withdraw(sum);
	}
	
	public void transfer(double amount, Account other) {
		if(canWithdraw(amount + MIN_BALANCE)) super.transfer(amount, other);
	}
	
	public String toString() {
		return super.toString() + " interest rate: " + interestRate + ", min balance: " + MIN_BALANCE; 
	}
}
