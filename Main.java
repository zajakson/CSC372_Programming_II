public class Main {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("Ike", "Jones", 1232, 1000.00);

        System.out.println("\nInitial Balance: " + accountOne.getBalance());

        accountOne.zeroBalance();
        System.out.println("Balance Zeroed: " + accountOne.getBalance());

        double userAmount = 400;
        accountOne.deposit(userAmount);
        System.out.println("\nDeposit amount: " + userAmount);
        System.out.println(accountOne.getSummary());

        userAmount = 100.00;
        accountOne.withdraw(userAmount);
        System.out.println("\nWithdrawal amount: " + userAmount);
        System.out.println(accountOne.getSummary());

        userAmount = 300;
        CheckingAccount subAccount = new CheckingAccount("Ike", "Jones", 1232, userAmount, 0.02);

        userAmount = 4200.00;
        subAccount.deposit(userAmount);
        System.out.println("\nDeposit amount (subclass): " + userAmount);
        System.out.println(subAccount.displayAccount());

        userAmount = 10000.00;
        subAccount.processWithdrawal(userAmount);
        System.out.println("\nWithdrawal amount (subclass): " + userAmount);
        System.out.println(subAccount.displayAccount());
    }
}
