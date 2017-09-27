package assignment53;

//import java.util.*;


public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		EmployeeAccountsManager acm = new EmployeeAccountsManager(700, 600, 2);
		acm.setVisible(true);
		//new Main();
	}
	
//	Main(){
//		List<Employee> employeeList= new ArrayList<Employee>();
//		
//		employeeList.add(new Employee("Jim Daley", 2000, 9, 4));
//		employeeList.add(new Employee("Bob Reuben", 1998, 1, 5));
//		employeeList.add(new Employee("Susan Randolph", 1997, 2,13));
//		
//		employeeList.get(0).createNewChecking(10500);
//		employeeList.get(0).createNewSavings(1000);
//		employeeList.get(0).createNewRetirement(9350);
//		
//		employeeList.get(1).createNewChecking(34000);
//		employeeList.get(1).createNewSavings(27000);
//		employeeList.get(1).createNewRetirement(10200);
//		
//		employeeList.get(1).createNewChecking(10038);
//		employeeList.get(1).createNewSavings(12600);
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.format("" +
//				"A. See a report of all accounts.%n" + 
//				"B. Make a deposit.%n" + 
//				"C. Make a withdrawal.%n" +
//				"D. Total of all balances.%n" +
//				"Make a selection (A/B/C/D): ");
//		String answer = sc.next();
//		
//		switch (answer.toUpperCase()) {
//		case "A":
//			for( Employee e: emps) {
//				e.getFormattedAccountInfo();				
//			}
//			break;
//		case "B":
//			getStaffList(emps);
//			int employee = sc.nextInt();
//			
//			getAccountList(employee, emps);
//			int account = sc.nextInt();
//			System.out.print("Deposit amount: ");
//			double amount = sc.nextDouble();
//			
//			emps[employee].deposit(emps[employee].getAccount(account), amount);
//			
//			System.out.format("$%.1f has been deposited in the%n%s account for %s%n", 
//					amount, emps[employee].getAccount(account).getAccountType(), emps[employee].getName());
//			break;
//		case "C":
//			getStaffList(emps);
//			int staff = sc.nextInt();
//			
//			getAccountList(staff, emps);
//			int acct = sc.nextInt();
//			System.out.print("Amount to withdraw: ");
//			double amnt = sc.nextDouble();
//			if(emps[staff].withdraw(emps[staff].getAccount(acct), amnt)){
//				System.out.println("You have withdrawn " + amnt);
//			}
//			else {
//				System.out.println("You have insufficient funds! Quiting...");
//			}
//			break;
//		case "D":
//			System.out.format("All accounts have a total of  $%.2f balance%n", totalOfAllBalances(employeeList));
//			break;
//		default:
//			System.out.println("You made a wrong choice ...");	
//		}
//		sc.close();
//	}
//	
//	private static void getStaffList(Employee[] employees) {
//		int i = 0;
//		for (Employee e: employees) {
//			System.out.format("%d %s%n", i, e.getName());
//			i++;
//		}
//		System.out.print("Select an employee: (type a number) ");
//	}
//	
//	private static void getAccountList(int index, Employee[] emp) {
//		int i = 0;
//		for(Account e : emp[index].getAccounts()) {
//			System.out.format("" +
//					"%d. %s%n", i, e.getAccountType());
//			i++;
//		}
//		System.out.print("Select an account: (type a number) ");
//	}
//	
	
}
