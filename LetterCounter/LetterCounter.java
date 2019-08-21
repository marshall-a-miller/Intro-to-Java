/*Marshall Miller
 *Intro to Java Block 2
 *Letter Counter
 *This program will count how many times a letter is used in a string.
 */
 
 import java.util.Scanner;
 
 public class LetterCounter
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Enter a string > ");
 		String str = input.nextLine();
 		System.out.print("Enter a character > ");
 		String chr_str = input.next();
 		char chr = chr_str.charAt(0);
 		int charRep = 0;
 		for(int i = 0; i < str.length(); i++)
 		{
 			if(str.charAt(i) == chr)
 				charRep += 1;
 		}
 		System.out.print("The character '" + chr + "' was found " + charRep + " times in the string \"" + str + "\".");
 	}
 }