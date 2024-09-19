package visual.code;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 25, 11, 6, 9};
        insertionSort(arr);
        System.out.println("Mang sau khi sap xep: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
