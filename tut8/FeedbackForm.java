import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FeedbackForm extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4, r5;
    JTextArea comments;
    JButton submit;

    public FeedbackForm() {
        setTitle("Feedback Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Rate Service:"));
        ButtonGroup group = new ButtonGroup();
        r1 = new JRadioButton("1"); r2 = new JRadioButton("2");
        r3 = new JRadioButton("3"); r4 = new JRadioButton("4"); r5 = new JRadioButton("5");
        group.add(r1); group.add(r2); group.add(r3); group.add(r4); group.add(r5);
        add(r1); add(r2); add(r3); add(r4); add(r5);

        add(new JLabel("Comments:"));
        comments = new JTextArea(5, 20);
        add(new JScrollPane(comments));

        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Thank you for your feedback!");
    }

    public static void main(String[] args) {
        new FeedbackForm().setVisible(true);
    }
}