
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 50, 30, 10, 60, 80 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        bubble(arr);
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // Big O(n^2)
    public static void bubble(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {// n time
            for (int j = 1; j < (n - i); j++) {// n time
                if (arr[j - 1] > arr[j]) {// c time
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

}
