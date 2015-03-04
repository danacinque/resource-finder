package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Model 
{
    static ArrayList<Resource> resourceDB;
    static TagCollection tagDB;
    
    public Model()
    {
        resourceDB = new ArrayList();
        tagDB = new TagCollection();
        
        resourceDBSetup();
        tagDBSetup();
    }
    
    // NOTE TO SELF: FIGURE OUT HOW SERIALIZATION WORKS
    static public void resourceDBSetup()
    {
        Resource coursera = new Resource();
        coursera.name = "Coursera";
        coursera.description = "Coursera offers structured courses in a variety of subjects.";
        coursera.link = "www.coursera.org";
        coursera.tags = new TagCollection();
        
        resourceDB.add(coursera);
    }
    
    // NOTE TO SELF: FIGURE OUT HOW SERIALIZATION WORKS
    static public void tagDBSetup()
    {
        // Content type
        Tag course = new Tag("Course");
        Tag practice = new Tag("Practice");
        Tag reference = new Tag("Reference");
        
        // Timing
        Tag selfPaced = new Tag("Self-Paced");
        Tag scheduled = new Tag("Scheduled");
        
        // Cost
        Tag free = new Tag("Free");
        Tag oneTimePayment = new Tag("One-Time Payment");
        Tag subscription = new Tag("Subscription");
        
        // Misc.
        Tag feedbackAvailable = new Tag("Feedback Available");
        Tag creditAvailable = new Tag("Credit/Certificate Available");
        
        // Subject material
        Tag business = new Tag("Business/Management");
        Tag computerScience = new Tag("Computer Science");
        Tag naturalScience = new Tag("Natural Science");
        
    }
}
