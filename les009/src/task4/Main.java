package task4;

public class Main {
    public static void main(String[] args) {
        Calculator summa;
        summa = (a, b) -> a + b;
        Calculator diff;
        diff = (a, b) -> (a - b);
        Calculator mul;
        mul = (a, b) -> (a * b);
        Calculator div;
        div = (a, b) -> (a / b);


        System.out.println("сума " + summa.calculating(5, 2));
        System.out.println("різниця " + diff.calculating(5, 2));
        System.out.println("множення " + mul.calculating(5, 2));
        System.out.println("ділення " + div.calculating(5, 2));
    }
}

interface Calculator {
    double calculating(double a, double b);
}