public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 4, 6, 8, 2, 12 };
        int target = 8;
        int result = search(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
    }
}
