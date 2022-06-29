package task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classForInfo = Transport.class;
        Field[] fields = classForInfo.getDeclaredFields();
        System.out.println("\tFields:");
        int count = 0;
        for (Field field : fields) {
            count++;
            System.out.println("field №" + count);
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + field.getType().getTypeName());
            System.out.println("\tModifier: " + Modifier.toString(field.getModifiers()));
        }
        System.out.println("---------------------");

        Constructor<?>[] constructors = classForInfo.getDeclaredConstructors();
        System.out.println("\tConstructors:");
        int count2 = 0;
        for (Constructor<?> constructor : constructors) {
            count2++;
            System.out.println("constructor №" + count2);
            System.out.println("\t" + constructor.getName());
            System.out.println("\tParameters Types" +Arrays.toString(constructor.getParameterTypes()));
        }
        System.out.println("---------------------");

        Method[] methods = classForInfo.getDeclaredMethods();
        System.out.println("\tMethods:");
        int count3 = 0;
        for (Method method : methods) {
            count3++;
            System.out.println("method №" + count3);
            System.out.println("\tName: " + method.getName());
            System.out.println("\tModifier: " + Modifier.toString(method.getModifiers()));
        }

    }
}
