## Fundamental Programming Structures

1. Write an application that determines if an input word is a palindrome.
_A palindrome is a string that reads the same forward and backward_, for example, noon  and  madam.
Ignore the case of the letter.

2.  Prompt the user for a string.  Save it in a `StringBuffer` object.
    a. Append  “bye”  to the above.  Print it out.
    b. Make all lowercase letters uppercase, and uppercase letters lowercase.  Print the new string.

        For lowercase you can use something like

	```java
	if  ((char1 >= ‘a’)  &&  (char1 <= ‘z’))
	```
	
	Also check out the `Character` class!

3. Create a Java method `static int min(int[] arrayOfInts)` that outputs
the minimum of an array of ints. Create a main method that tests
your method on the following input array

    ```java
    [2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
    ```

    Test your method and make sure it works!

4. Do the same as above but instead of the minimum find the average of
the numbers in the array.  Test it.
3. Write a program that reads a sentence and prints out the sentence with
all uppercase letters changed to lowercase and all lowercase letters changed to uppercase.

    _Hint :  Look at the API documentation for the  Character  class to see which methods you can use._

5. Only use the top three rows of _table 3-8_ (Will have to attach this table)
   Create a two dimensional table with  3  rows and  6  columns.
   Put the data from the top 3 rows of table 3-8 into your table.

    * Print out the average of each row.
    * Print out the average of each column.


6. *Star Problems:*

   a) First do the algorithms on paper only, make sure that it works in your
   mind! At least two `for` loops are needed, one nested inside the other.
   Only after it works in your mind get it to work on the computer! Do Not use `printf` for this.

   Prompt the user for a number, for the length on the bottom of a picture.
   For example, say they input 6. The picture would look like :
   
      
       *
       **
       * *
       *  *
       *   *
       ******
      
	
    b) same as above except the picture looks like :

       ```
            *
       	   **
       	  * *
       	 *  *
       	*   *
       ******
       ```

       
    c) For this part the bottom must be an ODD number!  If 7 was entered the picture would
    look like :

       ```
	  *
       	 * *
       	*   *
       *******
       ```
       
Lab Level 2 :
---
1. Write an application that determines if an input sentence is a palindrome, for
example,  `A man, a plan, a canal, Panama!`

    You ignore the punctuation marks, blanks, and the case (upper or lower) of the letters.