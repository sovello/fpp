package assignment53;

public class RetirementAccount extends Account {

	RetirementAccount(Employee emp, double balance){
		super(emp, balance);
	}
	
	public String getAccountType() {
		return "RETIREMENT";
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
		double balance = super.getBalance();
		if( amount <= balance) {
			balance -= 0.02 * balance; //2% penalty
			//super.setBalance(balance);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double computeInterest() {
	  	return super.getBalance() * 0.05;
	}
}
