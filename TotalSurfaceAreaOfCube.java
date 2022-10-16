package com.Muskan;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the given side:");
        int A = in.nextInt();

        int TSAofCube = 6*(A*A);
        System.out.println(TSAofCube);
    }
}
