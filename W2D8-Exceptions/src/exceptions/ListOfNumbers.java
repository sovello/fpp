package exceptions;

//Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.*;
public class ListOfNumbers {

 private List<Integer> list;
 private static final int SIZE = 10;

 public ListOfNumbers () {
     list = new ArrayList<Integer>(SIZE);
     for (int i = 0; i < SIZE; i++) {
         list.add(new Integer(i));
     }
 }

 public void writeList() throws IOException {
	// The FileWriter constructor throws IOException, which must be caught.
	 PrintWriter out = null;
	 try {
		 out = new PrintWriter(new FileWriter("OutFile.txt"));
		 Handler handler = new FileHandler("OutFile.log");
		 Logger.getLogger("").addHandler(handler);
		 for (int i = 0; i <= SIZE; i++) {
	         // The get(int) method throws IndexOutOfBoundsException, which must be caught.
	         out.println("Value at: " + i + " = " + list.get(i));
	     }
	 }
	 catch(IOException e) {
		 
	 }
	 catch(IndexOutOfBoundsException e) {
		 System.out.println("The index is too large for the list");
		 Logger logger = Logger.getLogger("package.name"); 
		    StackTraceElement elements[] = e.getStackTrace();
		    for (int i = 0, n = elements.length; i < n; i++) {
		        logger.log(Level.WARNING, elements[i].getMethodName());
		    }
	 }
	 finally {
		 if( out != null) {
			 System.out.println("Closing PrintWriter");
			 out.close(); 
		 }
		 else {
			 System.out.println("PrintWriter not open");
		 }
	 }
 }
}