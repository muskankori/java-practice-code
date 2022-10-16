package com.Muskan;

import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        float r = in.nextFloat();
        float cube = r*r*r;
        float pi = 3.141f;
        float Vol = (4 / 3) * pi * cube;
        System.out.println(Vol);
    }
}
