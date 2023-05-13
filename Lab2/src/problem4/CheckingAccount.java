package problem4;

public class CheckingAccount extends Account{
	private static final int FREE_TRANSACTIONS;
	static private final double MAX_SUM;
	private int transactionNum;
	private static final double FEE;
	
	static {
		FREE_TRANSACTIONS = 5;
		FEE = 0.0095;
		MAX_SUM = 300000.0;
	}
	
	{
		transactionNum = 0;
	}
	
	public CheckingAccount() {}
	
	public CheckingAccount(int a) {
		super(a);
	}
	
	public int getTransactionNum() {
		return this.transactionNum;
	}
	
	public double deductFee(double sum) {
		if(transactionNum > FREE_TRANSACTIONS || sum > MAX_SUM) return FEE * sum;
		return 0;
	}
	
	public void deposit(double sum) {
		if(sum - deductFee(sum) > 0) {
			transactionNum++;
			super.deposit(sum);
		}
	}
	
	public void withdraw(double sum) {
		if(canWithdraw(sum + deductFee(sum))) {
			transactionNum++;
		    super.withdraw(sum);
		}
	}
	
	public void transfer(double amount, Account other) {
		if(canWithdraw(amount + deductFee(amount))) super.transfer(amount, other);
	}
	
	public String toString() {
		return super.toString() + ", transactions: " + this.transactionNum + " free transactions: " + FREE_TRANSACTIONS + " max sum for operation: " + MAX_SUM + " fee: " + FEE;  
	}
}
