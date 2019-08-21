/*Marshall Miller
 *Intro to Java Block 2
 *Quadratic Formula
 *This program will calculate the roots from a given quadratic equation of the formula ax^2+bx+c=0
 */

import javax.swing.JOptionPane;

public class QuadraticFormula
{
	public static void main(String args[])
	{
		JOptionPane pane = new JOptionPane();
		
		int a = Integer.parseInt(pane.showInputDialog(null, "ax^2 + bx + c = 0\nPlease enter the value for 'a'"));
		int b = Integer.parseInt(pane.showInputDialog(null, a + "x^2 + bx + c = 0\nPlease enter the value for 'b'"));
		int c = Integer.parseInt(pane.showInputDialog(null, a + "x^2 + " + b + "x + c = 0\nPlease enter the value for 'c'"));
		
		double discriminant = b*b - 4*a*c;
		if (discriminant < 0)
		{
			pane.showMessageDialog(null, "No real roots.", "Quadratic Formula", 2);
		}
		else
		{
			double root1 = (-1.0*b + Math.sqrt(discriminant))/2.0*a;
			double root2 = (-1.0*b - Math.sqrt(discriminant))/2.0*a;
			pane.showMessageDialog(null, "Your roots are " + root1 + " and " + root2 + ".", "Quadratic Formula", 1);
		}
	}
}