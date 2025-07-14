package Linear_BinarySearch;
public class StringBufferVsBuilder {
    public static void main(String[] args) {
        int n = 1_000_000;

        long start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        long sbfTime = System.nanoTime() - start;
        System.out.println("StringBuffer Time: " + sbfTime);

        start = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbd.append("hello");
        }
        long sbdTime = System.nanoTime() - start;
        System.out.println("StringBuilder Time: " + sbdTime);
    }
}
