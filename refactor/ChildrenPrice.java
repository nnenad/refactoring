
/**
 * Write a description of class ChildrenPrice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChildrenPrice extends Price
{
     int getPriceCode(){
         return Movie.CHILDRENS;
     }
     
     double getCharge(int daysRented){
          double result = 1.2;
            if(daysRented > 3){
                result += (daysRented-3) * 1.5;
            }   
          return result;  
            
     }
}
