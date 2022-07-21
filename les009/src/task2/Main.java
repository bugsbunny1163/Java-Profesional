package task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println(list);
        Optional<Integer> reduce = list.stream().map(x -> x * x).reduce(Integer::sum);
        System.out.println(reduce.get());
    }

}
