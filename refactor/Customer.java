import java.util.*;
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String _name;
    private Vector _rentals = new Vector();

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name)
    {
        // initialise instance variables
        this._name = name;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }
    
    public String getName(){
        return this._name;
    }
    
    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for "+ getName()+ "\n";
        while(rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental)rentals.nextElement();
            
            //determine amounts for each line
            switch(each.getMovi().getPriceCode()){
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if(each.getDaysRented() > 3){
                        thisAmount += (each.getDaysRented()-3) * 1.5;
                    }
                break;
                case Movie.REGULAR:
                    thisAmount += 2;
                    if(each.getDaysRented() > 2){
                        thisAmount += (each.getDaysRented() - 2)* 1.5;
                    }
                break;
                
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                break;
                
                default:
                
            }
            
            //add frequent renter points
            frequentRenterPoints++;
            
            //add bonus for two day new release rental
            if(each.getMovi().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1){
                 frequentRenterPoints++;
            }
            
            //show figures for this rental
            result += "\t" + each.getMovi().getTile()+ "\t"+String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
            
        }
        
        //Add footer lines
        
        result += "Amount owed is "+ String.valueOf(totalAmount) + "\n";
        result += "You earned "+ String.valueOf(frequentRenterPoints)+" frequent renter points";
        return result;
    }
}
