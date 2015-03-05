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
    
    String getInfo()
    {
        String info = "Tags: ";
        
        for (Tag t : tags)
        {
            info += (t + ", ");
        }
        
        return info;
    }
    
    boolean contains(Tag tag)
    {
        boolean result = false;
        for (Tag t : tags)
        {
            if (tag.name.equals(t.name))
            {
                result = true;
            }
        }
        return result;
    }
}
