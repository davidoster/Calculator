/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TheCalc aCalc = new TheCalc();
        int i = 0;
        int k = 0;
        List<Integer> theNumbers = new ArrayList<>(Arrays.asList(new Integer[] {1,2,3,4}));
        
        TheCalc myCalculator = new TheCalc(theNumbers);
        myCalculator.printNumbers();
        System.out.println(myCalculator.addNumbers());
        System.out.println(myCalculator.subtractNumbers());
        System.out.println(myCalculator.multiplyNumbers(i));
        try {
            System.out.println(myCalculator.divideNumbers(i));
        } catch (Exception ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
