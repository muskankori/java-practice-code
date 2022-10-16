package com.Muskan;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = in.nextInt();
        System.out.println("Enter the height");
        int height = in.nextInt();

        float area = base * height;
        System.out.println(area);
    }
}
