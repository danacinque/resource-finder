package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class FavoritesList 
{
    String name;
    ArrayList<Resource> resources;
    
    // Constructor
    public FavoritesList(String name)
    {
        this.name = name;
        resources = new ArrayList();
    }
    
    // Overloaded constructor
    public FavoritesList(String name, ArrayList<Resource> faves)
    {
        this.name = name;
        resources = faves;
    }
    
    void add(Resource toAdd)
    {
        resources.add(toAdd);
    }
    
    void delete(Resource toDelete)
    {
        resources.remove(toDelete);
    }
    
    // Added
    boolean contains(Resource toCheck)
    {
        boolean containsResource = false;
        if (resources.contains(toCheck))
        {
            containsResource = true;
        }
        else
        {
            for (Resource r : resources)
            {
                if (r.name.equals(toCheck.name))
                {
                    containsResource = true;
                }
            }
        }
        return containsResource;
    }
    
}
