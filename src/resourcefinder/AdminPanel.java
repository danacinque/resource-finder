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
    
    JLabel mostSearchedTagLabel, mostSearchedResourceLabel, mostFavoritedResourceLabel;
    
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
        
        JLabel a3 = new JLabel("Most searched resource:");
        a3.setBounds(575, 75, 200, 25);
        add(a3);
        
        mostSearchedResourceLabel = new JLabel("Something");
        mostSearchedResourceLabel.setBounds(600, 100, 200, 25);
        add(mostSearchedResourceLabel);
        
        JLabel a4 = new JLabel("Most favorited resource:");
        a4.setBounds(575, 125, 200, 25);
        add(a4);
        
        mostFavoritedResourceLabel = new JLabel("Something else");
        mostFavoritedResourceLabel.setBounds(600, 150, 200, 25);
        add(mostFavoritedResourceLabel);
        
        JLabel a2 = new JLabel("Most searched tag:");
        a2.setBounds(575, 175, 200, 25);
        add(a2);
        
        mostSearchedTagLabel = new JLabel("Something else else");
        mostSearchedTagLabel.setBounds(600, 200, 200, 25);
        add(mostSearchedTagLabel);
        
        
        
        
        JTextField s1 = new JTextField();
        s1.setBounds(310, 75, 200, 25);
        add(s1);
        JButton s2 = new JButton("Delete Resource");
        s2.setBounds(310, 100, 200, 25);
        add(s2);
        
        JTextField s3 = new JTextField();
        s3.setBounds(25, 75, 200, 25);
        add(s3);
        JButton s4 = new JButton("Delete Student");
        s4.setBounds(25, 100, 200, 25);
        add(s4);
        
        refreshStats();
    }
    
    public void refreshStats()
    {
        Resource mostSearchedResource = theView.db.resourceDB.get(0);
        Resource mostFavoritedResource = theView.db.resourceDB.get(0);
        Tag mostSearchedTag = theView.db.tagDB.get(0);
        
        // Find the resources with the highest stats
        for (Resource r : theView.db.resourceDB)
        {
            if (r.numberOfSearches > mostSearchedResource.numberOfSearches)
            {
                mostSearchedResource = r;
            }
            if (r.numberOfFavorites > mostFavoritedResource.numberOfFavorites)
            {
                mostFavoritedResource = r;
            }
        }
        
        for (Tag t : theView.db.tagDB.tags)
        {
            if (t.numberOfSearches > mostSearchedTag.numberOfSearches)
            {
                mostSearchedTag = t;
            }
        }
        
        mostSearchedResourceLabel.setText(mostSearchedResource.name);
        mostFavoritedResourceLabel.setText(mostFavoritedResource.name);
        mostSearchedTagLabel.setText(mostSearchedTag.name);
        
        
    }
}
