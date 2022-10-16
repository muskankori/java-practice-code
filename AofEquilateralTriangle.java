package com.Muskan;

import java.util.Scanner;

public class AofEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a");
        float a = in.nextFloat();

        float area = 1.732f/4 *(a*a);
        System.out.println(area);
    }
}
