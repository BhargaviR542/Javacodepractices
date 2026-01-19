import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class guessingNumber {
public static void main(String[] args) {
Random random = new Random();
int computerNumber = random.nextInt(100)+1;
Scanner scan = new Scanner(System.in);
int attempts =0;
int guess=0, correctGuess =0 ;
System.out.println("Welcome to number guessing game!!");
System.out.println("Guess a number between 1 and 100 and you have 5 attempts to guess" );

while(attempts < 5 && guess != computerNumber) {
System.out.println("Enter your guess: ");

try {

guess = scan.nextInt();


if(guess > 100 || guess < 1) {
System.out.println("Enter valid number between 1 and 100");
} else if (guess < computerNumber) {
 
System.out.println("The entered number "+guess+" is less than the number to guess");
} else if (guess > computerNumber) {
System.out.println("The entered number "+guess+" is greater than the number to guess");
} else {
System.out.println("The entered number is correct");
correctGuess=1;
}
attempts++;

} catch(InputMismatchException e) {
    System.out.println("Exception is thrown");
}
}
if(correctGuess == 0) {
    System.out.println("You have reached maximum attempts and the correct number is: "+ computerNumber);
}
}
}