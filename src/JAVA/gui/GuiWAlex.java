package JAVA.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiWAlex implements ActionListener {
	
	
	
	// palcing them here to make them visiable through out the code
	private static JLabel userLabel; 
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
 public static void main (String[] args) {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	// 100 x 100 window 
	
	 frame.setSize(400,600);   // size of the window
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // what the exit button does

	 frame.add(panel);
	////////////////////////////////////  BLANK PANEL////////////////////////////
	 panel.setLayout(null);
	
	userLabel = new JLabel("email address:");   /// text 
 
	userLabel.setBounds(10, 20, 200, 25);
		panel.add(userLabel);
	
	
	
	userText = new JTextField(20); // length of text field
	userText.setBounds(100, 20,165, 25);   // x  // y  // length of the text(Length of the words /// height of the text  
		panel.add(userText);   // add the text pannel
	
	passwordLabel = new JLabel("Pasword");
	passwordLabel.setBounds(10, 50, 80 , 25);
		panel.add(passwordLabel);
	
	
	// password field is the blank password entry  
	passwordText = new JPasswordField();  // this enters the password field in black dots
	passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
	
	button = new JButton("Login"); // displays the button text
	button.setBounds(10,80,80,25);
	button.addActionListener(new GuiWAlex());
		panel.add(button);
	
	
	
	
	success = new JLabel("");
	success.setBounds(10, 110, 300, 25);
		panel.add(success);
	
		frame.setVisible(true);
 
 }

@Override
public void actionPerformed(ActionEvent e) {
	// whenever we click the button 
//	System.out.println("Button clicked"); // this will print out the text to the output terminal with the text " Button clicked " 
	String user = userText.getText();
	String password = passwordText.getText();
	System.out.println(user + " " + password);  // this will print out the text in the user and password that was entered
	

		if(user.equals("Chris" ) && password.equals("Chris123")) {
			success.setText("Login successful! "); // this text will displpay when the user and password is matching to the string
			}
		}
	}
