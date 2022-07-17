package task4;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Class<?> cl = main.getClass();
        try {
            Method method = cl.getMethod("sum", int.class, int.class);
            Math mathAnno = method.getAnnotation(Math.class);
            main.sum(mathAnno.num1(), mathAnno.num2());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Math(num1 = 100, num2 = 200)
    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
