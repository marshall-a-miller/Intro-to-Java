/*Marshall Miller
 *Intro to Java Block 2
 *Internet Service Provider
 *This program will print the monthly charge for a certain amount of hours based on internet provider.
 */
 
 import java.util.Scanner;
 
 public class InternetServiceProvider
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Please choose which internet package you have by the letter preceding it.\n" +
 			"A - $9.95/mo for 10 hr, additional $2.00/hr\nB - $13.95/mo for 20 hr, additional $1.00/hr\n" +
 				"C - $19.95/mo, unlimited access\nPackage > ");
 		char internetPackage = Character.toUpperCase(input.next().trim().charAt(0));
 		System.out.print("Please enter the number of hours used rounded to an integer > ");
 		int hours = input.nextInt();
 		switch(internetPackage)
 		{
 			case 'A':
 				if (hours > 10)
 					System.out.println("Your bill total is $" + ((hours-10)*2+9.95) + " at $9.95 for the first 10 hours and $" + 
 						((hours-10)*2) + " for the additional " + (hours-10) + " hours.");
 				else
 					System.out.println("Your bill total is $9.95 for " + hours + " hours.");
 				break;
 			case 'B':
 				if (hours > 20)
 					System.out.println("Your bill total is $" + ((hours-20)+13.95) + " at $13.95 for the first 20 hours and $" + 
 						(hours-20) + " for the additional " + (hours-20) + " hours.");
 				else
 					System.out.println("Your bill total is $13.95 for " + hours + " hours.");
 				break;
 			case 'C':
 				System.out.println("Your bill total is $19.95 for " + hours + " hours of unlimited internet access.");
 				break;
 			default:
 				System.out.println("That is not an internet package!");
 		}
 	}
 }
