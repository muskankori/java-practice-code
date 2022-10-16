import java.util.Scanner;

public class CalcOp {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 0;

        System.out.println("Enter an operator: ");

        char op = in.next().trim().charAt(0);
        if(op == '+')
            ans = a + b;
        else
            if (op == '-') {
                ans = a - b;
            } else if (op == '*') {
                ans = a * b;
            }
            System.out.println(ans);

    }
}
