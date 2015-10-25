
/**
 * Abstract class Price - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Price
{
   abstract int getPriceCode();
   
   double getCharge(int daysRented){
        double  result = 0;
        
        switch(getPriceCode()){
            
                case Movie.CHILDRENS:
                    result += 1.5;
                    if(daysRented > 3){
                        result += (daysRented-3) * 1.5;
                    }
                break;
                case Movie.REGULAR:
                    result += 2;
                    if(daysRented > 2){
                        result += (daysRented - 2)* 1.5;
                    }
                break;
                
                case Movie.NEW_RELEASE:
                    result += daysRented * 3;
                break;  
        }
        
        return result;
    }
}
