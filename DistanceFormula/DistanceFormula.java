/*Marshall Miller
 *Intro to Java Block 2
 *Distance Formula
 *This program will propmt the user for the x and y coordinates for two points and then compute the distance between the two points
 */
 
 import java.util.Scanner;
 
 public class DistanceFormula
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("First x coord > ");
 		int x1 = input.nextInt();
 		System.out.print("First y coord > ");
 		int y1 = input.nextInt();
 		System.out.print("Second x coord > ");
 		int x2 = input.nextInt();
 		System.out.print("Second y coord > ");
 		int y2 = input.nextInt();
 		double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
 		System.out.println("The distance formula is sqrt((x2-x1)^2+(y2-y1)^2)");
 		System.out.println("Your two original points were (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ").");
 		System.out.print("The distance between the two points is " + distance + ".");
 	}
 }