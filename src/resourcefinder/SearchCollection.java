package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class SearchCollection 
{
    ArrayList<Search> searches;
    
    // Constructor
    public SearchCollection()
    {
        searches = new ArrayList();
    }
    
    void add(Search toAdd)
    {
        searches.add(toAdd);
    }
    
    void delete(Search toDelete)
    {
        searches.remove(toDelete);
    }
    
}
