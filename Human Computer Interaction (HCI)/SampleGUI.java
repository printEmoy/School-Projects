import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SampleGUI extends JFrame implements ActionListener {
	FlowLayout f1 = new FlowLayout();
	Font bFont = new Font("Arial", Font.BOLD, 16);
	Font cFont = new Font("Arial", Font.BOLD, 14);
	JLabel lb1 = new JLabel ("Enter your name: ");
	JTextField tf = new JTextField(10);
	JButton bt = new JButton("Click me");
	JLabel lb2 = new JLabel("");
	
	public SampleGUI() 
	{
		super("Sample Event");
		setSize(275, 225);
		setLayout(f1);
		lb1.setFont(bFont);
		lb2.setFont(cFont);
		add(lb1);
		add(tf);
		add(bt);
		add(lb2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String name = tf.getText();
		String greet = "Hi, " + name + "!";
		lb2.setText(greet);
		
	}
	
	public static void main(String[] args)
	{
		SampleGUI frame = new SampleGUI();
		frame.setVisible(true);
	}
}
