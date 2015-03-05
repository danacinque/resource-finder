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
    
    // TEMPORARY
    public void printInfo()
    {
        System.out.println(name + ": " + description);
        System.out.println("Link: " + link);
        System.out.println("Searches: " + numberOfSearches);
        System.out.println("Favorites: " + numberOfFavorites);
        System.out.println(tags.getInfo());
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
