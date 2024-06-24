package entities;

public class Validator {
	private int userAccountNumber;
	private String accountName;
	private double startingBalance;
	
	public Validator(int userAccountNumber, String accountName, double startingBalance) {
		this.userAccountNumber = userAccountNumber;
		this.accountName = accountName;
		this.startingBalance = startingBalance;
	}
	
	public int getUserAccountNumber() {
		return userAccountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getStartingBalance() {
		return startingBalance;
	}
	
	public void depositAmount(double depositValue) {
		this.startingBalance += depositValue;
	}
	
	public void amountToWithdraw(double withdrawValue) {
		this.startingBalance = this.startingBalance - withdrawValue - 5;
	}

	public String toString() {
		return "Account "
			+ userAccountNumber
			+ ", Holder: "
			+ accountName
			+ ", Balance: $ "
			+ String.format("%.2f", getStartingBalance());
	}
}
