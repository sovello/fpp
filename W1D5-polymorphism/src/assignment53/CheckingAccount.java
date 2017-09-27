package assignment53;

public class CheckingAccount extends Account {
	
	CheckingAccount(Employee emp, double balance){
		super(emp, balance);
	}
	
	public String getAccountType() {
		return "CHECKING";
	}
	
	public double getBalance() {
		double balance = super.getBalance();
		balance -= 0.05 * balance; //5% monthly service charge
		return balance;
	}
	
	public double computeInterest() {
	  	return super.getBalance() * 0.02;
	}
}
