package resourcefinder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class StudentPanel extends JPanel
{
    JLabel title;
            
    public StudentPanel()
    {
        super();
        setLayout(null);
        setBounds(0, 0, 800, 400);
        
        title = new JLabel("My Account");
        title.setBounds(50, 50, 100, 25);
        add(title);
    }
    
    public void refreshStats()
    {
        
    }
}
