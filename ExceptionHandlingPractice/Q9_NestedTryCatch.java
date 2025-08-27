public class Q9_NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        int index = 2; // try changing
        int divisor = 0; // try changing

        try {
            try {
                int value = arr[index];
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
