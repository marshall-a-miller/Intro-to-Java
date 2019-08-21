/*Marshall Miller
 *Intro to Java Block 2
 *Fahrenheit to Celsius
 *This program will convert degrees Fahrenheit to Celsius using a formula.
 */
 public class FahrenheitToCelsius
 {
 	public static void main(String args[])
 	{
 		double degreesFahrenheit = 65.8;
 		double degreesCelsius = 5*(degreesFahrenheit-32)/9;
 		degreesCelsius = (double) Math.round(degreesCelsius * 10) / 10;
 		System.out.println("Your temperature in Fahrenheit is " + degreesFahrenheit + " degrees.");
 		System.out.print("Your temperature in Celsius is " + degreesCelsius + " degrees.");
 	}
 }