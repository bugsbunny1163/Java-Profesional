package task4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String city;
        String family = " ";

        while (true){
             city = scanner.next();
            if (!map.containsKey(city)){
                family = scanner.next();
                map.put(city, family);
            }else {
                System.out.println(map.get(city));
                break;
            }
        }
    }
}
