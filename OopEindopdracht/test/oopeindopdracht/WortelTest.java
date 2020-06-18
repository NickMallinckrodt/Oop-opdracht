//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WortelTest {
    
    public WortelTest() {
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
    public void testMessage() {
        System.out.println("message");
        String message = "";
        Wortel instance = new Wortel("wortel",1,0);
        String expResult = "Wortel toegevoegd!";
        String result = instance.message(message);
        assertEquals(expResult, result);
    }
    
}
