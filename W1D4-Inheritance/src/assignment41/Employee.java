package assignment41;
import java.util.*;

//same as the Employee class defined in the lecture

public class Employee {
	
	//instance fields
	private String name;
	private double salary;
	private GregorianCalendar hireDay;
	
	//constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		hireDay = new GregorianCalendar(aYear,aMonth-1,aDay);
	}
	
	// instance methods
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return String.format("%s", name);
	}
	
	public String getHireDay() {
		return String.format("%1$tB %<td, %<tY", hireDay);
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	double  yearlyFederalTax () {
		double federalTax = 0;
		if( salary > 80000) {
			federalTax = 28*salary/100;
		}
		else if ( salary > 50000) {
			federalTax = 24*salary/100;
		}
		else if( salary > 26000) {
			federalTax = salary*20/100;
		}
		else if (salary <= 26000) {
			federalTax = 0;
		}
		return federalTax;
	}
}