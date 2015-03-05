package resourcefinder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class ResultsPanel extends JPanel implements ActionListener, ItemListener
{
    
    public ResultsPanel()
    {
        super();
        
        setLayout(null);
        setBounds(0, 0, 800, 400);
        
        JLabel title = new JLabel("<html><font size=+2>Results</font></html>",
                                    JLabel.CENTER);
        title.setBounds(30, 30, 150, 50);
        title.setBorder(BorderFactory.createLineBorder(Color.black));
        add(title);
        
        JScrollPane scroll = new JScrollPane(this);
        
        JPanel resultPane = new JPanel(new GridLayout(0, 2));
        resultPane.setBounds(30, 110, 740, 230);
        resultPane.setBorder(BorderFactory.createLineBorder(Color.black));
        add(resultPane);
    }
    
    public void populateResults(Search mostRecentSearch)
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
