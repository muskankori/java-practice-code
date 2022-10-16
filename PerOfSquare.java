package com.Muskan;

import java.util.Scanner;

public class PerOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:");

        int a = in.nextInt();

        int perimeter = 4*a;
        System.out.println(perimeter);
    }
}
