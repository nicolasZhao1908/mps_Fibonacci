package org.zzlnico.fibonacci;

public class Fibonacci {
    /**
     * Class providing a method that computes the nth fibonacci number given an integer number
     *
     * @author Nicolás Zhao
     */
    public int compute(int value){
        if (value < 0) {
            throw new RuntimeException("The value is negative: " + value);
        }
        int result = 0;
        int firstNumber = 0;
        int secondNumber = 1;
        if (value == 0){
            result = firstNumber;
        }else if (value == 1){
            result = secondNumber;
        }else{
            result = compute(value-1) + compute(value-2);
        }
        return result;
    }
}
