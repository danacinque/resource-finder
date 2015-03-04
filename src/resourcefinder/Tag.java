package resourcefinder;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Tag 
{
    String name;
    int numberOfSearches;
    
    // Constructor
    public Tag()
    {
        name = "";
        numberOfSearches = 0;
    }
    
    void updateSearches()
    {
        numberOfSearches++;
    }
    
    
}
