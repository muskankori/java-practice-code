import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a +b;
        System.out.println("the sum of two numbers is:" + sum);
    }
}
