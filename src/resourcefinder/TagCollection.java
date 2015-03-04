package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class TagCollection 
{
    String name;
    ArrayList<Tag> tags;
    
    public TagCollection()
    {
        tags = new ArrayList();
    }
    
    void add(Tag toAdd)
    {
        tags.add(toAdd);
    }
    
    void delete(Tag toDelete)
    {
        tags.remove(toDelete);
    }
    
    void getInfo(Tag toGet)
    {
        toGet.printInfo();
    }
}
