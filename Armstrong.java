import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(Armstrong(n));
        for ( int i = 100; i < 10000; i ++){
            if (Armstrong(i)){
                System.out.println(i + "");
            }

            }
    }

    static boolean Armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
