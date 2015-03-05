package resourcefinder;

import java.util.ArrayList;

/**
 * When an instance of Search is created, the database is scanned for resources
 * with tags that match those in the criteria; a list of results is then
 * generated and returned.
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Search
{

    ArrayList<Tag> tags;
    ArrayList<Resource> results;
    Database db = new Database();

    // Constructor
    public Search(ArrayList<Tag> criteria)
    {
        tags = criteria;
        
        /*for (Resource r : db.resourceDB)
        {
            for (Tag t : r.tags.tags)
            {
                for (Tag tag : criteria)
                {
                    if (t.name.equals(tag.name))
                    {
                        results.add(r);
                    }
                }
            }
        }*/
        
        for (Tag t : criteria)
        {
        for (Resource r : db.resourceDB)
        {
            if (r.tags.contains(t))
            {
                results.add(r);
            }
        }
        }
    }

    ArrayList<Resource> search(ArrayList<Tag> criteria)
    {
        

        return results;
    }

    String getResults()
    {
        String resultString = "";

        for (Resource r : results)
        {
            resultString += r.name + ": " + r.description + "\n"
                    + "Link: " + r.link + "\n\n";
        }

        return resultString;
    }
}
