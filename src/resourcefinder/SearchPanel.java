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
public class SearchPanel extends JPanel implements ItemListener, ActionListener
{
    
    JCheckBox free, subscription, oneTimePayment;
    JButton computerScience, biology, physics, search;
    Search searchInProgress;
    ArrayList<Tag> criteria;
    
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
        computerScience = new JButton("Computer Science");
        computerScience.setBounds(500, 200, 150, 35);
        computerScience.addActionListener(this);
        add(computerScience);
        
        biology = new JButton("Biology");
        biology.setBounds(500, 250, 150, 35);
        biology.addActionListener(this);
        add(biology);
        
        free = new JCheckBox("Free");
        free.addItemListener(this);
        subscription = new JCheckBox("Subscription");
        subscription.addItemListener(this);
        oneTimePayment = new JCheckBox("One-time Payment");
        oneTimePayment.addItemListener(this);
        
        search = new JButton("Search");
        search.setBounds(800, 450, 100, 100);
        search.addActionListener(this);
        add(search);
        
        JPanel paymentPanel = new JPanel(new GridLayout(0, 1));
        paymentPanel.setBounds(200, 200, 200, 100);
        paymentPanel.add(free);
        paymentPanel.add(subscription);
        paymentPanel.add(oneTimePayment);
        add(paymentPanel);
        
        repaint();
                
        criteria = new ArrayList();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if (o == search)
        {
            searchInProgress = new Search(criteria);
            System.out.println(searchInProgress.getResults());
            //searchInProgress.search(criteria);
        }
        else if (o instanceof javax.swing.JButton)
        {
            JButton temp = (JButton) o;
            Tag criterion = new Tag(temp.getText());
            criteria.add(criterion);
            System.out.println("Added tag: " + criterion.name);
        }
        
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object source = e.getItemSelectable();
        
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            if (source instanceof javax.swing.JCheckBox)
            {
                JCheckBox temp = (JCheckBox) source;
                Tag criterion = new Tag(temp.getText());
                criteria.add(criterion);
                System.out.println("Added tag: " + criterion.name);
            }
        }
        else if (e.getStateChange() == ItemEvent.DESELECTED)
        {
            if (source instanceof javax.swing.JCheckBox)
            {
                JCheckBox temp = (JCheckBox) source;
                Tag criterion = new Tag(temp.getText());
                int index = 0;
                // Search the criteria for the one that just got deselected
                for (Tag t : criteria)
                {
                    if (t.name.equals(temp.getText()))
                    {
                        index = criteria.indexOf(t);
                    }
                }
                // Remove the criterion at the index we just determined
                System.out.println("Removed tag: " + criteria.get(index).name);
                criteria.remove(index);
                        
            }
        }
    }
}
