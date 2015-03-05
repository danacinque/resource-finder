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
    
    JCheckBox course, practice, reference, selfPaced, scheduled, 
            free, subscription, oneTimePayment, feedbackAvailable, creditAvailable,
            computerScience, biology, physics, mathematics;
    JButton search;
    Search searchInProgress;
    ArrayList<Tag> criteria;
    
    View view;
    
    public SearchPanel(View theView)
    {
        super();
        
        view = theView;
        
        setLayout(null);
        setBounds(0, 0, 800, 400);
        
        // TEXT: THE BASICS
        JLabel title = new JLabel("<html><font size=+2>Search</font></html>",
                                    JLabel.CENTER);
        title.setBounds(30, 30, 150, 50);
        title.setBorder(BorderFactory.createLineBorder(Color.black));
        add(title);
        
        /*
            CONTENT TYPE OPTIONS
        */
        course = new JCheckBox("Course");
        course.addItemListener(this);
        practice = new JCheckBox("Practice");
        practice.addItemListener(this);
        reference = new JCheckBox("Reference");
        reference.addItemListener(this);
        
        JPanel contentTypePanel = new JPanel(new GridLayout(0, 1));
        contentTypePanel.setBounds(30, 100, 200, 100);
        contentTypePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        contentTypePanel.add(course);
        contentTypePanel.add(practice);
        contentTypePanel.add(reference);
        add(contentTypePanel);
        
        /*
            TIMING OPTIONS
        */
        selfPaced = new JCheckBox("Self-Paced");
        selfPaced.addItemListener(this);
        scheduled = new JCheckBox("Scheduled");
        scheduled.addItemListener(this);
        
        JPanel timingPanel = new JPanel(new GridLayout(0, 1));
        timingPanel.setBounds(250, 100, 200, 100);
        timingPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        timingPanel.add(selfPaced);
        timingPanel.add(scheduled);
        add(timingPanel);
        
        /*
            PAYMENT OPTIONS
        */
        free = new JCheckBox("Free");
        free.addItemListener(this);
        subscription = new JCheckBox("Subscription");
        subscription.addItemListener(this);
        oneTimePayment = new JCheckBox("One-time Payment");
        oneTimePayment.addItemListener(this);
        
        JPanel paymentPanel = new JPanel(new GridLayout(0, 1));
        paymentPanel.setBounds(470, 100, 200, 100);
        paymentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        paymentPanel.add(free);
        paymentPanel.add(subscription);
        paymentPanel.add(oneTimePayment);
        add(paymentPanel);
        
        /*
            OTHER OPTIONS
        */
        feedbackAvailable = new JCheckBox("Feedback Available");
        feedbackAvailable.addItemListener(this);
        creditAvailable = new JCheckBox("Credit/Certificate Available");
        creditAvailable.addItemListener(this);
        
        JPanel otherOptionsPanel = new JPanel(new GridLayout(0, 1));
        otherOptionsPanel.setBounds(30, 220, 250, 100);
        otherOptionsPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        otherOptionsPanel.add(feedbackAvailable);
        otherOptionsPanel.add(creditAvailable);
        add(otherOptionsPanel);
        
        
        /*
            SUBJECT MATERIAL OPTIONS
        */
        computerScience = new JCheckBox("Computer Science");
        computerScience.addItemListener(this);
        biology = new JCheckBox("Biology");
        biology.addItemListener(this);
        physics = new JCheckBox("Physics");
        physics.addItemListener(this);
        mathematics = new JCheckBox("Mathematics");
        mathematics.addItemListener(this);
        
        JPanel subjectMaterialPanel = new JPanel(new GridLayout(0, 1));
        subjectMaterialPanel.setBounds(300, 220, 250, 100);
        subjectMaterialPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        subjectMaterialPanel.add(computerScience);
        subjectMaterialPanel.add(biology);
        subjectMaterialPanel.add(physics);
        subjectMaterialPanel.add(mathematics);
        add(subjectMaterialPanel);
        
        /*
            SEARCH BUTTON
        */
        search = new JButton("Search");
        search.setBounds(570, 240, 100, 60);
        search.addActionListener(this);
        add(search);
        
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
            this.setVisible(false);
            view.resultsPanel.setVisible(true);
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
