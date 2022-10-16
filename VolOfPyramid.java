package com.Muskan;

import java.util.Scanner;

public class VolOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base length:");
        float l = in.nextFloat();
        System.out.println("Enter base width:");
        float w = in.nextFloat();
        System.out.println("Enter the height:");
        float h = in.nextFloat();

        float vol = l*w*h / 3 ;
        System.out.println(vol);
    }
}
