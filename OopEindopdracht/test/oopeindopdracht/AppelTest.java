/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class AppelTest {
    
    public AppelTest() {
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

    /**
     * Test of message method, of class Appel.
     */
    @Test
    public void testMessage() {
        System.out.println("message");
        String message = "";
        Appel instance = new Appel("appel",1,0);
        String expResult = "Appel toegevoegd!";
        String result = instance.message(message);
        assertEquals(expResult, result);
    }
    
}
