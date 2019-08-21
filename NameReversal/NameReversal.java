/*Marshall Miller
 *Intro to Java Block 2
 *Name Reversal
 *This program will recieve input of a first and last name and then print it back out reversed.
 */
 
 import java.util.Scanner;
 
 public class NameReversal
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Please enter your first and last name > ");
 		String name = input.nextLine();
 		for(int i = name.length(); i > 0; i--)
 		{
 			System.out.print(name.substring(i-1, i));
 		}
 	}
 }