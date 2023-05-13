package problem4;

public class AccountTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		System.out.println("Choose following number for account:\n"
				+ "Account: 1\n" + "Saving account: 2\n" + "Checking account: 3\n");
		
		bank.openAccount(1);
		bank.openAccount(1);
		bank.openAccount(2);
		bank.openAccount(2);
		bank.openAccount(3);
		bank.openAccount(3);
		
		for(Account acc: Bank.bank) {
			System.out.println(acc);
		}
		
		bank.update();
		System.out.println();
		
		for(Account acc: Bank.bank) {
			System.out.println(acc);
		}
	
		bank.closeAccount(1);
		
		System.out.println();
		
		for(Account acc: Bank.bank) {
			System.out.println(acc);
		}
	}
}