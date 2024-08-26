import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankBalanceApp extends JFrame {

    private BankAccount account;
    private JTextField depositField;
    private JTextField withdrawField;
    private JLabel balanceLabel;
    
    public BankBalanceApp() {
        // Set up the BankAccount
        account = new BankAccount("Ike", "Jones", 1232, 1000.00);


        // Set up the JFrame
        setTitle("Bank Balance Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Balance Label
        balanceLabel = new JLabel("Balance: $" + account.getBalance() + "   Account#: " + account.getAccountID());
        panel.add(balanceLabel);

        // Deposit Section
        panel.add(new JLabel("Deposit Amount:"));
        depositField = new JTextField(10);
        panel.add(depositField);
        JButton depositButton = new JButton("Deposit");
        depositButton.addActionListener(new DepositActionListener());
        panel.add(depositButton);

        // Withdraw Section
        panel.add(new JLabel("Withdraw Amount:"));
        withdrawField = new JTextField(10);
        panel.add(withdrawField);
        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new WithdrawActionListener());
        panel.add(withdrawButton);

        // Add panel to JFrame
        add(panel);
        setVisible(true);
    }

    // ActionListener for Deposit Button
    private class DepositActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double amount = Double.parseDouble(depositField.getText());
            account.deposit(amount);
            balanceLabel.setText("Balance: $" + account.getBalance() + "   Account#: " + account.getAccountID());
        }
    }

    // ActionListener for Withdraw Button
    private class WithdrawActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double amount = Double.parseDouble(withdrawField.getText());
            account.withdraw(amount);
            balanceLabel.setText("Balance: $" + account.getBalance() + "   Account#: " + account.getAccountID());
        }
    }

    public static void main(String[] args) {
        new BankBalanceApp();
    }
}
