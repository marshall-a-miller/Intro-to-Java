import javax.swing.*;
import java.awt.*;

// just testing GUI components with examples atm
public class FiveGuys extends JFrame
{
	public FiveGuys()
	{
		double subtotal = 12.00, tax = 1.00, total = 13.00;
		
		JPanel xIcon = new JPanel();
		xIcon.setLayout(new GridLayout(2, 1));
		ImageIcon icon = new ImageIcon("I:\\x.jpg");
		xIcon.add(new JLabel(icon));
		xIcon.add(new JLabel(""));
		//add image using JLabel
		
		JPanel bill = new JPanel();
		bill.setLayout(new GridLayout(3, 1));
		bill.add(new JLabel("12.00"));
		bill.add(new JLabel("1.00"));
		bill.add(new JLabel("13.00"));
		
		JPanel ok = new JPanel();
		ok.setLayout(new GridLayout(1, 5));
		ok.add(new JLabel(""));
		ok.add(new JLabel(""));
		ok.add(new JButton("OK"));
		ok.add(new JLabel(""));
		ok.add(new JLabel(""));
		
		add(ok, BorderLayout.SOUTH);
		add(bill, BorderLayout.CENTER);
		add(xIcon, BorderLayout.WEST);
	}
	
	public static void main(String args[])
	{
		FiveGuys frame = new FiveGuys(); // Create a frame
		frame.setTitle("Five Guys Bill");
		frame.setSize(300, 125); // Set the frame size
		frame.setLocationRelativeTo(null); // Center a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
	}
}