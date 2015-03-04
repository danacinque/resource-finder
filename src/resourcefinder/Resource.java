package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Resource 
{
    String name;
    String description;
    String link;
    TagCollection tags;
    int numberOfSearches = 0;
    int numberOfFavorites = 0;
    
    public Resource()
    {
        name = "";
        description = "";
        link = "";
        tags = new TagCollection();
    }
    
    void updateSearches()
    {
        numberOfSearches++;
    }
    
    void updateFavorites()
    {
        numberOfFavorites++;
    }
    
}
