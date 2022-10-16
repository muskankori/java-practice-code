package com.Muskan;

import java.util.Scanner;

public class PerOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length:");
        float len = in.nextFloat();
        System.out.println("Enter width:");
        float wid = in.nextFloat();

        float perimeter = 2 * (len+wid);
        System.out.println(perimeter);
    }
}
