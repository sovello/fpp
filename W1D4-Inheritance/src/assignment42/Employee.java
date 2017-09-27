package assignment42;

import java.util.*;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
		
	}
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
		
	}
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
		
	}
	
	public void deposit(Account account, double amt){
		account.makeDeposit(amt);
	}
	
	public boolean withdraw(Account account, double amt){
		boolean bool = account.makeWithdrawal(amt);
		return bool;
	}

	public String getName() {
		return name;
	}
	
	public Date getHireDate() {
		return (Date)hireDate.clone(); //need to return a copy, to avoid changing the original
	}
	public String getFormattedAccountInfo() {
		String checkingDetails = "";
		String savingsDetails = "";
		String retirementDetails = "";
		String intro = String.format("ACCOUNT INFO FOR %s:%n", getName() );
		if (checkingAcct != null) {
			checkingDetails = String.format("Account Type: %s%nAccount Bal: %s%n", 
					checkingAcct.getAccountType(), checkingAcct.getBalance());
		}
		if (savingsAcct != null) {
			savingsDetails = String.format("Account Type: %s%nAccount Bal: %s%n", 
					savingsAcct.getAccountType(), savingsAcct.getBalance());
		}
		if (retirementAcct != null) {
			retirementDetails = String.format("Account Type: %s%nAccount Bal: %s%n", 
					retirementAcct.getAccountType(), retirementAcct.getBalance());
		}
		return String.format("%s%s%s%s", intro, checkingDetails,savingsDetails,retirementDetails);
	}

}
