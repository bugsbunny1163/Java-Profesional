package task3;

public class Main {
    public static void main(String[] args) {
        String str = "The String class provides methods for dealing with Unicode code points (i.e., characters), in addition to those for dealing with Unicode code units (i.e., char values).";
        String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2);

        System.out.println(str1 + "\n" + str2);

    }
}
