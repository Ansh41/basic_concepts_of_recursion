import java.util.Arrays;

public class recursive_bubble_sorting {
    public static void bubbleSort(int arr[], int n) {
        // Base case
        if (n == 1) {
            return;
        }

        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        // Largest element is fixed,
        // recur for remaining array
        bubbleSort(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(arr, arr.length);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }
}
