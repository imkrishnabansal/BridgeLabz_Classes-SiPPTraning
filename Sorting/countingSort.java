package Sorting;

public class countingSort {
    public static void main(String[] args) {
        int[] ages = {14, 16, 12, 13, 15, 10, 18, 11, 12, 14};
        countingSort(ages, 10, 18);

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];

        for (int age : arr) {
            count[age - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i + min;
            }
        }
    }
}
