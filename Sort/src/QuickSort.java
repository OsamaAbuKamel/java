import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 50, 30, 10, 80, 60 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        quick(arr, 0, arr.length - 1);
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(9);
        stack.push(6);
        int[] array = new int[stack.size()];
        System.out.println("Stack");

        // Copy the stack elements to the array.
        for (int i = stack.size() - 1; i >= 0; i--) {
            array[i] = stack.pop();
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        quick(array, 0, array.length - 1);
        System.out.println("After sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");

        }

    }

    public static void quick(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quick(arr, low, j);
        if (high > i)
            quick(arr, i, high);
    }

}
