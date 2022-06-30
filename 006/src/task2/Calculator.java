package task2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

/**
 * Calculator
 */

public class Calculator {
    /**
     * first number
     */
    private int number1;
    /**
     * second number
     */
    private int number2;

    /**
     * Create object of calculator without parameters
     */
    public Calculator() {
    }

    /**
     * calculating sum of two number*
     * @param number1 first number
     * @param number2 second number
     * @return sum
     */
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * calculating difference between two number
     * @param number1 first number
     * @param number2 second number
     * @return difference
     */
    public int dif(int number1, int number2) {
        return number1 - number2;
    }

    /**
     * calculating multiple of two numbers
     * @param number1 first number
     * @param number2 second number
     * @return multiple
     */
    public int mul(int number1, int number2) {
        return number1 * number2;
    }

    /**
     * calculating division of two numbers
     * @param number1 first number
     * @param number2 second number
     * @return division
     * @exception ArithmeticException /by zero
     */
    public double div(int number1, int number2) {
        try {
            return (double) number1 / number2;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    /**
     * get first number
     * @return a number
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * set  first number
     * @param number1 number
     */
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    /**
     * get second number
     * @return a number
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * set second number
     * @param number2 number
     */
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}
