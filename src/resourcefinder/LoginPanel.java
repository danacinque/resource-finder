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
    JButton loginButton;
    JTextField input;
    JLabel info;
    
    public LoginPanel()
    {
        super();
        
        setLayout(null);
        setBounds(0, 0, 800, 400);
        
        info = new JLabel("<html><font size=+2>Administrator Login</font></html>",
                JLabel.CENTER);
        info.setBounds(300, 100, 200, 100);
        add(info);
        
        input = new JTextField();
        input.setBounds(300, 200, 200, 25);
        add(input);
        
        loginButton = new JButton();
        loginButton.setBounds(300, 250, 200, 25);
        loginButton.setText("Log In");
        add(loginButton);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        if (o == loginButton)
        {
            
        }
    }
}
