package resourcefinder;

import java.awt.*;
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
/*
Notes:
ResultsPanel and SearchPanel weren't initially in the design. I didn't think
far enough ahead and realize that I was limited in where I could have my
search logic - unless there's another way, it has to be in the same class
as all of the buttons etc. because of how the listeners work.
I tried having the Controller get an instance of each panel in its constructor
and do the logic there, but it didn't work.
Let me know if there's anything I can do to organize this better.
*/
public class ResultsPanel extends JPanel implements ActionListener, ItemListener
{
    JPanel resultPane;
    JButton saveToFavorites;
    ArrayList<Resource> toFavorites;
    
    JLabel savedToFavorites;
    
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
        
        // This panel holds the results
        resultPane = new JPanel(new GridLayout(0, 1));
        resultPane.setBounds(30, 110, 740, 230);
        resultPane.setBorder(BorderFactory.createLineBorder(Color.black));
        add(resultPane);
        
        // Save to Favorites button
        saveToFavorites = new JButton("Save Selected Results to Favorites");
        saveToFavorites.setBounds(520, 30, 250, 50);
        saveToFavorites.addActionListener(this);
        add(saveToFavorites);
        
        // This text appears when favorites list is saved
        // TODO: have it fade out after a few seconds?
        // Change color to red?
        savedToFavorites = new JLabel("Saved to Favorites");
        savedToFavorites.setBounds(520, 82, 150, 30);
        add(savedToFavorites);
        savedToFavorites.setVisible(false);
        
        toFavorites = new ArrayList();
    }
    
    // Populates result pane from search
    public void populateResults(Search search)
    {
        for (Resource r : search.results)
        {
            JCheckBox temp = new JCheckBox(r.getInfo());
            temp.addItemListener(this);
            resultPane.add(temp);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if (o == saveToFavorites)
        {
            for (Resource r : toFavorites)
            {
                // This will be more complex once we have 
                // multiple users in round 2
                FavoritesList faves = new FavoritesList("Default User", toFavorites);
                savedToFavorites.setVisible(true);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        Object o = e.getItemSelectable();
        
        if (o instanceof JCheckBox)
        {
            JCheckBox temp = (JCheckBox) o;
            Resource resource = new Resource();
            resource.name = temp.getText();
            
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                toFavorites.add(resource);
            }
            else
            {
                int indexToRemove = 0;
                for (Resource r : toFavorites)
                {
                    if (r.name.equals(resource.name))
                    {
                        indexToRemove = toFavorites.indexOf(r);
                    }
                }
                // For debugging
                System.out.println("Removed " + toFavorites.get(indexToRemove).name
                                + " from favorites");
                toFavorites.remove(toFavorites.get(indexToRemove));
            }
        }
    }
    
}
