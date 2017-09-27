package hashmapclass;

import java.util.*;

public class HashMapMain {
	
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
	
	private static MyHashMap<String, String> hashMap = new MyHashMap<String, String>();
	
	
	public static void main(String... args) {
		//add entries to MyHashMap
		
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i < names.length; i++) {
			hashMap.put(names[i], phoneNumbers[i]);
		}
		
		System.out.print("=======W-E-L-C-O-M-E=======\n");
		
		int input = 0;
		while( input != 'q' || input != 'Q') {
			System.out.print("\n==What do you want to do?==\n\n"+
					"1. Know how Many Elements in the Hash Table?\n" +
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
				System.out.format("There is %d elements\n", hashMap.size());
				break;
			case 3:
				hashMap.printHashTableKeysAndValues();
				break;
			case 4:
				System.out.println("Enter a name to search: ");
				String name = sc.nextLine();
				hashMap.search(name);
				break;
			default:
				System.out.println("You looser! We quit...");
				sc.close();
				System.exit(0);
			}
		}
	}
}
