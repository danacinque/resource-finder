package resourcefinder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class SearchPanel extends JPanel implements ItemListener, ActionListener
{
    
    JCheckBox free;
    JCheckBox subscription;
    JCheckBox oneTime;
    
    public SearchPanel()
    {
        super();
        
        setLayout(null);
        setBounds(1000, 800, 0, 0);
        
        // TEXT: THE BASICS
        JLabel basics = new JLabel("<html><font size=+2>The Basics</font></html>",
                                    JLabel.CENTER);
        basics.setBounds(30, 30, 150, 50);
        basics.setBorder(BorderFactory.createLineBorder(Color.black));
        add(basics);
        
        // Fuck it
        JButton compSci = new JButton("<html><font size=-1>Computer Science</font></html>");
        compSci.setBounds(500, 200, 150, 35);
        add(compSci);
        
        free = new JCheckBox("Free");
        subscription = new JCheckBox("Subscription");
        oneTime = new JCheckBox("One-time Payment");
        
        JPanel paymentPanel = new JPanel(new GridLayout(0, 1));
        paymentPanel.setBounds(200, 200, 200, 100);
        paymentPanel.add(free);
        paymentPanel.add(subscription);
        paymentPanel.add(oneTime);
        add(paymentPanel);
        
        repaint();
                
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getItemSelectable();
        
        // search(source, e);
    }
}
