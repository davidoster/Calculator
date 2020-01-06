/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Arrays;
import org.junit.*;

/**
 *
 * @author mac
 */
public class TheCalcTest {
    
    @Test
    public void testAddNumbers() {
        TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(new Integer(10), theCalc.addNumbers());
        
        
    }
    
    @Test
    public void testSubtractNumbers() {
        TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(new Integer(-10), theCalc.subtractNumbers());
    }
    
    @Test
    public void testMultiplyNumbersWithZero() {
        TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {0,0,0,0}), theCalc.multiplyNumbers(0));
    }
    
    @Test
    public void testMultiplyNumbersWithOne() {
        TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {1,2,3,4}), theCalc.multiplyNumbers(1));
    }
    
    @Test
    public void testMultiplyNumbersWithNegative1() {
        TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {-1,-2,-3,-4}), theCalc.multiplyNumbers(-1));
    }
    
    @Test
    public void testMultiplyNumbersWithBigPositiveNumber() {
        TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {1 * Integer.MAX_VALUE,2 * Integer.MAX_VALUE,3 * Integer.MAX_VALUE,
                                                         4 * Integer.MAX_VALUE}), theCalc.multiplyNumbers(Integer.MAX_VALUE));
    }
    
    @Test
    public void testDivideNumbersWith1() throws Exception {
       TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {1,2,3,4}), theCalc.divideNumbers(1)); 
    }
    
    @Test
    public void testDivideNumbersWithNegative1() throws Exception {
       TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {1/-1,2/-1,3/-1,4/-1}), theCalc.divideNumbers(-1)); 
    }
    
    @Test
    public void testDivideNumbersWithBigPositiveNumber() throws Exception {
       TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {1/Integer.MAX_VALUE,2/Integer.MAX_VALUE,
                                                         3/Integer.MAX_VALUE,4/Integer.MAX_VALUE}), theCalc.divideNumbers(Integer.MAX_VALUE)); 
    }
    
    @Test
    public void testDivideNumbersWithZero() throws Exception {
       TheCalc theCalc = new TheCalc(Arrays.asList(new Integer[] {1,2,3,4}));
        Assert.assertEquals(Arrays.asList(new Integer[] {1/0,2/0,
                                                         3/0,4/0}), theCalc.divideNumbers(0)); 
    }
}
