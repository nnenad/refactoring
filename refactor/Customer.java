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
            thisAmount = amountFor(each);
            
            
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
    
    private double amountFor(Rental aRental){
        double  result = 0;
        
        switch(aRental.getMovi().getPriceCode()){
            
                case Movie.CHILDRENS:
                    result += 1.5;
                    if(aRental.getDaysRented() > 3){
                        result += (aRental.getDaysRented()-3) * 1.5;
                    }
                break;
                case Movie.REGULAR:
                    result += 2;
                    if(aRental.getDaysRented() > 2){
                        result += (aRental.getDaysRented() - 2)* 1.5;
                    }
                break;
                
                case Movie.NEW_RELEASE:
                    result += aRental.getDaysRented() * 3;
                break;  
        }
        
        return result;
    }
}
