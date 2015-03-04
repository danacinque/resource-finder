package resourcefinder;

import java.util.ArrayList;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */

// This is the model
public class Database 
{
    static ArrayList<Resource> resourceDB;
    static TagCollection tagDB;
    
    static Tag course, practice, reference, selfPaced, scheduled, free, oneTimePayment,
            subscription, feedbackAvailable, creditAvailable, business,
            computerScience, naturalScience;
    static Resource coursera, codecademy, sciShow, khanAcademy;
    
    public Database()
    {
        resourceDB = new ArrayList();
        tagDB = new TagCollection();
        
        tagDBSetup();
        resourceDBSetup();
    }
    
    // NOTE TO SELF: FIGURE OUT HOW SERIALIZATION WORKS
    static public void resourceDBSetup()
    {
        /*
            COURSERA
        =============================================================
        */
        coursera = new Resource();
        coursera.name = "Coursera";
        coursera.description = "Coursera offers structured courses in"
                + " a variety of subjects.";
        coursera.link = "www.coursera.org";
        // If I can condense this somehow that would be A+
        coursera.tags.add(course);
        coursera.tags.add(scheduled);
        coursera.tags.add(free);
        coursera.tags.add(feedbackAvailable);
        coursera.tags.add(creditAvailable);
        coursera.tags.add(business);
        coursera.tags.add(computerScience);
        coursera.tags.add(naturalScience);
        
        resourceDB.add(coursera);
        
        /*
            CODECADEMY
        =============================================================
        */
        codecademy = new Resource();
        codecademy.name = "Codecademy";
        codecademy.description = "Codecademy teaches you how to code!";
        codecademy.link = "www.codecademy.com/";
        codecademy.tags.add(course);
        codecademy.tags.add(selfPaced);
        codecademy.tags.add(free);
        codecademy.tags.add(computerScience);
        
        /*
            SCISHOW
        =============================================================
        */
        sciShow = new Resource();
        sciShow.name = "SciShow";
        sciShow.description = "SciShow is a YouTube channel created by"
                + " Hank Green.";
        sciShow.link = "www.youtube.com/scishow";
        sciShow.tags.add(reference);
        sciShow.tags.add(selfPaced);
        sciShow.tags.add(free);
        sciShow.tags.add(naturalScience);
        
        /*
            KHAN ACADEMY
        =============================================================
        */
        khanAcademy = new Resource();
        khanAcademy.name = "Khan Academy";
        khanAcademy.description = "Khan Academy is awesome!";
        khanAcademy.link = "www.khanacademy.org";
        khanAcademy.tags.add(course);
        khanAcademy.tags.add(reference);
        khanAcademy.tags.add(selfPaced);
        khanAcademy.tags.add(free);
        khanAcademy.tags.add(computerScience);
        khanAcademy.tags.add(naturalScience);
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
