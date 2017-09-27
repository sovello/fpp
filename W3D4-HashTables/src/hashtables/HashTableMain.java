package hashtables;

import java.util.*;

public class HashTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyHashTable myHashtable = new MyHashTable(10);
		
		for( int i = 0; i < names.length; i++) {
			myHashtable.put(names[i], phoneNumbers[i]);
		}
		
		System.out.print("=======W-E-L-C-O-M-E=======\n");
		
		int input = 0;
		while( input != 'q' || input != 'Q') {
			System.out.print("\n==What do you want to do?==\n\n"+
					"1. Know how Many Elements in the Hash Table?\n" +
					"2. Know How many elements are in the longest node?\n" +
					"3. Print all elements in the hashtable?\n" +
					"4. Search for entries in the hash table one by one.\n" +
					"\nMake a choice, or press q/Q to quit: "
					);
			
			
			try {
				input = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e) {
				input = 10;
			}
			
			switch(input) {
			case 1:
				System.out.format("There is %d elements\n", myHashtable.getNumberOfElements());
				break;
			case 2:
				System.out.format("The largest list in the table has %d elements\n", myHashtable.elementsInLongestList());
				break;
			case 3:
				myHashtable.printHashTableIndexAndKeys();
				break;
			case 4:
				System.out.println("Enter a name to search: ");
				String name = sc.nextLine();
				myHashtable.search(name);
				break;
			default:
				System.out.println("You looser! We quit...");
				System.exit(0);
			}
		}
	}
	
	
	private static String[] names = 
		{
			"Grant Siegrist", "Shaunta Jacinto", "Tomi Shelley",
			"Deb Ide", "Chana Siewert", "Roy Abrahams",
			"Leonel Donner", "Sheri Whiten", "Elia Lazos",
			"Rosalba Foos", "Aurora Kilian", "Andre Christoff",
			"Shena Barlow", "Idella Mummert", "Jeffrey Miura",
			"Maxwell Solley", "Consuela Ferland", "Milford Teasley",
			"Felton Debose", "Willian Liddell", "Willian Liddell"
		};
	private static String[] phoneNumbers = 
		{
			"101-731-2943", "523-270-6040", "801-569-7362", "671-565-5622",
			"343-665-8553", "902-891-4551", "407-980-5877", "438-876-1678",
			"686-679-0038", "168-248-1258", "737-500-9690", "575-883-3362", 
			"552-720-4948", "662-259-7624", "115-988-9271", "983-932-7443", 
			"655-831-6997", "436-390-8226", "623-835-6887", "144-743-9249", "144-743-9249"
		};
}
