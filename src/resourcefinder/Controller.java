package resourcefinder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Controller
{
    /*
    I don't think I fully grasp the controller aspect of MVC, so this class
    doesn't do much. Most of the interaction logic between the database and the
    GUI is in the actionPerformed(), ItemStateChanged() etc. parts of the GUI
    panels. Any guidance on how to separate this logic would be appreciated.
    */
    
    Database db; // model
    View view; // the frame that holds the panels
    
    User currentUser;
    Search currentSearch;

    public Controller()
    {
        db = new Database();
        
        view = new View(db);
        
        /*// Command-line version for testing the back end
        System.out.println("Welcome to the resource finder!");
        Scanner in = new Scanner(System.in);
        
        ArrayList<Tag> searchCriteria = new ArrayList();
        System.out.println("Enter tags to search for, -1 when done: ");
        String input = in.next();
        while (!input.equals("-1"))
        {
            Tag t = new Tag(input);
            searchCriteria.add(t);
            input = in.next();
        }
        Search search = new Search(searchCriteria);
        System.out.println(search.getResults());*/
        
        
    }

}
