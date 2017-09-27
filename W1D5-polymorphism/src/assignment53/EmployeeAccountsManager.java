package assignment53;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import space.fugit.fswing.*;

import java.util.*;
import java.util.List;

public class EmployeeAccountsManager extends FFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FButton accountReportReader, deposit, withdraw, balanceTotal;
	FRadioButton radioButton;
	FTextArea displayWindow;
	private Container container;
	private List<Employee> employeeList;
	private FPanel radioPanel;
	private ButtonGroup btnGroup;
	
	EmployeeAccountsManager(int height, int width, int columns){
		super(height, width, columns);
		
		employeeList= new ArrayList<Employee>();
		
		employeeList.add(new Employee("Jim Daley", 2000, 9, 4));
		employeeList.add(new Employee("Bob Reuben", 1998, 1, 5));
		employeeList.add(new Employee("Susan Randolph", 1997, 2,13));
		
		employeeList.get(0).createNewChecking(10500);
		employeeList.get(0).createNewSavings(1000);
		employeeList.get(0).createNewRetirement(9350);
		
		employeeList.get(1).createNewChecking(34000);
		employeeList.get(1).createNewSavings(27000);
		employeeList.get(1).createNewRetirement(10200);
		
		employeeList.get(2).createNewChecking(10038);
		employeeList.get(2).createNewSavings(12600);
		System.out.println("created "+employeeList.size());
		container = getContentPane();
		setTitle("Employees Account Manager");
		addContents();
		
	}
	
	private void setInitialConditions() {
		
	}
	
	private void addContents() {
		accountReportReader = new FButton(this, "Accounts Report", 1, 1);
		container.add(accountReportReader);
		
		deposit = new FButton(this, "Make Deposit", 2, 1);
		container.add(deposit);
		deposit.addActionListener(this);
		
		withdraw = new FButton(this, "Withdraw", 3, 1);
		container.add(withdraw);
		withdraw.addActionListener(this);
		
		balanceTotal = new FButton(this, "All Accounts Total Balance", 4, 1);
		container.add(balanceTotal);
		balanceTotal.addActionListener(this);
		
		displayWindow = new FTextArea(this, 5, 1);
		container.add(displayWindow);
		
		
		radioPanel = new FPanel(this, 1, 2, 2);
		container.add(radioPanel);
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		if(event != null) {
			if(event.getSource() instanceof FButton) {
				FButton button = (FButton)event.getSource();
				if (button.getText().equals("Make Deposit") ||
						button.getText().equals("Withdraw")) {
					getEmployeeListAsRadio(employeeList);
					validate();
				}
				if( button.getText().equals("Accounts Report")) {
					
				}
				if(button.getText().equals("All Accounts Total Balance")) {
					displayWindow.setText(
							String.format("The employee accounts make a\ntotal of %.2f", 
									totalOfAllBalances(employeeList)));
				}
			}
			//show account types as buttons
			if( event.getSource() instanceof FRadioButton) {
				//create panel to display radio buttons
				radioPanel.add(new JLabel("Select an account type to deposit"));
				FRadioButton rbutton = (FRadioButton)event.getSource();
				ButtonGroup accountTypeRadioGroup = new ButtonGroup();
				int i = 0;
				int employeeId = Integer.parseInt(rbutton.getActionCommand());
				List<Account> accounts = employeeList.get(employeeId).getAccounts();
				for(Account e : accounts) {
					FRadioButton accountRadioButton = new FRadioButton(Integer.toString(i), e.getAccountType());
					accountTypeRadioGroup.add(accountRadioButton);
					radioPanel.add(accountRadioButton);
					i++;	
					
				}
				radioPanel.add(new JLabel("Enter an amount to deposit"));
				JTextField amount = new JTextField(5);
				radioPanel.add(amount);
				JButton deposit = new JButton("Deposit");
				radioPanel.add(deposit);
				deposit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e != null) {
							if(e.getSource() instanceof JButton) {
								JButton submit = (JButton)e.getSource();
								if(submit.getText().equals("Deposit")) {
									Employee employee = employeeList.get(employeeId);
									int accId = Integer.parseInt(accountTypeRadioGroup.getSelection().getActionCommand());
									double amnt = Double.parseDouble(amount.getText());
									displayWindow.setText("Old Balance was "+employee.getAccount(accId).getBalance());
									employee.deposit(employee.getAccount(accId), amnt);
									displayWindow.append("\nNew Balance is now "+employee.getAccount(accId).getBalance());
								}
								
							} 
						}
					}
				});
				displayWindow.setEditable(false);
			}
		}
	}
	
	//returns employee list as radio button
	public void getEmployeeListAsRadio(List<Employee> empList) {
		radioPanel.add(new JButton("Select and Employee"));
		btnGroup = new ButtonGroup();
		for(int i = 0; i < empList.size(); i++){
			FRadioButton rdButton = new FRadioButton(Integer.toString(i), empList.get(i).getName());
			rdButton.addActionListener(this);
			btnGroup.add(rdButton);
			radioPanel.add(rdButton);
		}
	}
	
	private static double totalOfAllBalances(List<Employee> emp) {
		double sumBalance = 0;
		for(Employee e : emp) {
			for(Account acc : e.getAccounts()) {
				sumBalance = acc.getBalance();
			}
		}
		
		return sumBalance;
	}
}
