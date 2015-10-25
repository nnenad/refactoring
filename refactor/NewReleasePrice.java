
/**
 * Write a description of class NewReleasePrice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewReleasePrice extends Price
{
     int getPriceCode(){
         return Movie.NEW_RELEASE;
     }
     
     double getCharge(int daysRented){
          return  daysRented * 3;  
            
     }
}
