package com.Muskan;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius = in.nextFloat();

        float perimeter = 2 * 3.141f * radius;
        System.out.println(perimeter);
    }
}
