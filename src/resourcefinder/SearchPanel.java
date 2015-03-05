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
    
    JCheckBox free, subscription, oneTimePayment;
    Search searchInProgress;
    
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
        JButton compSci = new JButton("Computer Science");
        compSci.setBounds(500, 200, 150, 35);
        compSci.addActionListener(this);
        add(compSci);
        
        free = new JCheckBox("Free");
        free.addItemListener(this);
        subscription = new JCheckBox("Subscription");
        subscription.addItemListener(this);
        oneTimePayment = new JCheckBox("One-time Payment");
        oneTimePayment.addItemListener(this);
        
        JPanel paymentPanel = new JPanel(new GridLayout(0, 1));
        paymentPanel.setBounds(200, 200, 200, 100);
        paymentPanel.add(free);
        paymentPanel.add(subscription);
        paymentPanel.add(oneTimePayment);
        add(paymentPanel);
        
        repaint();
                
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getItemSelectable();
        
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            
        }
    }
}
