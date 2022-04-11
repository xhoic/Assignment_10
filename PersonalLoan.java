
public class PersonalLoan extends Loan {

	public PersonalLoan(String loanNum, String lastName, double loanAmount, double term) throws Exception {
		super(loanNum, lastName, loanAmount, term);
		
	}

	@Override
	public void setInterestRate(double rate) {
		interestRate = rate + rate * 0.02;
	}
}
