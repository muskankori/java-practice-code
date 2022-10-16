package com.Muskan;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        float area = 3.141f * r *r;
        System.out.println(area);
    }
}
