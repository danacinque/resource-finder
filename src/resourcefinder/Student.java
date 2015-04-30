package resourcefinder;

/**
 *
 * @author Dana Cinque <dcinque@psu.edu>
 */
public class Student 
{
    String name;
    SearchCollection searchHistory;
    FavoritesList favorites;
    
    public Student()
    {
        name = "";
        searchHistory = new SearchCollection();
        favorites = new FavoritesList(name);
    }
    
    // Overloaded constructor
    public Student(String name, SearchCollection history, FavoritesList faves)
    {
        this.name = name;
        searchHistory = history;
        favorites = faves;
    }
    
    void search()
    {
        // This may be redundant if I decide to keep the bulk of the 
        // search logic elsewhere
    }
    
    void add()
    {
        
    }
    
    void delete()
    {
        
    }
}
