

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CustomerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CustomerTest
{
    /**
     * Default constructor for test class CustomerTest
     */
    public CustomerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void statement()
    {
        Movie movie1 = new Movie("nenad", 1);
        Rental rental1 = new Rental(movie1, 2);
        Customer customer1 = new Customer("nenad");
        customer1.addRental(rental1);
        assertEquals("Rental Record for nenad\n\tnenad\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points", customer1.statement());
    }

    @Test
    public void statement1()
    {
        Movie movie1 = new Movie("koja", 2);
        Rental rental1 = new Rental(movie1, 4);
        Customer customer1 = new Customer("bojan");
        customer1.addRental(rental1);
        java.lang.String string1 = customer1.statement();
        assertEquals("Rental Record for bojan\n\tkoja\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points", string1);
    }

    @Test
    public void statement3()
    {
        Movie movie1 = new Movie("otpisani", 3);
        Rental rental1 = new Rental(movie1, 7);
        Customer customer1 = new Customer("viki");
        customer1.addRental(rental1);
        assertEquals("Rental Record for viki\n\totpisani\t0.0\nAmount owed is 0.0\nYou earned 1 frequent renter points", customer1.statement());
    }
}



