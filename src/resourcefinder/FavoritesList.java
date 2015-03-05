package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class FavoritesList 
{
    String name;
    ArrayList<Resource> favorites;
    
    public FavoritesList(String name)
    {
        this.name = name;
        favorites = new ArrayList();
    }
    
    public FavoritesList(String name, ArrayList<Resource> faves)
    {
        this.name = name;
        favorites = faves;
    }
    
    void add(Resource toAdd)
    {
        favorites.add(toAdd);
    }
    
    void delete(Resource toDelete)
    {
        favorites.remove(toDelete);
    }
    
    boolean contains(Resource toCheck)
    {
        boolean flag = false;
        if (favorites.contains(toCheck))
        {
            flag = true;
        }
        else
        {
            for (Resource r : favorites)
            {
                if (r.name.equals(toCheck.name))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }
    
}
