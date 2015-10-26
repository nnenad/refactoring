
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String _title;
    private Price _price;
    
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title, int priceCode)
    {
        // initialise instance variables
       this._title = title;
       setPriceCode(priceCode);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getTile(){
        return _title;
    }
    
    public int getPriceCode(){
        return _price.getPriceCode();
    }
    
    public void setPriceCode(int arg){
        switch(arg){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorect Price Code");
        }
    }
    
     public double getCharge(int daysRented){
         return _price.getCharge(daysRented);
    }
    
     public int getFrequentPoints(int daysRented){
            
            return _price.getFrequentPoints(daysRented);
           
    }
}
