package assignment43;

public class MyStringList {
	private String[] strArray;
	private int size;
	
	MyStringList(){
		size = 0;
		strArray = new String[2];
	}
	
	public void setSize(int newSize) {
		size += newSize;
	}
	
	/**
	 * adds s to the end of the underlying array
	 * @param s the string to be added
	 */
	public void add(String s) {
		if( strArray.length - size > 0) {
			strArray[size] = s;
		}else {
			resize();
			strArray[size] = s;
		}
		size += 1;
	}
			
	/**
	 * retrieves the String at the ith position in the underlying array
	 * @param i
	 * @return
	 */
	public String get(int i) {
		
		return "";
	}
			
	/**
	 * returns true if String s is found in the array, false otherwise		
	 * @param s
	 * @return
	 */
	public boolean find(String s) {
		boolean found = false;
		for(int i = 0; i < size; i++) {
			if( strArray[i].compareToIgnoreCase(s) == 0) {
				found = true;
				break;
			}	
		}
		return found;
	}	
			
	/**
	 * removes first occurrence of  String s if it is found in the underlying array	
	 * if found, returns true; if not found returns false	
	 * @param s
	 * @return
	 */
	public boolean remove(String s) {
		if( find(s)) {
			int index = 0;
			String[] str = new String[size];
			for (int i = 0; i < size; i++) {
				if( strArray[i].compareToIgnoreCase(s) == 0) {
					index = i;
					break;
				}
			}
			// concept taken from https://goo.gl/HcGV6k
			System.arraycopy(strArray, 0, str, 0, index);
			if( index < size - 1) {
				System.arraycopy(strArray, index+1, str, index, size-index-1);
			}
			size -= 1;
			strArray = str;
		}
		
		return true;
	}
	
	/**
	 * returns a String representation of the underlying array 
	 * here is a typical output: [Bob, Steve, Susan, Mark, Dave]
	 * @return
	 */
	public String toString(){
		StringBuffer str = new StringBuffer();
		for (int i = 0; i < size; i++) {
			if(size-1 == i) {
				str.append(strArray[i]);
			}else {
			 str.append(strArray[i]+", ");
			}
		}
		return String.format("[%s]", str);
	}
	
	/**
	 * returns the next open position in the underlying array – this is precisely 
	 * the number of Strings that have been added minus the number of String that have been removed.
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * In your class, the resize() method must be called whenever addition of 
	 * another String to the underlying array goes beyond the current length 
	 * of the array. The resize method should use System.arraycopy to create 
	 * a new String array having twice the size of the current String array, 
	 * and should copy the old array into the first part of the new array.
	 * 
	 */
	private void resize() {
		System.out.println("Resizing...");
		String[] tempStrArray = new String[size*2];
		System.arraycopy(strArray, 0, tempStrArray, 0, size);
		strArray = tempStrArray;
	}
}
