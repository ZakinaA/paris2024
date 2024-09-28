/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package sio.paris2024.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zakina
 */
public class EpreuveTest {
    
    static Epreuve uneEpreuve ;
    
    public EpreuveTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        uneEpreuve = new Epreuve();
        
        Athlete a1 = new Athlete();
        Athlete a2 = new Athlete();
        
        uneEpreuve.addAthlete(a1);
        uneEpreuve.addAthlete(a2);
                
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
     * Test of getId method, of class Epreuve.
     
    @Test
    public void testGetId() {
        System.out.println("getId");
        Epreuve instance = new Epreuve();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setId method, of class Epreuve.
    
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Epreuve instance = new Epreuve();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */

    /**
     * Test of getNom method, of class Epreuve.
     
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Epreuve instance = new Epreuve();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setNom method, of class Epreuve.
     
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Epreuve instance = new Epreuve();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSport method, of class Epreuve.
     
    @Test
    public void testGetSport() {
        System.out.println("getSport");
        Epreuve instance = new Epreuve();
        Sport expResult = null;
        Sport result = instance.getSport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setSport method, of class Epreuve.
     
    @Test
    public void testSetSport() {
        System.out.println("setSport");
        Sport sport = null;
        Epreuve instance = new Epreuve();
        instance.setSport(sport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getAthletes method, of class Epreuve.
     
    @Test
    public void testGetAthletes() {
        System.out.println("getAthletes");
        Epreuve instance = new Epreuve();
        ArrayList<Athlete> expResult = null;
        ArrayList<Athlete> result = instance.getAthletes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setAthletes method, of class Epreuve.
     
    @Test
    public void testSetAthletes() {
        System.out.println("setAthletes");
        ArrayList<Athlete> athletes = null;
        Epreuve instance = new Epreuve();
        instance.setAthletes(athletes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of addAthlete method, of class Epreuve.
     
    @Test
    public void testAddAthlete() {
        System.out.println("addAthlete");
        Athlete a = null;
        Epreuve instance = new Epreuve();
        instance.addAthlete(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getNbAthletes method, of class Epreuve.
     */
    @Test
    public void testGetNbAthletes() {
        System.out.println("getNbAthletes");
        //Epreuve instance = new Epreuve();
        int expResult = 2;
        int result = uneEpreuve.getNbAthletes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
