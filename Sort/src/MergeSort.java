import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = { 10, 5, 2, 1, 8, 7, 6, 3, 4, 9 };
        System.out.println("Unsorted array: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int middle = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, middle);
        int[] right = Arrays.copyOfRange(array, middle, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
// int[] array;
// int[] temp;

// public static void main(String[] args) {
// int[] arr = { 1, 50, 30, 10, 60, 80 };
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + "\t");
// }
// System.out.println();
// new MergeSort().prepareForSort(arr);
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + "\t");
// }
// System.out.println();
// }

// void prepareForSort(int[] arr) {
// this.array = arr;
// this.temp = new int[arr.length];
// doMergeSort(0, arr.length - 1);

// }

// // divide to small problem
// private void doMergeSort(int lowerIndex, int higherIndex) {
// if (lowerIndex < higherIndex) {
// int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
// doMergeSort(lowerIndex, middle);
// doMergeSort(middle + 1, higherIndex);
// mergePart(lowerIndex, middle, higherIndex);
// }
// }

// // marge and sort
// private void mergePart(int lowerIndex, int middle, int higherIndex) {
// for (int i = lowerIndex; i < higherIndex; i++)
// temp[i] = array[i];
// int i = lowerIndex;
// int j = middle + 1;
// int k = lowerIndex;
// while (i <= middle && j <= higherIndex) {
// if (temp[i] <= temp[j]) {
// array[k] = temp[i];
// i++;
// } else {
// array[k] = temp[j];
// j++;
// }
// k++;
// }
// while (i <= middle) {
// array[k] = temp[i];
// k++;
// i++;

// }
// }
// }
