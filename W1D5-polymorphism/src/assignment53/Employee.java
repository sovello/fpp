package assignment53;

import java.util.*;

public class Employee {
	private String name;
	private GregorianCalendar hireDate;
	private List<Account> accounts;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = new GregorianCalendar(yearOfHire, monthOfHire-1, dayOfHire);
		accounts = new ArrayList<Account>();
	}

	
	public void createNewChecking(double startAmount) {
		accounts.add(new CheckingAccount(this, startAmount));
		
	}
	
	public void createNewSavings(double startAmount) {
		accounts.add(new SavingsAccount(this, startAmount));
	}
	
	public void createNewRetirement(double startAmount) {
		accounts.add(new RetirementAccount(this, startAmount));
		
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
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
	
	public Account getAccount(int index) {
		return accounts.get(index);
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}
	
	public GregorianCalendar getHireDate() {
		return hireDate;
	}
	
	public void getFormattedAccountInfo() {
		System.out.format("%nACCOUNT INFO FOR %s:%n", getName());
		System.out.format(String.format("Employed on: %1$tA %<tB %<td, %<tY%n", hireDate));
		for (Account acc : accounts) {
			System.out.format("Account Type: %s%nAccount Bal: $%.2fs%n", 
					acc.getAccountType(), acc.getBalance());
		}
	}

}
