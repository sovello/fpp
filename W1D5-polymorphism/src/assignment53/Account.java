package assignment53;

public abstract class Account {
	private final static String DEFAULT_ACCOUNT_TYPE = "SAVINGS";
	private double balance;
	
	@SuppressWarnings("unused")
	private final static double DEFAULT_BALANCE = 0.0;
	@SuppressWarnings("unused")
	private Employee employee;
	
	Account(Employee emp, double balance){
		this.employee = emp;
		this.balance = balance;
	}
	
	public String getAccountType() {
		return Account.DEFAULT_ACCOUNT_TYPE;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	//updates the balance field
	public void makeDeposit(double deposit) {
		balance += deposit;
	}
	
	/**
	 * updates the balance field and returns true, unless
	 * withdrawal amount is too large; in that case,
	 * it does not modify the balance field, and returns false
	 * 
	 * @param double amount the amount to withdraw
	 * @return boolean true if withdraw successful
	 */
	public boolean makeWithdrawal(double amount) {
		if( amount <= balance) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public abstract double computeInterest();
}