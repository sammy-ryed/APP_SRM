import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField field;
    String operator = "";
    double num1 = 0, num2 = 0;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        field = new JTextField();
        add(field, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        String buttons[] = {"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
        for (String text : buttons) {
            JButton b = new JButton(text);
            panel.add(b);
            b.addActionListener(this);
        }
        add(panel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if ("0123456789.".contains(cmd)) {
            field.setText(field.getText() + cmd);
        } else if ("+-*/".contains(cmd)) {
            num1 = Double.parseDouble(field.getText());
            operator = cmd;
            field.setText("");
        } else if ("=".equals(cmd)) {
            num2 = Double.parseDouble(field.getText());
            double result = 0;
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }
            field.setText("" + result);
        }
    }

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}