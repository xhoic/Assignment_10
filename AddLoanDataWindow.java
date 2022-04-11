import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddLoanDataWindow extends JPanel {

	static List<Loan> listLoan = new ArrayList<>();
	
	JTextField loanNumTF = new JTextField(10);
	JTextField loanAmountTF = new JTextField(10);
	JTextField lastNameTF = new JTextField(10);
	private JButton okBtn = new JButton("OK");
	
	String loanTermStr[] = { "1 year", "3 years", "5 years" };
	JComboBox loanTerm = new JComboBox(loanTermStr);
	
	String loanTypeStr[] = { "Business", "Personal" };
	JComboBox loanType = new JComboBox(loanTypeStr);
	
	public AddLoanDataWindow() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JLabel("Choose loan type:\n"));
		add(loanType);
		
		add(new JLabel("Enter the loan number:\n"));
		add(loanNumTF);
		add(new JLabel("Enter the last name:\n"));
		add(lastNameTF);
		add(new JLabel("Enter the loan amount:\n"));
		add(loanAmountTF);

		add(new JLabel("Choose term"));
		add(loanTerm);
		add(okBtn);
		
		okBtn.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Loan loan;
					try {
						
						if(loanType.getSelectedItem() == "Business") {
							loan = new BusinessLoan(loanNumTF.getText(), lastNameTF.getText(), Double.parseDouble(loanAmountTF.getText()), 1.0);
							loan.setInterestRate(CreateLoans.rate);
						} else {
							loan = new PersonalLoan(loanNumTF.getText(), lastNameTF.getText(), Double.parseDouble(loanAmountTF.getText()), 1.0);
							loan.setInterestRate(CreateLoans.rate);
						}
						
						listLoan.add(loan);
						
						System.out.println(loan.toString());
					} catch (Exception e1) {
						System.out.println(e1);
					}
					}
				}
			); 
		
	}
}
