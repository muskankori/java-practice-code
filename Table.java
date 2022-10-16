import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
//        int i = 0;
//        while(i<=10){
//            int ans = n*i;
//            i++;
//            System.out.println(ans);
//        }

        for(int i = 0; i <=10;i++){
            int ans = n*i;
            System.out.println(ans);
        }
    }
}
