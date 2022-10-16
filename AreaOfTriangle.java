package com.Muskan;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        int b = in.nextInt();
        System.out.println("Enter the height");
        int h = in.nextInt();

        float area = (h * b) / 2;
        System.out.println(area);
    }
}
