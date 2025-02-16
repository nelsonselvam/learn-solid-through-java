package solid;

public class BankService {

	public long deposit(long amount, String accountNo) {
		// deposit amount
		return 0;
	}

	public long withDraw(long amount, String accountNo) {
		// withdraw amount
		return 0;
	}

	// all the above methods are related to basic banking service

	// below methods still relate to banking but are more appropriate if they have
	// their own classes
	public void printPassBook() {
		// update transaction info in pass book
	}

	// below class is subject to change in the future
	public void getLoanInterestInfo(String loanType) {

		if (loanType.equalsIgnoreCase("home")) {

		} else if (loanType.equalsIgnoreCase("personal")) {

		} else if (loanType.equalsIgnoreCase("auto")) {

		}
	}

	// so is the below class
	public void setOTP(String medium) {

		if (medium.equals("email")) {
			//
		}
	}
}
