import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        # Exercises 3

### 1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that number.

If the number is a multiple of 5, you need to print "Buzz" instead of that number.

If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

*/
  for(int i=0; i<=100; i++){
      if(i % 3 == 0){
          System.out.println("Fizz");
      } else if (i % 5 == 0) {
          System.out.println("Buzz");
      } else if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("FizzBuzz");
      }
  }

/*
### 2.Write a Java program to reverse a string.
Test Data:
Input a string: The quick brown fox
Expected Output:
Reverse string: xof nworb kciuq ehT
*/
        String s = "The quick brown fox";
        StringBuilder reverse = new StringBuilder(s);

        System.out.println(reverse.reverse());
/*

### 3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number to print the table");
        int mult = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(mult + "X "+i+ " =" + mult*i );
        }
//
//### 4.Write a program to find the factorial value of any number entered through the keyboard.
//
//
//
        System.out.println("please enter factorial number");
        int factorial = input.nextInt();
        for (int i = 1; i <= factorial; i++) {
            System.out.println(i*factorial);
        }
//### 5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
//
//
        System.out.println("Please enter base number");
        int base = input.nextInt();
        System.out.println("Please enter power number");
        int power = input.nextInt();
        int result = 1;
        for (int i = 1; i <=power ; i++) {
            result *= base ;
        }
        System.out.println(result);
//
//### 6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//
//

        int evenSum = 0;
        int oddSum = 0;

        while (true) {
            System.out.print("Enter an integer (-1 to exit): ");
            int number = input.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
//### 7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
//
//
        System.out.println("enter positive integer");
        int n = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }


//### 8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
//
//
    int poCounter = 0;
    int neCounter = 0;
    int zeroCounter = 0;

      System.out.println("Enter number and -1 to exit");
    int y = input.nextInt();
    while(y != -1){
        if(y == 0){
            zeroCounter++;
        } else if (y < 0 ) {
            neCounter++;
        }else poCounter++;
        System.out.println("Enter number and -1 to exit");
        y = input.nextInt();
    }
    System.out.println("number of positive "+poCounter);
    System.out.println("number of negitave "+neCounter);
    System.out.println("number of zero "+zeroCounter);
//### 9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
//Expected Output:
//
//Week 1
//
// Day1
//
// Day2
//
// Day3
//
// Day4
//
// Day5
//
// Day6
//
// Day7
//
//Week 2
//
// Day1
//
// Day2
//
// ...
//
//
        for (int i = 1; i <= 4 ; i++) {
            System.out.println("week "+ i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("day "+ j);
            }
        }
//### 10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
//
//
        System.out.println("Enter your words");
        String word = input.next();
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

//        */
    }
}