package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(1);
        list.add(0);
        list.add(-8);
        list.add(9);
        list.add(2);
        list.add(-2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer temp= iterator.next();
            System.out.println(temp);
        }
    }
}
