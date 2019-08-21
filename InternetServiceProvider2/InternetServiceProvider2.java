/*Marshall Miller
 *Intro to Java
 *Internet Service Provider 2
 *This program is based off the first Internet Service Provider except it will calculate and display the money customers save with each package
 */
 
 import java.util.Scanner;
 
 public class InternetServiceProvider2
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
 		double priceA = 9.95 + (((hours>10)?1:0)*(hours-10)*2), priceB = 13.95 + (((hours>20)?1:0)*(hours-20)), priceC = 19.95;
 		System.out.println(priceA + "\t" + priceB + "\t" + priceC);
 		if (internetPackage == 'A')
 		{
 			if (hours > 10)
 			{
 				System.out.println("Your bill total is $" + ((hours-10)*2+9.95) + " at $9.95 for the first 10 hours and $" + 
 						((hours-10)*2) + " for the additional " + (hours-10) + " hours.");
 			}
 			else
 			{
 				System.out.println("Your bill total is $9.95 for " + hours + " hours.");
 			}
 			if (priceA > priceB)
 				System.out.println("You would save $" + (priceA - priceB) + " with Package B!");
 			if (priceA > priceC)
 				System.out.println("You would save $" + (priceA - priceC) + " with Package C!");
 		}
 		else if (internetPackage == 'B')
 		{
 			if (hours > 20)
 			{
 				System.out.println("Your bill total is $" + ((hours-20)+13.95) + " at $13.95 for the first 20 hours and $" + 
 						(hours-20) + " for the additional " + (hours-20) + " hours.");
 			}
 			else
 			{
 				System.out.println("Your bill total is $13.95 for " + hours + " hours.");
 			}
 			if (priceB > priceA)
 				System.out.println("You would save $" + (priceB - priceA) + " with Package A!");
 			if (priceB > priceC)
 				System.out.println("You would save $" + (priceB - priceC) + " with Package C!");
 		}
 		else if (internetPackage == 'C')
 		{
 			System.out.println("Your bill total is $19.95 for " + hours + " hours of unlimited internet access.");
 			if (priceC > priceB)
 				System.out.println("You would save $" + (priceC - priceB) + " with Package B!");
 			if (priceC > priceA)
 				System.out.println("You would save $" + (priceC - priceA) + " with Package A!");
 		}
 		else
 		{
 			System.out.println("That is not an internet package!");
 		}
 	}
 }
 