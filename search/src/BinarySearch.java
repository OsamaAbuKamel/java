public class BinarySearch {
    public static void main(String[] args) {
        int size = 1000000;

        // int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 };
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        int target = 999999;
        int result = search(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
    }

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int numberOfTry = 0;

        while (low <= high) {
            numberOfTry++;
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("number of try " + numberOfTry);
                return mid;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
