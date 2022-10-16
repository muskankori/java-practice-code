package com.Muskan;

import java.util.Scanner;

public class AOfIscoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base value");
        int base = in.nextInt();
        System.out.println("Enter height value");
        int height = in.nextInt();

        float area = (base*height) / 2;
        System.out.println(area);
    }
}
