import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt(); // cost price
        int s = sc.nextInt(); // selling price

        if (s > c) {
            int p = s - c;  // correct profit formula
            double profitPer = (p * 100.0) / c;  // use double for accurate %
            System.out.println("Profit: " + p);
            System.out.println("Profit Percentage: " + profitPer + "%");
        }
    }
}