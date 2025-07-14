package Linear_BinarySearch;

public class ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverse(input);
        System.out.println("Reversed: " + output); // Output: olleh
    }
}
