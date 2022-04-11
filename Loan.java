
public abstract class Loan implements LoanConstants {
	protected String loanNum;
	protected String lastName;
	protected double loanAmount;
	protected double interestRate;
	protected double term;
	
	public Loan(String loanNum, String lastName, double loanAmount, double term) throws Exception {
		super();
		if(loanAmount > maxLoanAmount) {
			throw new Exception("Maximum loan amount is $" + maxLoanAmount);
		}
		this.loanNum = loanNum;
		this.lastName = lastName;
		this.loanAmount = loanAmount;
		
		if(term != shortTerm && term != mediumTerm && term != longTerm) {
			this.term = shortTerm;
		} else {
			this.term = term;
		}
	}

	protected String getLoanNum() {
		return loanNum;
	}

	protected void setLoanNum(String loanNum) {
		this.loanNum = loanNum;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected double getLoanAmount() {
		return loanAmount;
	}

	protected void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	protected double getInterestRate() {
		return interestRate;
	}

	protected void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	protected double getTerm() {
		return term;
	}

	protected void setTerm(double term) {
		this.term = term;
	}

	@Override
	public String toString() {
		if(term == shortTerm) {
			return "Loan number: " + loanNum + "\nLast Name: " + lastName + "\nLoan Amount: $" + String.format("%.2f", loanAmount) + "\nInterest Rate: $"
					+ String.format("%.2f", interestRate) + "\nLoan Term: " + term + " year";
		}
		return "Loan number: " + loanNum + "\nLast Name: " + lastName + "\nLoan Amount: $" + String.format("%.2f", loanAmount) + "\nInterest Rate: $"
				+ String.format("%.2f", interestRate) + "\nLoan Term: " + term + " years";
	}
	
	
	
}
