import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMSimulation extends JFrame implements ActionListener {
    JPasswordField pinField;
    JButton loginButton;
    JPanel panel;
    int balance = 10000;
    final String correctPin = "1234";

    public ATMSimulation() {
        setTitle("ATM Simulation");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Enter PIN:"));
        pinField = new JPasswordField(10);
        loginButton = new JButton("Login");
        add(pinField); add(loginButton);

        panel = new JPanel();
        add(panel);

        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String pin = new String(pinField.getPassword());
        if (pin.equals(correctPin)) {
            panel.removeAll();
            JButton check = new JButton("Check Balance");
            JButton deposit = new JButton("Deposit 1000");
            JButton withdraw = new JButton("Withdraw 1000");

            panel.add(check); panel.add(deposit); panel.add(withdraw);
            panel.revalidate(); panel.repaint();

            check.addActionListener(a -> JOptionPane.showMessageDialog(this, "Balance: " + balance));
            deposit.addActionListener(a -> { balance += 1000; JOptionPane.showMessageDialog(this, "Deposited! New Balance: " + balance); });
            withdraw.addActionListener(a -> { balance -= 1000; JOptionPane.showMessageDialog(this, "Withdrawn! New Balance: " + balance); });
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect PIN!");
        }
    }

    public static void main(String[] args) {
        new ATMSimulation().setVisible(true);
    }
}