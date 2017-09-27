package assignment51;

import java.util.*;

public class DeptEmployee {
	private String name;
	private GregorianCalendar hireDate;
	private double salary;
	
	DeptEmployee(String name, double salary, int month, int day, int year){
		this.name = name;
		this.salary = salary;
		hireDate = new GregorianCalendar(year, month, day);
	}
	
	public double computeSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHireDate() {
		return String.format("%1$ta %<tB %<td, %<tY", hireDate);
	}
	
	public String toString() {
		return String.format(
				"Employee Name: %s%n" +
				"    Hired on: %s%n", name, getHireDate());
	}
}
