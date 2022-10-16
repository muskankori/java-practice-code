package com.Muskan;

import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(n);

        for (int i = 1; i <= n; ++i) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
