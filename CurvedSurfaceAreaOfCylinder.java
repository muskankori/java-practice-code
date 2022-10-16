package com.Muskan;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter r:");
        float r = in.nextFloat();
        System.out.println("Enter h:");
        float h = in.nextFloat();

        float pi = 3.14f;
        float SurfArea = 2*pi*(r+h);
        System.out.println(SurfArea);

    }
}
