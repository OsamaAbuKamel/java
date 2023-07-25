package Files;

import java.io.File;

public class WriteDataWithAutoC1ose {
    public static void main(String[] args) {
        File f = new File("scores.txt");
        if (f.exists()) {
            System.out.println("fewhhwef");
        }
    }
}
