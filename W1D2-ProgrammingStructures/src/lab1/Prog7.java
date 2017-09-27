package lab1;

import java.util.*;

public class Prog7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the database table: ");
		String databaseName = sc.nextLine();
		System.out.print("Enter the number of columns as an integer for the database: ");
		int numberOfColumns = Integer.parseInt(sc.nextLine());
		//get the column names
		String columns = "";
		for ( int i = 1; i <= numberOfColumns; i++) {
			System.out.print("Enter name for column " + i +": ");
			columns += (i == args.length - 1) ? sc.nextLine() : sc.nextLine() + ", ";
		}
		System.out.print("Enter the salary for this person: ");
		double salary = Double.parseDouble(sc.nextLine());
		sc.close();
		//print the SQL
		System.out.format("SELECT %s %n  FROM %s%n  WHERE salary > %.1f%n", 
				columns, databaseName, salary);
	}
}
