package Linear_BinarySearch;

public class StringBufferConcat {
    public static String concatenate(String[] words) {
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "!"};
        System.out.println("Concatenated: " + concatenate(arr)); // Output: HelloWorld!
    }
}

