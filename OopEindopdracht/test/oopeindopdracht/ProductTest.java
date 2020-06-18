package oopeindopdracht;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nick
 */
public class ProductTest {

    public ProductTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetNaam() {
        System.out.println("setNaam");
        String naam = "";
        Product instance = new Product();
        instance.setNaam(naam);
    }

    @Test
    public void testGetPrijs() {
        System.out.println("getPrijs");
        Product instance = new Product();
        double expResult = 0.0;
        double result = instance.getPrijs();
        assertEquals(expResult, result, 0.0);

    }

    @Test
    public void testSetPrijs() {
        System.out.println("setPrijs");
        double prijs = 0.0;
        Product instance = new Product();
        instance.setPrijs(prijs);

    }

    @Test
    public void testGetAantal() {
        System.out.println("getAantal");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getAantal();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetAantal() {
        System.out.println("setAantal");
        int aantal = 0;
        Product instance = new Product();
        instance.setAantal(aantal);

    }

    @Test
    public void testMessage() {
        System.out.println("message");
        String message = "";
        Product instance = new Product();
        String expResult = "product toegevoegd";
        String result = instance.message(message);
        assertEquals(expResult, result);

    }

}
