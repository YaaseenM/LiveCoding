import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        sortArray(arr, size);

        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    public static void sortArray(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int value = arr[i];
            int j = i - 1;
            while (j>= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
}
