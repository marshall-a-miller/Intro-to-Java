/*Marshall Miller
 *Intro to Java Block 2
 *Ascending Order
 *This program will ask for three integers and then print them out in ascending order.
 */
 
 import java.util.Scanner;
 
 public class AscendingOrder
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Please enter an integer > ");
 		int num1 = input.nextInt();
 		System.out.print("Please enter another integer > ");
 		int num2 = input.nextInt();
 		System.out.print("Please enter a third integer > ");
 		int num3 = input.nextInt();
 		int first, second, third;
 		//grammar
 		if (num3 > num2)
 		{
 			if (num3 > num1)
 			{
 				first = num3;
 				if (num2 > num1)
 				{
 					second = num2;
 					third = num1;
 				}
 				else
 				{
 					third = num2;
 					second = num1;
 				}
 			}
 			else
 			{
 				first = num1;
 				second = num3;
 				third = num2;
 			}
 		}
 		else
 		{
 			if (num3 < num1)
 			{
 				third = num3;
 				if (num1 < num2)
 				{
 					second = num1;
 					first = num2;
 				}
 				else
 				{
 					first = num1;
 					second = num2;
 				}
 			}
 			else
 			{
 				first = num2;
 				second = num3;
 				third = num1;
 			}
 		}
 		System.out.print("The numbers in ascending order are :\n" + third + '\n' + second + '\n' + first);
 	}
 }