
/**
 * Write a description of class Rental here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rental
{
    // instance variables - replace the example below with your own
    private Movie _movie;
    private int _daysRented;

    /**
     * Constructor for objects of class Rental
     */
    public Rental(Movie movie, int daysRented)
    {
        // initialise instance variables
       this._movie = movie;
       this._daysRented = daysRented;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDaysRented(){
        return this._daysRented;
    }
    
    public Movie getMovi(){
        return this._movie;
    }
}
