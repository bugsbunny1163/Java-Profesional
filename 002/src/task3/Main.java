package task3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = getIntegerList();
        getMinimum(list);
    }

    private static void getMinimum(LinkedList<Integer> list) {
        System.out.println(Collections.min(list));
    }

    private static LinkedList<Integer> getIntegerList() {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("input length of list");
        Scanner scanner= new Scanner(System.in);
        int listLength = scanner.nextInt();
        for (int i = 0; i < listLength; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
