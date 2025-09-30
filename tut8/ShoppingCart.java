import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShoppingCart extends JFrame implements ActionListener {
    JCheckBox laptop, phone, headphones;
    JButton billButton;
    JTextArea output;

    public ShoppingCart() {
        setTitle("Shopping Cart Simulation");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        laptop = new JCheckBox("Laptop - 50000");
        phone = new JCheckBox("Phone - 20000");
        headphones = new JCheckBox("Headphones - 2000");
        billButton = new JButton("Generate Bill");
        output = new JTextArea(5, 20);
        output.setEditable(false);

        add(laptop); add(phone); add(headphones);
        add(billButton); add(new JScrollPane(output));

        billButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int total = 0;
        StringBuilder sb = new StringBuilder("Selected Items:\n");
        if (laptop.isSelected()) { sb.append("Laptop\n"); total += 50000; }
        if (phone.isSelected()) { sb.append("Phone\n"); total += 20000; }
        if (headphones.isSelected()) { sb.append("Headphones\n"); total += 2000; }
        sb.append("Total: Rs. ").append(total);
        output.setText(sb.toString());
    }

    public static void main(String[] args) {
        new ShoppingCart().setVisible(true);
    }
}