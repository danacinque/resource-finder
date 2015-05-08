package resourcefinder;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */

/*
Notes:
This is the model. I had originally intended to use serialized objects for this,
but it's proving trickier than I thought, so I will look into other alternatives.
*/
public class Database
{
    ArrayList<Resource> resourceDB;
    TagCollection tagDB;
    
    Resource coursera, codecademy, sciShow, khanAcademy,
            udacity, lynda, hourOfCode;
    
    FavoritesList favorites;
    
    
    public Database()
    {
        resourceDB = new ArrayList();
        tagDB = new TagCollection();
        
        tagDBSetup();
        resourceDBSetup();
        
        // This will be more complex when we expand into multiple
        // user roles in the second development cycle
        favorites = new FavoritesList("Default User");

    }
    
    public void resourceDBSetup()
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
        // Note to self: streamline this process
        coursera.tags.add(new Tag("Course"));
        coursera.tags.add(new Tag("Scheduled"));
        coursera.tags.add(new Tag("Free)"));
        coursera.tags.add(new Tag("Feedback Available"));
        coursera.tags.add(new Tag("Credit Available"));
        coursera.tags.add(new Tag("Computer Science"));
        coursera.tags.add(new Tag("Biology"));
        coursera.tags.add(new Tag("Physics"));
        coursera.tags.add(new Tag("Mathematics"));
        
        resourceDB.add(coursera);
        
        /*
            CODECADEMY
        =============================================================
        */
        codecademy = new Resource();
        codecademy.name = "Codecademy";
        codecademy.description = "Codecademy teaches you how to code!";
        codecademy.link = "www.codecademy.com/";
        codecademy.tags.add(new Tag("Course"));
        codecademy.tags.add(new Tag("Self-Paced"));
        codecademy.tags.add(new Tag("Free"));
        codecademy.tags.add(new Tag("Computer Science"));
        
        resourceDB.add(codecademy);
        
        /*
            SCISHOW
        =============================================================
        */
        sciShow = new Resource();
        sciShow.name = "SciShow";
        sciShow.description = "SciShow is a YouTube channel created by"
                + " Hank Green.";
        sciShow.link = "www.youtube.com/scishow";
        sciShow.tags.add(new Tag("Reference"));
        sciShow.tags.add(new Tag("Self-paced"));
        sciShow.tags.add(new Tag("Free"));
        sciShow.tags.add(new Tag("Biology"));
        sciShow.tags.add(new Tag("Physics"));
        
        resourceDB.add(sciShow);
        
        /*
            KHAN ACADEMY
        =============================================================
        */
        khanAcademy = new Resource();
        khanAcademy.name = "Khan Academy";
        khanAcademy.description = "Khan Academy is awesome!";
        khanAcademy.link = "www.khanacademy.org";
        khanAcademy.tags.add(new Tag("Course"));
        khanAcademy.tags.add(new Tag("Reference"));
        khanAcademy.tags.add(new Tag("Self-Paced"));
        khanAcademy.tags.add(new Tag("Free"));
        khanAcademy.tags.add(new Tag("Computer Science"));
        khanAcademy.tags.add(new Tag("Physics"));
        khanAcademy.tags.add(new Tag("Mathematics"));
        
        resourceDB.add(khanAcademy);
        
        /*
            UDACITY
        =============================================================
        */
        udacity = new Resource();
        udacity.name = "Udacity";
        udacity.description = "Udacity focuses on 'nanodegrees' that train "
                + "users in skills from web development to data analytics.";
        udacity.link = "www.udacity.com";
        udacity.tags.add(new Tag("Course"));
        udacity.tags.add(new Tag("Free"));
        udacity.tags.add(new Tag("Self-Paced"));
        udacity.tags.add(new Tag("Computer Science"));
        udacity.tags.add(new Tag("Credit/Certificate Available"));
        
        resourceDB.add(udacity);
        
        /*
            LYNDA
        =============================================================
        */
        lynda = new Resource();
        lynda.name = "Lynda";
        lynda.description = "Lynda is a subscription service offering "
                + "thousands of tutorial videos. It's free to PSU students!";
        lynda.link = "lynda.psu.edu";
        lynda.tags.add(new Tag("Subscription"));
        lynda.tags.add(new Tag("Reference"));
        lynda.tags.add(new Tag("Self-Paced"));
        lynda.tags.add(new Tag("Computer Science"));
        
        resourceDB.add(lynda);
        
        /*
            HOUR OF CODE
        =============================================================
        */
        hourOfCode = new Resource();
        hourOfCode.name = "Code.org (Hour of Code)";
        hourOfCode.description = "Code.org offers exercises that can be "
                + "completed in under an hour.";
        hourOfCode.link = "www.code.org";
        hourOfCode.tags.add(new Tag("Free"));
        hourOfCode.tags.add(new Tag("Practice"));
        hourOfCode.tags.add(new Tag("Self-Paced"));
        hourOfCode.tags.add(new Tag("Computer Science"));
        
        resourceDB.add(hourOfCode);
        
    }
    
    public void tagDBSetup()
    {
        /*
        This section right now is redundant because I have the tags
        being added manually to the sources. This will be smoothed out
        once I have the data storage worked out.
        */
        // Content type
        Tag course = new Tag("Course");
        tagDB.add(course);
        Tag practice = new Tag("Practice");
        tagDB.add(practice);
        Tag reference = new Tag("Reference");
        tagDB.add(reference);
        
        // Timing
        Tag selfPaced = new Tag("Self-Paced");
        tagDB.add(selfPaced);
        Tag scheduled = new Tag("Scheduled");
        tagDB.add(scheduled);
        
        // Cost
        Tag free = new Tag("Free");
        tagDB.add(free);
        Tag oneTimePayment = new Tag("One-Time Payment");
        tagDB.add(oneTimePayment);
        Tag subscription = new Tag("Subscription");
        tagDB.add(subscription);
        
        // Misc.
        Tag feedbackAvailable = new Tag("Feedback Available");
        tagDB.add(feedbackAvailable);
        Tag creditAvailable = new Tag("Credit/Certificate Available");
        tagDB.add(creditAvailable);
        
        // Subject material
        Tag computerScience = new Tag("Computer Science");
        tagDB.add(computerScience);
        Tag biology = new Tag("Biology");
        tagDB.add(biology);
        Tag physics = new Tag("Physics");
        tagDB.add(physics);
        Tag mathematics = new Tag("Mathematics");
        tagDB.add(mathematics);
        
        
    }
}
