package assignment51;

public class Administrator extends DeptEmployee {
	
	private double workHours;
	
	Administrator(String name, double salary, double workHours, int month, int day, int year){
		super(name, salary, month, day, year);
		this.workHours = workHours;
	}

	public double computeSalary() {
		return workHours * 20;
	}
	
	public String toString() {
		String base = super.toString();
		return String.format(
				"%s    Level: Administrator%n"+
				"    Work Hours: %d%n", base, workHours );
	}
}
