package Files;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    static final String FILEPATH = "scores.txt";

    public static void main(String[] args) {
        try {
            // System.out.println(new String(readFromFile(FILEPATH, 0, 18)));
            writeToFile(FILEPATH, "I love my country", 31);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] readFromFile(String path, int position, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(path, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void writeToFile(String path, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(path, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();

    }

}
