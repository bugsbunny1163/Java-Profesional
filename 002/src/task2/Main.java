package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("введіть " + (i + 1) + " значення");
            list.add(scanner.nextLine());
        }

        list = doubleValues(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

     static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> listTemp = new ArrayList<>();
        for (String temp : list) {
            for (int i = 0; i < 2; i++) {
                listTemp.add(temp);
            }
        }
        return listTemp;
    }
}
