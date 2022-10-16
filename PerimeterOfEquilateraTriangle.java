package com.Muskan;

import java.util.Scanner;

public class PerimeterOfEquilateraTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value or sides a:");

        float a = in.nextFloat();

        float perimeter = 3 * a;
        System.out.println(perimeter);

    }
}
