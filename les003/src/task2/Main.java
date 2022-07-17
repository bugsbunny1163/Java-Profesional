package task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("003\\task2.txt")))) {
            dataOutputStream.writeUTF("first line");
            dataOutputStream.writeUTF("second line");
            dataOutputStream.writeInt(125);

            dataOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("003\\task2.txt"))) ) {
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
