package com.Muskan;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int len = in.nextInt();
        System.out.println("Enter width");
        int wid = in.nextInt();

        float area = wid*len;
        System.out.println(area);
    }
}
