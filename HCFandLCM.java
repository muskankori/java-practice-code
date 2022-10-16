import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int temp1 = num1;
        int temp2 = num2;

        while (temp2 != 0){
            int temp = temp2;
             temp2 = temp1%temp2;
             temp1 = temp;
        }
        int hcf = temp1;
        System.out.println("HCF of input numbers:" +hcf);

        int lcm = (num1*num2) / hcf;
        System.out.println("LCM of input numbers:" +lcm);
    }
}
