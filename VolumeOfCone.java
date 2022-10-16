package com.Muskan;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius:");
        float r = in.nextFloat();
        System.out.println("Enter the height:");
        float h = in.nextFloat();

        float Vol = 3.141f *(r*r) * h/3;
        System.out.println(Vol);
    }
}
