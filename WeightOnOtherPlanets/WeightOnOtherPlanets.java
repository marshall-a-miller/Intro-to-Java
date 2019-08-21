/*Marshall Miller
 *Intro to Java Block 2
 *Weight on Other Planets
 *This program will determine a person's weight on another planet based on their weight on Earth.
 */
 
 import java.util.Scanner;
 
 public class WeightOnOtherPlanets
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		System.out.print("What is your weight on Earth? > ");
 		int earthWeight = input.nextInt();
 		System.out.print("Please select a planet:\n1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos\nOption > ");
 		int option = input.nextInt();
 		double newWeight;
 		switch(option)
 		{
 			case 1:
 				newWeight = earthWeight * 0.091;
 				System.out.print("Your weight on Voltar would be " + newWeight);
 				break;
 			case 2:
 				newWeight = earthWeight * 0.720;
 				System.out.println("Your weight on Krypton would be " + newWeight);
 				break;
 			case 3:
 				newWeight = earthWeight * 0.865;
 				System.out.println("Your weight on Fertos would be " + newWeight);
 				break;
 			case 4:
 				newWeight = earthWeight * 4.612;
 				System.out.println("Your weight on Servontos would be " + newWeight);
 				break;
 			default:
 				System.out.println("That is not a planet and you are now floating in space...");
 		}
 	}
 }