package ch12.exercises.ch12_e04;

public class LoanTest {

	public static void main(String[] args) {
		Loan loan = new Loan();
		
		try {
//			loan.setAnnualInterestRate(-1);
			loan.setNumberOfYears(-2);
//			loan.setLoanAmount(0);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
}
