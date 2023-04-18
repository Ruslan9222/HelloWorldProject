package by.ruslan.radevich.extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JLabel label;
    private JPanel panel;
    private JButton backToMenuButton;
    private LoginForm loginForm;

    public HelloForm(LoginForm loginForm,String text){
        this.setTitle("THIS IS MY APP");
        this.setContentPane(this.panel);
        this.setSize(275, 200);
        this.setResizable(false);
        this.setLocation(500,300);
        this.label.setText(text);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.loginForm = loginForm;

        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloForm.super.setVisible(false);
                loginForm.setVisible(true);
            }
        });
    }
}
