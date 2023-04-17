package by.ruslan.radevich.extrawork;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example extends JFrame {
    private JButton okButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel panel;

    public Example() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(okButton, "Hello, " + textField1.getText());
                System.out.println("someone clicked");
            }
        });
    }

    public static void main(String[] args) {
        Example form = new Example();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.panel);
        form.setSize(300, 200);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);

    }
}
