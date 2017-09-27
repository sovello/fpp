package assignment42;

public class Account {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	@SuppressWarnings("unused")
	private Employee employee;
	
	Account(Employee emp, AccountType acctType, double balance){
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}
	
	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	public String toString() {
		return "type = "+acctType+", balance = "+balance;
	}
	
	public AccountType getAccountType() {
		return acctType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//updates the balance field
	public void makeDeposit(double deposit) {
		balance += deposit;
	}
	
	
	public boolean makeWithdrawal(double amount) {
		//updates the balance field and returns true, unless
		//withdrawal amount is too large; in that case,
		//it does not modify the balance field, and returns false
		if( amount <= balance) {
			balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double computeInterest() {
		double interest = 0;
		switch (acctType) {
	  		case CHECKING:
	  			interest = balance * 0.02;
	  			break;
	  		case SAVINGS:
	  			interest = balance * 0.04;
	  			break;
	  		case RETIREMENT:
	  			interest = balance * 0.05;
	  			break;
  		}
		return interest;
	}
}