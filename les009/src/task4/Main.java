package task4;

public class Main {
    public static void main(String[] args) {
        //todo зробити

//        int a;
//        int b;
        Calculator summa;
        summa = (a, b) -> a + b;
        Calculator diff;
        diff = (a, b) -> (a - b);
        Calculator mul;
        mul = (a, b) -> (a * b);
        Calculator div;
        div = (a, b) -> (a / b);


        System.out.println(summa.calculating(1, 4));
        System.out.println(diff.calculating(5, 1));
        System.out.println(mul.calculating(5, 3));
        System.out.println(div.calculating(6, 2));
    }
}

interface Calculator {
    int calculating(int a, int b);
}