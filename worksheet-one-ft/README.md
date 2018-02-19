# Worksheet One 

## Fundamental Programming Structures

The **+** and **++** exercises are slightly more testing; please complete the other exercises first
before attempting them.

Remember to `commit` changes to your repository frequently.

1. Write a program that reads an integer and prints it in binary, octal, and hexadecimal. 
   Print the reciprocal as a hexadecimal floating-point number.
2. Write a program that reads an integer angle (which may be positive or negative) and 
   normalises it to a value between `0` and `359` degrees. 
   Try it first with the `%` operator, then with `floorMod`.
3. Using only the conditional operator, write a program that reads three integers and 
   prints the largest. Repeat with `Math.max`.
4. Write a program that prints the smallest and largest positive double values. 
   Hint: Look up `Math.nextUp` in the Java API.
5. What happens when you cast a `double` to an `int` that is larger than the largest 
   possible `int` value?
6. Write a program that computes the factorial `n! = 1 × 2 × ... × n`, using `BigInteger`. 
   Compute the factorial of `1000`.
7. Write a program that reads in two integers between `0` and `4294967295`, stores them in `int` 
   variables, and computes and displays their unsigned sum, difference, product, quotient, 
   and remainder.<br/>
   Do not convert them to `long` values.
8. Write a program that reads a string and prints all of its nonempty substrings.
1. Write a program that reads a line of text and prints all characters that are not ASCII, 
   together with their Unicode values.
1. (+)Write a program that prints a lottery combination, picking six distinct 
   numbers between 1 and 49. 
   + To pick six distinct numbers, start with an array list filled with `1...49`. 
   + Pick a random index and remove the element. 
   + Repeat six times. 
   + Print the result in sorted order.
1. (+) Write a program that reads a two-dimensional array of integers and determines whether 
   it is a *magic square*. (That is, whether the sum of all rows, all columns, and the diagonals is 
   the same). 
   
   Accept lines of input that you break up into individual integers, 
   and stop when the user enters a blank line. For example, with the input:
   
   ```
   16 3 2 13
   5 10 11 8
   9 6 7 12
   4 15 14 1
   (Blank line)
   ```
   your program should respond affirmatively.
1. (++) Write a program that stores Pascal's triangle up to a given `n` in an `ArrayList<ArrayList<Integer>>`.
