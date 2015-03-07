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
    Database db;

    // Constructor
    public Search(ArrayList<Tag> criteria)
    {
        tags = criteria;
        db = new Database();
        results = new ArrayList();
        
        // SEARCH LOGIC
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
    // The search logic made more sense in the constructor,
    // since the instance of Search is created when the Search
    // button is clicked, so this is redundant
    ArrayList<Resource> search(ArrayList<Tag> criteria)
    {
        

        return results;
    }

    // Added from initial design
    // Gets info for all results and puts it into one string
    // (used at the command line for debugging right now)
    String getResults()
    {
        String resultString = "";

        for (Resource r : results)
        {
            resultString += r.name + ": " + r.description + "\n"
                    + "Link: " + r.link + "\n" + r.tags.getInfo() + "\n\n";
        }

        return resultString;
    }
    
    // Get info for an individual result
    // Used for display purposes
    String getResults(Resource result)
    {
        // TODO: return matching tags only
        return result.name + ": " + result.description + "\n" + "Link: " 
                    + result.link + "\n" + result.tags.getInfo() + "\n\n";
    }
}
