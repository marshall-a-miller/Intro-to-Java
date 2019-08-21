/*Marshall Miller
 *Intro to Java Block 2
 *Guessing Game
 *This program will generate a random number between 1 and 100 and say too high or to low until the user gets the number right.
 */
 
 import java.util.Scanner;
 
 public class GuessingGame
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		int randNum = (int)(Math.random() * 100) + 1;
 		int num = 0;
 		int tries = 0;
 		while(num != randNum)
 		{
 			System.out.print("Enter your guess > ");
 			num = input.nextInt();
 			if(num > randNum)
 			{
 				System.out.println("Too high, try again.");
 				tries++;
 			}
 			else if(num < randNum)
 			{
 				System.out.println("Too low, try again.");
 				tries++;
 			}
 		}
 		System.out.print("You guessed it in " + tries + " tries!");
 	}
 }