package com.Muskan;

import java.util.Scanner;

public class VolOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base area:");
        int b = in.nextInt();
        System.out.println("Enter the height:");
        int h = in.nextInt();

        float vol = b*h;
        System.out.println(vol);
    }
}
