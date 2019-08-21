/*Marshall Miller
 *Intro to Java Block 2
 *Going in Circles
 *This prorgam will use the methods of the Math class and Scanner class to input the area of a circle and calculate the radius
 */
 
 import java.util.Scanner;
 
 public class GoingInCircles
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("Enter the area of a circle > ");
 		double area = input.nextDouble();
 		double radius = Math.sqrt(area/Math.PI);
 		System.out.print("The radius of your circle is: " + radius);
 	}
 }