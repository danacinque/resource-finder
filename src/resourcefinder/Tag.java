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
    public Tag(String name)
    {
        this.name = name;
        numberOfSearches = 0;
    }
    
    void updateSearches()
    {
        numberOfSearches++;
    }
    
    void printInfo()
    {
        System.out.println(name + ": " + numberOfSearches);
    }
    
}
