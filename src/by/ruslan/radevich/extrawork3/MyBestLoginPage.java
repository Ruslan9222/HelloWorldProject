package by.ruslan.radevich.extrawork3;

import by.ruslan.radevich.lessons11.WrongLoginException;
import by.ruslan.radevich.lessons11.WrongPasswordException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBestLoginPage extends JFrame {
    private JPanel panel;
    private JTextField loginField1;
    private JPasswordField passwordField;
    private JPasswordField confirmPassword;
    private JButton CreateNewAccount;

    public MyBestLoginPage() {
        CreateNewAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkCredentials(loginField1.getText(), passwordField.getText(), confirmPassword.getText());
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, "login and password are correct");
                } catch (WrongLoginException ex) {
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, ex.getMessage(), "Oops, something bad with login: ", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (WrongPasswordException ex) {
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, ex.getMessage(), "Oops, something bad with password: ", JOptionPane.QUESTION_MESSAGE);
                    ex.printStackTrace();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(MyBestLoginPage.this, ex.getMessage(), "Access denied! ", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }

            }
        });
    }

    public static void main(String[] args) {
        MyBestLoginPage form = new MyBestLoginPage();
        form.setTitle("MY APP");
        form.setContentPane(form.panel);
        form.setSize(275, 200);
        form.setResizable(false);
        form.setLocation(500, 300);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }

    private static boolean checkCredentials(String login, String password, String confirmPassword) throws Exception {
        String correctLogin = "super";
        String correctPassword = "puper";
        if (!password.equals(confirmPassword)) throw new WrongLoginException("Password is incorrect");
        if (login.length() < 3) throw new WrongLoginException("Login is too short");
        if (login.length() > 20) throw new WrongLoginException("Login is too Long");
        if (login.contains(" ")) throw new WrongLoginException("Login is incorrect");
        if (password.length() < 3) throw new WrongPasswordException("Password is to short");
        if (password.matches(".*\\d.*")) throw new WrongPasswordException("Login or password is incorrect");
        // это я загуглил, подскажи как по другому не используя регулярные выражения это написать
        if (password.contains(" ")) throw new WrongPasswordException("Login or password is incorrect");
        if (password.length() > 20) throw new WrongPasswordException("Password is to Long");
        if (login.equals(correctLogin) && password.equals(correctPassword)) return true;
        throw new Exception("Create new account is successful");
    }
}
