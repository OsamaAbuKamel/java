package Files;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile inout = new RandomAccessFile("scores.txt", "rw");) {
            inout.setLength(0);
            for (int i = 0; i < 200; i++)
                inout.writeInt(i);
            System.out.println("The new length is " + inout.length());

            inout.seek(0);
            System.out.println("The first number is " + inout.readInt());
            inout.seek(1 * 4);
            System.out.println("The second number is " + inout.readInt());

            inout.seek(9 * 4);
            System.out.println("The tenth number is " + inout.readInt());

            inout.write(555);
            inout.seek(inout.length());
            inout.write(999);

            System.out.println("The new length is " + inout.length());

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
