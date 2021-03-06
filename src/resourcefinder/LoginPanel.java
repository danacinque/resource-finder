package resourcefinder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class LoginPanel extends JPanel implements ActionListener
{
    JButton adminLogin;
    JTextField adminPasswordField;
    JLabel adminInfo;
    
    JButton studentLogin;
    JButton studentCreateAccount;
    JTextField studentUsernameField;
    JLabel studentInfo;
    
    
    
    View theView;
    
    public LoginPanel(View theView)
    {
        super();
        
        this.theView = theView;
        
        setLayout(null);
        setBounds(0, 0, 800, 400);
        
        JLabel welcome = new JLabel("<html><font size=+2>Welcome to "
                + "ResourceFinder!</font></html>");
        welcome.setBounds(220, 25, 400, 100);
        add(welcome);
        
        // Admin login items
        adminInfo = new JLabel("<html><font size=+2>Administrator Login</font></html>",
                JLabel.CENTER);
        adminInfo.setBounds(60, 100, 300, 100);
        add(adminInfo);
        
        adminPasswordField = new JTextField("Enter Password");
        adminPasswordField.setBounds(100, 200, 200, 25);
        add(adminPasswordField);
        adminPasswordField.addActionListener(this);
        
        adminLogin = new JButton();
        adminLogin.setBounds(100, 250, 200, 25);
        adminLogin.setText("Log In");
        add(adminLogin);
        adminLogin.addActionListener(this);
        
        // Student login items
        studentInfo = new JLabel("<html><font size=+2>Student Login</font></html>",
                JLabel.CENTER);
        studentInfo.setBounds(500, 100, 200, 100);
        add(studentInfo);
        
        studentUsernameField = new JTextField("Enter Username");
        studentUsernameField.setBounds(500, 200, 200, 25);
        add(studentUsernameField);
        studentUsernameField.addActionListener(this);
        
        studentLogin = new JButton("Log In");
        studentLogin.setBounds(500, 250, 200, 25);
        add(studentLogin);
        studentLogin.addActionListener(this);
        
        studentCreateAccount = new JButton("Create Account");
        studentCreateAccount.setBounds(500, 280, 200, 25);
        add(studentCreateAccount);
        studentCreateAccount.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        if (o == adminLogin)
        {
            String password = adminPasswordField.getText();
            System.out.print("Admin password: " + password);
            
            if (password.equals("test"))
            {
                setVisible(false);
                theView.adminPanel.setVisible(true);
            }
        }
        if (o == studentLogin)
        {
            String username = studentUsernameField.getText();
            System.out.print("Student username: " + username);
            setVisible(false);
            theView.searchPanel.setVisible(true);
        }
        if (o == studentCreateAccount)
        {
            studentInfo.setBounds(450, 100, 300, 100);
            studentInfo.setText("<html><font size=+2>Create New Account</font></html>");
            studentUsernameField.setText("Enter New Username");
            studentLogin.setText("Create Account");
            studentCreateAccount.setVisible(false);
        }
    }
}
