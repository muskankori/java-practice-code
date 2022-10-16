package com.Muskan;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = in.nextInt();
        System.out.println("Enter the value of b:");
        int b = in.nextInt();

        int addition = a + b;
        System.out.println(addition);
    }
}
