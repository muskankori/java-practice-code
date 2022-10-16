import java.util.Scanner;
import java.util.Date;
public class ElectricBills2 {
    public static void main(String[] args) {

        Date date = new Date();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter account name:");
        String name = in.nextLine();

        System.out.println("Enter address:");
        String address = in.nextLine();

        System.out.println("Choose bill type B for (bussiness) or R for (residential)");
        char customerType = in.next().charAt(0);

        System.out.println("Enter previos kilowatt:");
        int previous = in.nextInt();

        System.out.println("Enter present kilowatt");
        int present = in.nextInt();

        int consumed = previous - present;

        System.out.println();

        switch (customerType)
        {
            case 'R':
            case 'r':
        }

        System.out.println("Account Name:" +(name));
        System.out.println("Account Address:" +(address));
        System.out.println("Your bill type is: Residential");
        System.out.println("Previous reading:" +(previous));
        System.out.println("Present reading:" +(present));
        System.out.println("Bill amount is P:" +(consumed * 15.50));
    }
}
