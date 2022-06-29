package task4;

import java.lang.reflect.Field;


public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat = new Cat();
        System.out.println("before reflection");
        System.out.println(cat);
        Class<?> cl = Animal.class;

        Field field1 = cl.getDeclaredField("qtyOfPaws");
        boolean accField1 = field1.canAccess(cat);
        field1.setAccessible(true);
        field1.set(cat, 4);
        field1.setAccessible(accField1); // встановлення значення Accessible таким який було до рефрексії


        Field field2 = cl.getDeclaredField("tail");
        boolean accField2 = field2.canAccess(cat);
        field2.setAccessible(true);
        field2.set(cat, true);
        field2.setAccessible(accField2); // встановлення значення Accessible таким який було до рефрексії

        Field field3 = cl.getDeclaredField("name");
        field3.setAccessible(true);
        boolean accField3 = field3.canAccess(cat);
        field3.set(cat, "Lion");
        field3.setAccessible(accField3); // встановлення значення Accessible таким який було до рефрексії

        System.out.println("after reflection");
        System.out.println(cat);



    }
}
