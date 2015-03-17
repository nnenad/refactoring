
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
    
        
    public double getCharge(){
        double  result = 0;
        
        switch(getMovi().getPriceCode()){
            
                case Movie.CHILDRENS:
                    result += 1.5;
                    if(getDaysRented() > 3){
                        result += (getDaysRented()-3) * 1.5;
                    }
                break;
                case Movie.REGULAR:
                    result += 2;
                    if(getDaysRented() > 2){
                        result += (getDaysRented() - 2)* 1.5;
                    }
                break;
                
                case Movie.NEW_RELEASE:
                    result += getDaysRented() * 3;
                break;  
        }
        
        return result;
    }
    
    
       
    public int getFrequentPoints(){
            //add bonus for two day new release rental
            if(getMovi().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1){
                 return 2;
            }else
                return 1;
    }
}
