
/**
 * Abstract class Price - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Price
{
   abstract int getPriceCode();
   
   abstract double getCharge(int daysRented);
    
     public int getFrequentPoints(int daysRented){
            //add bonus for two day new release rental check for subcalases implementation
           return 1;
    }
}
