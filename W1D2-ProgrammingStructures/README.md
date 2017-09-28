### Instructions for Project One.


*Exercises by hand :*
---

1. Consider the following if…then logic:

   ```java
   if(age > 65) socialSecurityStatus = "eligible";
   else socialSecurityStatus = "ineligible";
   ```
   
    Rewrite this (pseudo) code using the Java ternary operator.

2.  Suppose a String s is initialized by

    ```java
    String s = "a friendly face";
    ```

    a. Compute the value of the expression `s.charAt(2);`
    b. What is the value of `s.length()?`
    c. What is the value of `s.substring(2,9)?` and `s.substring(4)?`

3. Write a Java expression that computes each of the following:
    a. Given the radius `r` of a circle, compute the area of the circle, and store it in a variable `A`.
    b. Given the length `len` and width `wid` of a rectangle, compute the length of the diagonal of
the rectangle, and store it in a variable `diag`.


4. You are reviewing some old Java programs in your company's IT department and you
read the following assignment statement in some abandoned code:

```
int a = (b = 5);
```

    Is the statement legal (i.e. would it compile)? If so, what value is assigned to the variable `a`? Explain.

### Lab  :
===

1. Create a class `Prog2`. Inside its `main` method, create `float` variables to store each of the
following numbers:    `1.27, 3.881, 9.6`

    Output to the console the following two values:

    a. the sum of the `floats` as an integer, obtained by casting the sum to type `int`
    b. the sum of the `floats` as an integer, obtained by rounding the sum to the nearest
    integer, using the `Math.round` function


2.    
    a. Write a program (called Prog5) that asks the user to input a String. The output is the
characters of this String in reverse order. (For example, if the input string is `"Hello"`, the
output string would be `"olleH"`.) (Do not use arrays and do not create a new String
object.)

    b. Output the number of  `x`s  in the string from the user.
    For example if the user types in  _Exit  abc  exit_,
    then the output would be  `2`  `x` characters”

3. Write a program (called `Prog6`) that accepts `String` arguments (stored in `args`) from the
main method, removes all duplicates, and outputs these arguments (without duplicates) in
a comma-separated format. For example, if the input into the main method is
`["horse", "dog", "cat", "horse","dog"]` then the output would be `"horse","dog","cat"`

    Typical output:

    Original list: `[ horse dog cat horse dog horse cat horse ]`
    List without duplicates: `[ horse dog cat ]`



### Lab Level 3  :
===

1. The records of a database table `Product` have been stored in text format using delimiters
`“:”` and `“,”` in the following way: Different rows are separated by `:` and, within a
particular record, different column entries are separated by `,`. In each record, the first
column is always `productId`.

    Write a program (called `Prog4`) that will read such a text file and extract all the product
    id’s that occur in the file. Your program should then output these values to the console in
    the following form: (this is a typical example)

    ```
    134A
    213A
    911C
    012E
    662Z
    ```

    Since we have not yet discussed how to read a file in Java, a text file is provided for you
    in this assignment named `Data.txt`.  The file is in our network folder. The records have
    been stored as a long `String` in `Data.txt`, named records.
    Simply copy this long string and paste it into your program.

5. Write a program that asks the user to enter a String. The program then writes to console
all substrings of this String . (By "substring", we mean any sequence of characters that
occur consecutively and in the same order in the given String . Therefore, "erg" is a
substring of "energy", but "gre" and "eng" are not. Note that the empty string "" is
considered a substring of every string.)

    Note: You will need to make sure that you do not output the same substring twice. For
instance, if the user types in "abbab", you might accidentally output the String "ab" twice,
since it occurs in two places in this String.

    Here is typical output:

    ```
    >Type in a string: what

    Substrings of length 0
    []
    Substrings of length 1
    [w]
    [h]
    [a]
    [t]
    Substrings of length 2
    [wh]
    [ha]
    [at]
    Substrings of length 3
    [wha]
    [hat]
    Substrings of length 4
    [what]
    ```

7. In this exercise, you will write a program (called Prog7) that creates
and outputs an SQL statement based on user input.

    The program prompts the user for the following pieces of information:

    ```
    table name
    number of column names
    column name (as many occurrences as there are column names)
    salary value
    ```

    For this exercise, the table name will refer to an imaginary database table that stores
    customer information, including name, zip, salary, and other columns that you may
    invent. The SQL statement that your program will output will be of the form

    ```sql
    SELECT <column names>
    FROM <table name>
    WHERE salary > <salary value>
    ```

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
    WHERE salary > 55000.0
    ```

    *IMPORTANT:* The output of your program is simply the sql query – just a String –
    printed to the console window. You will not run your query against a real database in this
    exercise. The exercise is simply to create an sql query (not to run it).  