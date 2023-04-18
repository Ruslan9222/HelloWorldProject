package by.ruslan.radevich.extrawork2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JTextField textField1;
    private JButton loginButton;
    private JPanel panel;
    private HelloForm helloForm;

    public LoginForm() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text= textField1.getText();
                System.out.println(text);
                    LoginForm.super.setVisible(false);
                    helloForm = new HelloForm(LoginForm.this,getDoctorByPlan(text));

            }
        });
    }

    public static void main(String[] args) {
        LoginForm form = new LoginForm();
        form.setTitle("THIS IS MY APP");
        form.setContentPane(form.panel);
        form.setSize(275, 200);
        form.setResizable(false);
        form.setLocation(500,300);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);

    }

    private static String getDoctorByPlan(String plan){
        if (plan.equals("1")) return "you need to visit our Terapist";
        if (plan.equals("2")) return "you need to visit our Terapist";
        if (plan.equals("3")) return "you need to visit our Terapist";
        return "you need to go okylist, there is njt a corrent optin";

    }
}
