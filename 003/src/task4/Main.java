package task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "003\\src\\task4\\textFile.txt";

        try {
            File file = new File(filePath);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(filePath)));
            bufferedWriter.write("some info1");
            bufferedWriter.newLine();
            bufferedWriter.write("some info2");
            bufferedWriter.newLine();
            bufferedWriter.write("some info3");
            bufferedWriter.newLine();
            bufferedWriter.write("some info4");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String text;
            while ((text =bufferedReader.readLine())!=null){
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
