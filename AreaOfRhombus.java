package com.Muskan;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value one");
        int p = in.nextInt();
        System.out.println("Enter the seconf value");
        int q = in.nextInt();

        int area = p * q / 2;
        System.out.println(area);
    }
}
