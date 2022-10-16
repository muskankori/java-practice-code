import java.util.Scanner;

public class DiscountOfAProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the market price:");
        double MarketPrice = in.nextDouble();

        System.out.println("Enter discount percentage:");
        double dis = in.nextDouble();

        double s = 100-dis;

        double amount = (s*MarketPrice)/100;
        System.out.println("Price after Discount:" +amount+ "%");
        double saved = MarketPrice - amount;
        System.out.println("you saved:" +saved+ "$");
    }
}
