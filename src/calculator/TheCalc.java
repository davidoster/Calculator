/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mac
 */
public class TheCalc {
    private List<Integer> theNumbers = new ArrayList<>();
    
    public TheCalc() {};
    
    public TheCalc(List<Integer> theNumbers) {
        this.theNumbers = theNumbers;
    
    }

    public List<Integer> getTheNumbers() {
        return theNumbers;
    }

    public void setTheNumbers(List<Integer> theNumbers) {
        this.theNumbers = theNumbers;
    }
    
    public Integer addNumbers() {
        Integer sum = 0;
        //for(Integer i : theNumbers) sum += i;
        sum = theNumbers.stream().map((i) -> i).reduce(sum, Integer::sum);
        return sum;
    }
    
    public Integer subtractNumbers() {
        Integer sub = 0;
        //for(Integer i: theNumbers) sub -= i;
        sub = theNumbers.stream().map((i) -> i).reduce(sub, (accumulator, _item) -> accumulator - _item);
        return sub;
    }
    
    public void printNumbers() {
        //for(Integer i : theNumbers) System.out.println("Number " + i);
        theNumbers.forEach((i) -> {
            System.out.println("Number " + i);
        });
        System.out.println("Total Numbers : " + theNumbers.size());
    }
    
}
