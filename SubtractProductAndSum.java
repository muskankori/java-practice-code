package com.Muskan;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0){
             sum += n % 10;
             product *= n % 10;
             n /= 10;
        }
        System.out.println(product - sum);
    }
}
