import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int t = in.nextInt();
        float r = in.nextFloat();

        float SI =  (p*r*t) / 100;
        System.out.println("Simple Interest of the given numbers is: " +SI);
    }
}
