package task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please input name of class(example "java.lang.reflect.Constructor") or use hotkeys:
                1\ttask2.Car
                2\tjava.util.Scanner
                3\tjava.util.Arrays""");
        String input = scanner.next();
        if(input.equals("1")){
            input = "task2.Car";
        } else if (input.equals("2")) {
            input = "java.util.Scanner";
        } else if (input.equals("3")) {
            input ="java.util.Arrays";
        }

        System.out.println();

        try {
            Class<?> classForInfo = Class.forName(input);
            System.out.println("Class " + classForInfo.getSimpleName());
            fieldsToPrint(classForInfo);
            constructorsToPrint(classForInfo);
            methodsToPrint(classForInfo);
        } catch (ClassNotFoundException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void methodsToPrint(Class<?> classForInfo) {
        Method[] methods = classForInfo.getMethods();
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println("Name: "+method.getName());
            System.out.println("\tReturn Type: " + method.getReturnType());
            if(method.getParameterTypes().length==0 ){
                System.out.println("\tParameter Types: NONE");
            }else {
                System.out.println("\tParameter Types: " + Arrays.toString(method.getParameterTypes()));
            }
        }
    }

    private static void constructorsToPrint(Class<?> classForInfo) {
        Constructor[] constructors = classForInfo.getConstructors();
        System.out.println("Constructors:");
        for (Constructor constructor : constructors) {
            System.out.println("\t" + constructor);
        }
    }

    private static void fieldsToPrint(Class<?> classForInfo) {
        Field[] fields = classForInfo.getDeclaredFields();
        System.out.println("Fields:");
        for (Field field : fields) {
            System.out.print("Name: " + field.getName()+"\t");
            System.out.println("|"+"\t"+"Type: " + field.getType().getTypeName());
        }
    }
}
