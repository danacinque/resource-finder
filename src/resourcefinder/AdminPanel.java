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
public class AdminPanel extends JPanel
{
    View theView;
    
    JButton test;
    
    public AdminPanel(View theView)
    {
        super();
        
        this.theView = theView;
        
        setLayout(null);
        setBounds(0, 0, 800, 400);
        
        JLabel studentEditor = new JLabel("Add and Delete Student Accounts");
        studentEditor.setBounds(25, 25, 250, 25);
        add(studentEditor);
        
        JLabel resourceEditor = new JLabel("Add and Delete Resources");
        resourceEditor.setBounds(315, 25, 200, 25);
        add(resourceEditor);
        
        JLabel analytics = new JLabel("Analytics");
        analytics.setBounds(625, 25, 200, 25);
        add(analytics);
        
        test = new JButton("Test");
        test.setBounds(100, 100, 100, 100);
        add(test);
    }
}
