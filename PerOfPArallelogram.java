package com.Muskan;

import java.util.Scanner;

public class PerOfPArallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base:");
        float b = in.nextFloat();
        System.out.println("Enter the side:");
        float a = in.nextFloat();

        float Perimeter = 2 * (a+b);
        System.out.println(Perimeter);
    }
}
