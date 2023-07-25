public class InterpolationSearch {
    public static void main(String[] args) {
        int size = 1000000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        int target = 8888;
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

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (low == high) {
                if (arr[low] == target)
                    return low;
                return -1;
            }
            // Estimate the position of the target value
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            numberOfTry++;
            if (arr[pos] == target) {
                System.out.println("number of try " + numberOfTry);
                return pos;
            } else if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }
}
