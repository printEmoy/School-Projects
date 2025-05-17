import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven extends JFrame implements ActionListener
{
	
	FlowLayout f1 = new FlowLayout();
	Font bFont = new Font("Arial", Font.BOLD, 12);
	JLabel FNamelbl = new JLabel ("First Name: "); JTextField FNametf = new JTextField(18);
	JLabel LNamelbl = new JLabel ("Last Name: "); JTextField LNametf = new JTextField(18);
	JLabel MNamelbl = new JLabel ("Middle Name: "); JTextField MNametf = new JTextField(18);
	JLabel MNumberlbl = new JLabel ("Mobile Number: "); JTextField MNumbertf = new JTextField(18);
	JLabel Emaillbl = new JLabel ("Email Address: "); JTextField Emailtf = new JTextField(18);
	JButton Submitbt = new JButton("Submit");
	JButton Clearbt = new JButton ("Clear");
	
	public EventDriven() 
	{
		super("INPUT");
		setSize(250, 400);
		setLayout(f1);
		FNamelbl.setFont(bFont); LNamelbl.setFont(bFont); MNamelbl.setFont(bFont);
		MNumberlbl.setFont(bFont); Emaillbl.setFont(bFont);
		add(FNamelbl); add(FNametf);
		add(LNamelbl); add(LNametf);
		add(MNamelbl); add(MNametf);
		add(MNumberlbl); add(MNumbertf);
		add(Emaillbl); add(Emailtf);
		add(Submitbt); add(Clearbt);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Submitbt.addActionListener(this);
		Clearbt.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		 if (e.getSource() == Submitbt) {
	            
	            String firstName = FNametf.getText();
	            String lastName = LNametf.getText();
	            String middleName = MNametf.getText();
	            String mobileNumber = MNumbertf.getText();
	            String email = Emailtf.getText();

	           
	            String outputMessage = "\n" + "First Name: " + firstName + "\n" + 
	            		"Last Name: " + lastName + "\n" + "Middle Name: " + middleName + "\n"
	                    + "Mobile: " + mobileNumber + "\n"
	                    + "Email: " + email;

	            
	            outputWindow(outputMessage);
	        } 
	        else if (e.getSource() == Clearbt) {
	            
	            FNametf.setText("");
	            LNametf.setText("");
	            MNametf.setText("");
	            MNumbertf.setText("");
	            Emailtf.setText("");
	        }
	}
		 
		    private void outputWindow(String message) {
		        JFrame outputFrame = new JFrame("OUTPUT");
		        outputFrame.setSize(300, 300);
		        outputFrame.setLayout(new FlowLayout());

		        JTextArea outputArea = new JTextArea(8, 25);
		        outputArea.setText(message);
		        outputArea.setEditable(false);
		        
		        JButton okay = new JButton("Okay");
		        okay.addActionListener(e -> outputFrame.dispose());

		        outputFrame.add(new JScrollPane(outputArea));
		        outputFrame.add(okay);
		        outputFrame.setVisible(true);
		    }
	
	public static void main(String[] args)
	{
		EventDriven frame = new EventDriven();
		frame.setVisible(true);
	}
}
