package Level2;
import java.util.Scanner;
public class Feets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        sc.close();
    }
}
