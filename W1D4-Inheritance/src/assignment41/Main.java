package assignment41;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Sovello", 47564, 2001, 7, 12);
		System.out.format("Employee: %s%nEmployed on: %s%n%n", employee, employee.getHireDay());
		Account[] accounts = new Account[3];
	    accounts[0] = new Account(employee, AccountType.CHECKING, 300);
	    accounts[1] = new Account(employee, AccountType.SAVINGS, 300);
	    accounts[2] = new Account(employee, AccountType.RETIREMENT, 300);
	    
	    for(Account account : accounts) {
	    	System.out.format("%s %nAnnual interest is $%.2f%n%n", account, account.computeInterest());
	    }
	}
}
