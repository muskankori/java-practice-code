import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Indian Rupees: ");
        Scanner in = new Scanner(System.in);
        double Rupee = in.nextFloat();

        double USD = Rupee/79.5823;
        System.out.println(USD);
    }
}
