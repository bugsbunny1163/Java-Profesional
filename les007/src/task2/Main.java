package task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat(4, true, "Tom");
        File file = new File("les007/src/task2/catSerial");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(cat);
        outputStream.flush();
        outputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Cat catFromFile = (Cat) objectInputStream.readObject();
        System.out.println(catFromFile);
    }
}
