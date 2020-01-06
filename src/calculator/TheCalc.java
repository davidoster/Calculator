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
//        for(int i = 0; i < theNumbers.size(); i++) sum += i;
//        for(Integer i : theNumbers) sum += i;
        sum = theNumbers.stream().map((i) -> i).reduce(sum, Integer::sum);
        return sum;
    }
    
    public Integer subtractNumbers() {
        Integer sub = 0;
        for(Integer i: theNumbers) sub -= i;
//        sub = theNumbers.stream().map((i) -> i).reduce(sub, (accumulator, _item) -> accumulator - _item);
        return sub;
    }
    
    public List<Integer> multiplyNumbers(Integer i) {
        List<Integer> result = new ArrayList<Integer>();
        for(int j = 0; j < theNumbers.size(); j++) {
            Integer temp = theNumbers.get(j) * i;
            result.add(temp);
        }
        return result;
    }
    
    public List<Integer> divideNumbers(Integer i) throws Exception {
        List<Integer> result = new ArrayList<Integer>();
        for(int j = 0; j < theNumbers.size(); j++) {
            Integer temp = null;
            try {
                temp = theNumbers.get(j) / i;
            } catch (Exception e) {
                throw new Exception("Division By Zero is not Allowed in this Universe!!!");
            }
            result.add(temp);
        }
        return result;
    }
    
    public void printNumbers() {
        //for(Integer i : theNumbers) System.out.println("Number " + i);
        for(Integer i : theNumbers) printANumber(i);
        theNumbers.forEach((i) -> printANumber(i));
        theNumbers.forEach((i) -> {
            System.out.println("Number " + i);
        });
        System.out.println("Total Numbers : " + theNumbers.size());
    }

    public void printANumber(Integer i) {
        System.out.println("i = " + i);
    }
    
    
}
