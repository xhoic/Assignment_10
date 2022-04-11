// Author: Xhoi Caveli
// Date: 03/28/2022
// Desc: Program is used by a loan company. Uses GUI to prompt user for loan information and stores it in a list.


import java.util.ArrayList;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.text.*;
import java.util.List;
import java.util.Scanner;

public class CreateLoans extends JFrame {
	
	JTextField interestRateTF = new JTextField(5);
	
	static double rate = 0;

	private JButton okBtn = new JButton("OK");
	
	
	public CreateLoans() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		add(new JLabel("Please enter the prime interest rate:"));
		add(interestRateTF);
		add(okBtn);
		
		//function for the add button
		okBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					rate = Double.parseDouble(interestRateTF.getText());
					} // actionPerformed
				} // ActionListener
			); // add.addActionListener
	}


	public static void main(String[] args) {
		
		CreateLoans frame;
		frame = new CreateLoans();
		
		
		for(int i = 0; i < 5; i++) {
			
			AddLoanDataWindow panel = new AddLoanDataWindow();
			frame.add(panel);
		}
		
		frame.setTitle("Loans");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,750);
		frame.setVisible(true);
		
	}

}
