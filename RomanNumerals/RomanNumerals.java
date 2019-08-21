/*Marshall Miller
 *Intro to Java Block 2
 *Roman Numerals
 *This program will turn an integer into a roman numeral
 */
 
 import java.util.Scanner;
 
 public class RomanNumerals
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Please enter an integer between 1-10 > ");
 		int number = input.nextInt();
 		String romanNumeral;
 		switch(number)
 		{
 			case 1:
 				romanNumeral = "I";
 				break;
 			case 2:
 				romanNumeral = "II";
 				break;
 			case 3:
 				romanNumeral = "III";
 				break;
 			case 4:
 				romanNumeral = "IV";
 				break;
 			case 5:
 				romanNumeral = "V";
 				break;
 			case 6:
 				romanNumeral = "VI";
 				break;
 			case 7:
 				romanNumeral = "VII";
 				break;
 			case 8:
 				romanNumeral = "VIII";
 				break;
 			case 9:
 				romanNumeral = "IX";
 				break;
 			case 10:
 				romanNumeral = "X";
 				break;
 			default:
 				romanNumeral = "That integer is not between 1 and 10.";
 		}
 		if (romanNumeral.length() > 4)
 			System.out.println(romanNumeral);
 		else
 			System.out.println("The number " + number + " as a roman numeral is " + romanNumeral + '.');
 	}
 }