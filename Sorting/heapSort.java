package Sorting;

public class heapSort {
    public static void main(String[] args) {
        int[] salaries = {40000, 25000, 55000, 32000, 47000};
        heapSort(salaries);

        System.out.println("Sorted Salaries:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);

        // One by one extract elements
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1, right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
