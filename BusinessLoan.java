
public class BusinessLoan extends Loan {
	
	public BusinessLoan(String loanNum, String lastName, double loanAmount, double term) throws Exception {
		super(loanNum, lastName, loanAmount, term);
	}
	
	@Override
	public void setInterestRate(double rate) {
		interestRate = rate + rate * 0.01;
	}

}
