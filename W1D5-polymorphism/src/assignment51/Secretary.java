package assignment51;

public class Secretary extends DeptEmployee {
	private double overtimeHours;

	Secretary(String name, double salary, double overtimeHours,
			int month, int day, int year){
		super(name, salary, month, day, year);
		this.overtimeHours = overtimeHours;
	}
	
	
	public double getOvertimeHours() {
		return overtimeHours;
	}
	
	public void setOvertimeHours(double overtimeHrs) {
		overtimeHours = overtimeHrs;
	}
	
	public double computeSalary() {
		return super.computeSalary() + (12 * overtimeHours);
	}
	
	public String toString() {
		String base = super.toString();
		return String.format(
				"%s    Level: Secretary%n"+
		"    Overtime Hours Worked: %.2f%n", base, overtimeHours );
	}
}
