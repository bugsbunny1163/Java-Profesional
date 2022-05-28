package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (true) {
            input = bufferedReader.readLine();
            if (input.equals("")){
                continue;
            }
            if (input.equals("end")) {
                break;
            } else {
                list.add(input);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
