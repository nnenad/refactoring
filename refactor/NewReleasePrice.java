
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
     
     public int getFrequentPoints(int daysRented){
            //add bonus for two day new release rental
            if(daysRented > 1){
                 return 2;
            }else
                return 1;
    }
}
