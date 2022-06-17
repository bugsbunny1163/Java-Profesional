package task2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

/**
 * @author Volodymyr Petrovskyi
 * @version 1.0
 * @since 17.06.2022
 */


public class Main{

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(8, 4));
//        System.out.println(calculator.dif(1, 3));
//        System.out.println(calculator.mul(1, 3));
//        System.out.println(calculator.div(1, 3));
    }
}


