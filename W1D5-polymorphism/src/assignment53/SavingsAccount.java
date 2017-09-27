package assignment53;

public class SavingsAccount extends Account {
	
	private final static double INTEREST_RATE = 0.0025;
	
	SavingsAccount(Employee emp, double balance){
		super(emp, balance);
	}
	
	public String getAccountType() {
		return "SAVINGS";
	}
	
	public double getBalance() {
		double balance = super.getBalance();
		balance += (INTEREST_RATE * balance); //.25% monthly interest rate
		//super.setBalance(balance);
		return balance;
	}
	
	public double computeInterest() {
		return super.getBalance() * 0.04;
	}
}
