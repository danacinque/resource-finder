package resourcefinder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class View implements ActionListener
{
    JFrame frame;
    LoginPanel loginPanel;
    SearchPanel searchPanel;
    ResultsPanel resultsPanel;
    AdminPanel adminPanel;
    StudentPanel studentPanel;
    
    public View()
    {
        // Frame setup
        frame = new JFrame();
        frame.setTitle("Resource Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        
        // LoginPanel setup
        loginPanel = new LoginPanel(this);
        frame.add(loginPanel);
        loginPanel.setVisible(true);
        
        //AdminPanel setup
        adminPanel = new AdminPanel(this);
        frame.add(adminPanel);
        adminPanel.setVisible(false);
        
        // ResultsPanel setup
        resultsPanel = new ResultsPanel(this);
        frame.add(resultsPanel);
        resultsPanel.setVisible(false);

        // SearchPanel setup
        searchPanel = new SearchPanel(this);
        frame.add(searchPanel);
        searchPanel.setVisible(false);
        
        // StudentPanel setup
        studentPanel = new StudentPanel();
        frame.add(studentPanel);
        studentPanel.setVisible(false);
        
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        
    }
}
