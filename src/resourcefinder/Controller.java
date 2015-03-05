package resourcefinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Controller implements ActionListener
{
    
    Database db; // model
    View view;
    
    User currentUser;
    Search currentSearch;

    public Controller()
    {
        db = new Database();
        
        view = new View();
        
        /*// TEMPORARY: let's get this back-end shit working
        System.out.println("Welcome to the thing!");
        Scanner in = new Scanner(System.in);
        
        ArrayList<Tag> searchCriteria = new ArrayList();
        System.out.println("Enter a tag to search for, -1 when done: ");
        String input = in.next();
        while (!input.equals("-1"))
        {
            Tag t = new Tag(input);
            searchCriteria.add(t);
            input = in.next();
        }
        Search search = new Search(searchCriteria);
        System.out.println(search.getResults());*/
        
        
        if (!view.searchPanel.isVisible())
        {
            view.resultsPanel.setVisible(true);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        /* 
            if (e == User in loginPanel)
                currentUser.assign(selected);
        */
        
        
    }

}
