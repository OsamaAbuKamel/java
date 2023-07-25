public class HeapSort {
    static int total;

    public static void main(String[] args) {
        int[] arr = { 1, 50, 30, 10, 60, 80 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        preSort(arr);
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void heapFy(int[] arr, int parentIndex) {
        int leftNodeIndex = parentIndex * 2;
        int rightNodeIndex = parentIndex * 2 + 1;
        int newIndex = parentIndex;
        if (leftNodeIndex < total && arr[leftNodeIndex] > arr[parentIndex])
            newIndex = leftNodeIndex;
        if (rightNodeIndex < total && arr[rightNodeIndex] < arr[parentIndex])
            newIndex = rightNodeIndex;
        if (newIndex != parentIndex) {
            swap(arr, parentIndex, newIndex);
            heapFy(arr, newIndex);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void preSort(int[] arr) {
        total = arr.length - 1;
        for (int i = total / 2; i >= 0; i--) {
            heapFy(arr, i);
        }
        for (int i = total; i >= 0; i--) {
            swap(arr, 0, i);
            total--;
            heapFy(arr, 0);

        }
    }
}
