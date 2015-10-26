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

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }
    
    public String getName(){
        return this._name;
    }
    
    public String statement(){
        
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for "+ getName()+ "\n";
        while(rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();
             
            //show figures for this rental
            result += "\t" + each.getMovi().getTile()+ "\t"+String.valueOf(each.getMovi().getCharge(each.getDaysRented())) + "\n";    
        }
        
        //Add footer lines
        
        result += "Amount owed is "+ String.valueOf(getTotalCharge()) + "\n";
        result += "You earned "+ String.valueOf(getFrequentPoints())+" frequent renter points";
        return result;
    }
    private double getTotalCharge(){
        double result = 0;
        Enumeration rentals = _rentals.elements();
        
        while(rentals.hasMoreElements()){
            
            Rental each = (Rental)rentals.nextElement();
            result += each.getMovi().getCharge(each.getDaysRented());
            
        }
        return result;
    }
    
    private int getFrequentPoints(){
        int frequentRenterPoints = 0;
         Enumeration rentals = _rentals.elements();
         
          while(rentals.hasMoreElements()){
            Rental each = (Rental)rentals.nextElement();
               
            //add frequent renter points
           frequentRenterPoints += each.getMovi().getFrequentPoints(each.getDaysRented());
        }
        
        return frequentRenterPoints;
    }
    
}

