import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\XPRISTO\\Downloads\\Telegram Desktop\\Jawwal.csv";
        ArrayList<Integer> phoneNumbersList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            boolean isFirstLine = true; // Flag to skip the first line
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the first line
                }

                String[] data = line.split(","); // Split the line by comma

                if (data.length >= 1) {
                    String phoneNumber = data[0].trim();
                    phoneNumbersList.add(Integer.parseInt(phoneNumber));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int target = 9294076;
        int low = 0;
        int high = phoneNumbersList.size() - 1;
        int numberOfTry = 0;

        while (low <= high && target >= phoneNumbersList.get(low) && target <= phoneNumbersList.get(high)) {
            if (low == high) {
                if (phoneNumbersList.get(low) == target)
                    System.out.println("Element not found.");

            }

            // Estimate the position of the target value
            int pos = low + ((target - phoneNumbersList.get(low)) * (high - low))
                    / (phoneNumbersList.get(high) - phoneNumbersList.get(low));
            numberOfTry++;
            if (phoneNumbersList.get(pos) == target) {
                System.out.println("Element found at index ");

                System.out.println("number of try " + numberOfTry);
            } else if (phoneNumbersList.get(pos) < target)
                low = pos + 1;
            else
                high = pos - 1;
        }
    }

    public static int search(ArrayList<Integer> phoneNumbersList, int target) {

        return -1;
    }
}
