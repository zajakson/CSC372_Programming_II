class BankAccount {
    //declare variables
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    //constructor
    public BankAccount(String firstName, String lastName, int accountID, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = balance;
    }
    //getters & setters 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void zeroBalance() {
        this.balance = 0;
    }

    public void deposit(double addFunds) {
        this.balance += addFunds;
    }

    public void withdraw(double removeFunds) {
        this.balance -= removeFunds;
    }

    //superclass display
    public String getSummary() {
        return "Account ID: " + getAccountID() + "\n" +
               "First Name: " + getFirstName() + "\n" +
               "Last Name: " + getLastName() + "\n" +
               "Balance: " + getBalance();
    }
}

