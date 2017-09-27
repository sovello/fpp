package assignment51;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		Professor p1 = new Professor("Sovello", 75000, 10, 9, 30, 2015);
		Professor p2 = new Professor("Mchiwa", 77000, 10, 2, 28, 2014);
		Professor p3 = new Professor("Angel", 80000, 10, 12, 31, 1990);
		Secretary s1 = new Secretary("Danning", 32000, 200, 5, 5, 1980);
		Secretary s2 = new Secretary("Jane", 45000, 200, 10, 23, 1987);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see all the salaries in the department? y/n ");
		String userInput = sc.nextLine();
		
		double sumSalary = 0;
		if( userInput.compareToIgnoreCase("y") == 0) {
			for(DeptEmployee e : department) {
				sumSalary += e.computeSalary();
			}
			System.out.format("The department pays a total of $%.2f in salaries%n%n", sumSalary);
		}
		else{
			System.out.println("Ok! Bye for now ...%n%n");
		}
		
		System.out.print("Do you want to search for an employee? y/n ");
		String search = sc.nextLine();
		
		if (search.compareToIgnoreCase("y") == 0) {
			System.out.print("Enter a name of the employee to search: ");
			String name = sc.nextLine();
			sc.close();
			for(DeptEmployee e : department) {
				if( name.compareToIgnoreCase(e.getName()) == 0){
					System.out.println("We found this employee");
					System.out.println("=*==*==*==*==*==*==*==*==*");
					System.out.print(e);
					System.out.format("    He/She earns $%.2f", e.computeSalary());
				}
			}
		}
		else{
			System.out.println("Ok! Bye for now ...%n%n");
		}
	}
}