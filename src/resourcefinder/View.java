package resourcefinder;

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
    
    
    public View()
    {
        // Frame setup
        frame = new JFrame();
        frame.setTitle("Resource Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        
        // LoginPanel setup
        // WILL NOT BE IMPLEMENTED IN ROUND 1
        loginPanel = new LoginPanel();
        
        // ResultsPanel setup
        resultsPanel = new ResultsPanel();
        frame.add(resultsPanel);

        // SearchPanel setup
        searchPanel = new SearchPanel();
        frame.add(searchPanel);
        
        
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
