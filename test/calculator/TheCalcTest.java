/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mac
 */
public class TheCalcTest {
    
    public TheCalcTest() {
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
     * Test of getTheNumbers method, of class TheCalc.
     */
    @Test
    public void testGetTheNumbers() {
        System.out.println("getTheNumbers");
        TheCalc instance = new TheCalc();
        List<Integer> expResult = null;
        List<Integer> result = instance.getTheNumbers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTheNumbers method, of class TheCalc.
     */
    @Test
    public void testSetTheNumbers() {
        System.out.println("setTheNumbers");
        List<Integer> theNumbers = null;
        TheCalc instance = new TheCalc();
        instance.setTheNumbers(theNumbers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNumbers method, of class TheCalc.
     */
    @Test
    public void testAddNumbers() {
        System.out.println("addNumbers");
        TheCalc instance = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Integer expResult = 10;
        Integer result = instance.addNumbers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of subtractNumbers method, of class TheCalc.
     */
    @Test
    public void testSubtractNumbers() {
        System.out.println("subtractNumbers");
        TheCalc instance = new TheCalc();
        Integer expResult = null;
        Integer result = instance.subtractNumbers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyNumbers method, of class TheCalc.
     */
    @Test
    public void testMultiplyNumbers() {
        System.out.println("multiplyNumbers");
        Integer i = null;
        TheCalc instance = new TheCalc();
        List<Integer> expResult = null;
        List<Integer> result = instance.multiplyNumbers(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of divideNumbers method, of class TheCalc.
     */
    @Test
    public void testDivideNumbers() throws Exception {
        System.out.println("divideNumbers");
        Integer i = null;
        TheCalc instance = new TheCalc();
        List<Integer> expResult = null;
        List<Integer> result = instance.divideNumbers(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printNumbers method, of class TheCalc.
     */
    @Test
    public void testPrintNumbers() {
        System.out.println("printNumbers");
        TheCalc instance = new TheCalc();
        instance.printNumbers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printANumber method, of class TheCalc.
     */
    @Test
    public void testPrintANumber() {
        System.out.println("printANumber");
        Integer i = null;
        TheCalc instance = new TheCalc();
        instance.printANumber(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
