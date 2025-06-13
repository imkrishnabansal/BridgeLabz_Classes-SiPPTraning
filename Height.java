import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Your height in cm is %.2f cm,\n", cm);
        System.out.printf("While in feet and inches: %d feet %.2f inches\n", feet, inches);
    }
}