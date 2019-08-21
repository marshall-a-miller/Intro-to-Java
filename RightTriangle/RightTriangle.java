/*Marshall Miller
 *Intro to Java Block 2
 *Right Triangle
 *This program will draw a right triangle composed of asterisks based off user input for the height and width.
 */
 
 import java.util.Scanner;
 
 public class RightTriangle
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Please enter an integer > ");
 		int height = input.nextInt();
 		for(int i = 0; i <= height; i++)
 		{
 			for(int x = 0; x < i; x++)
 				System.out.print('*');
 			System.out.print('\n');
 		}
 	}
 }