import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = in.nextInt();

        if (y % 400 == 0)
            System.out.println("This is a leap year");
        else
            if (y % 100 == 0)
                System.out.println("This is a leap year");
            else if (y % 4 == 0)
                System.out.println("this is a leap year");

            else{
            System.out.println(y + ":is not a leap year");
        }
    }
}