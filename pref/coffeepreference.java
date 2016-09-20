
/**
 * Write a description of class coffeepreference here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coffeepreference
{
    // instance variables - replace the example below with your own
    private int numSugar;
    private int numCreamer;

    /**
     * Constructor for objects of class coffeepreference
     */
    public coffeepreference(int sugar, int creamer)
    {
        // initialise instance variables
        numSugar= sugar;
        numCreamer= creamer;
    }

    /** this prints out user's preference
     *  the parameter is the int values input
     * system.out.println( "Number of Days" + numDays"
     */
    public void showPreference()
    {
        // put your code here
        System.out.println( "Number of Sugar" + numSugar);
        System.out.println( "Number of Creamer" + numCreamer);
    }
}
