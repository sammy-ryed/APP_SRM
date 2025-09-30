import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class EmployeeManagement extends JFrame implements ActionListener {
    JTextField nameField, deptField, salaryField;
    JButton submitButton;
    JTable table;
    DefaultTableModel model;

    public EmployeeManagement() {
        setTitle("Employee Management");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        nameField = new JTextField(10);
        add(nameField);

        add(new JLabel("Department:"));
        deptField = new JTextField(10);
        add(deptField);

        add(new JLabel("Salary:"));
        salaryField = new JTextField(10);
        add(salaryField);

        submitButton = new JButton("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        model = new DefaultTableModel(new String[]{"Name", "Department", "Salary"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table));
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String dept = deptField.getText();
        String salary = salaryField.getText();
        model.addRow(new Object[]{name, dept, salary});
    }

    public static void main(String[] args) {
        new EmployeeManagement().setVisible(true);
    }
}