package com.Muskan;

import java.util.Scanner;

public class VolOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r = in.nextFloat();
        System.out.println("Enter the height:");
        float h = in.nextFloat();

        float vol = 3.141f * (r*r) * h;
        System.out.println(vol);
    }
}
