class CheckingAccount extends BankAccount {
    private double interest;

    //inherit superclass
    public CheckingAccount(String firstName, String lastName, int accountID, double balance, double interest) {
        super(firstName, lastName, accountID, balance);
        this.interest = interest;
    }
    //withdraw w/ zero interest reset and overdraft fee
    public void processWithdrawal(double removeFunds) {
        withdraw(removeFunds);
        if (getBalance() < 0) {
            interest = -1 * 0.0;
            withdraw(30.00);
        }
    }

    //subclasses display with interest
    public String displayAccount() {
        return "Account ID: " + getAccountID() + "\n" +
               "First Name: " + getFirstName() + "\n" +
               "Last Name: " + getLastName() + "\n" +
               "Balance: " + getBalance() + "\n" +
               "Interest Accrued: " + interest * getBalance();
    }
}
