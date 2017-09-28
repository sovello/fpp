## Recursion

#### Programming Assignment 6-1

For this exercise, you will write your own exponential function.
Use the fact that for any (real number) x and any natural number n > 0,

```
x<sup>n</sup> = x * x<sup>n-1</sup>
```

to write a recursive method

```java
double power(double x,int n)
```

that returns xn and that uses only multiplication (and addition
and subtraction if necessary) for its computation. (For this
exercise, do not use the `Math` function `pow(x,n)`.)

Enclose your method in a class called `Exponential`.

Demonstrate that your method works by doing the
following: In the main method, create an instance
of Exponential, and, from this instance,
call `power(2,10)`, and print the result to the console.

