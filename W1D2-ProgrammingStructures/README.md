### Instructions for Project One.

1. Create a Java method `static int min(int[] arrayOfInts)` that outputs
the minimum of an array of ints. Create a main method that tests
your method on the following input array

```
[2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22]
```

    Test your method and make sure it works!

2. Do the same as above but instead of the minimum find the average of
the numbers in the array.  Test it.
3. Write a program that reads a sentence and prints out the sentence with
all uppercase letters changed to lowercase and all lowercase letters changed to uppercase.

    _Hint :  Look at the API documentation for the  Character  class to see which methods you can use._

4. On page 99, there is table 3-8.  We will only use the top three rows.
   Create a two dimensional table with  3  rows and  6  columns.
   Put the data from the top 3 rows of table 3-8 into your table.

    * Print out the average of each row.
    * Print out the average of each column.
    
7. In this exercise, you will write a program (called Prog7) that creates
and outputs an SQL statement based on user input.
The program prompts the user for the following pieces of information:
```table name
number of column names
column name (as many occurrences as there are column names)
salary value```
For this exercise, the table name will refer to an imaginary database table that stores
customer information, including name, zip, salary, and other columns that you may
invent. The SQL statement that your program will output will be of the form
```SELECT <column names>
FROM <table name>
WHERE salary > <salary value>```
For example, if the user types in these values:
>table name = Customer
>number of column names = 5
>column name = firstname
>column name = lastname
>column name = salary
>column name = state
>column name = zip
>salary value = 55000
then your program would produce the following output:
```sql
SELECT firstname,lastname,salary,state,zip
FROM Customer
WHERE salary > 55000.0```
IMPORTANT: The output of your program is simply the sql query – just a String –
printed to the console window. You will not run your query against a real database in this
exercise. The exercise is simply to create an sql query (not to run it).