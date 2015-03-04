package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Model 
{
    public Model()
    {
        ArrayList<Resource> resources;
        
        Resource coursera = new Resource();
        coursera.name = "Coursera";
        coursera.description = "Coursera offers structured courses in a variety of subjects.";
        coursera.link = "www.coursera.org";
        coursera.tags = new TagCollection();
    }
}
