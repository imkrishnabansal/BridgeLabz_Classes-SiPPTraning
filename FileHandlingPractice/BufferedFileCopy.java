import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String source = "largefile.txt";
        String dest1 = "copy_unbuffered.txt";
        String dest2 = "copy_buffered.txt";

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest1)) {
            long start = System.nanoTime();
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            long end = System.nanoTime();
            System.out.println("Unbuffered copy time: " + (end - start) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest2))) {
            long start = System.nanoTime();
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            long end = System.nanoTime();
            System.out.println("Buffered copy time: " + (end - start) + " ns");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
