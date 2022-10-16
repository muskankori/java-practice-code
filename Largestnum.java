import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(Math.max(a, b));
    }
}
