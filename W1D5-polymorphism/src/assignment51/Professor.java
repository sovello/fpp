package assignment51;

public class Professor extends DeptEmployee {
	private int numberOfPublications;
	
	Professor(String name, double salary, int numPubs, int month, int day, int year){
		super(name, salary, month, day, year);
		numberOfPublications = numPubs;
	}
	
	
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	
	public void setNumberOfPublications(int numPubs) {
		numberOfPublications = numPubs;
	}
	
	public String toString() {
		String base = super.toString();
		return String.format(
				"%s    Level: Professor%n"+
				"    Papers Published: %d%n", base, numberOfPublications );
	}
}
