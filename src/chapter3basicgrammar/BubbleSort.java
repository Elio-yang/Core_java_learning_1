package chapter3basicgrammar;

/**
 * 2-D_array
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{1, 6, 4, 7, 2, 9, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int value : arr) {
            System.out.print("  " + value);
        }
    }
}
