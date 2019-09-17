package com.company;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args)
    {
        int length;
        int width;
        int area;
        Scanner Overwatch = new Scanner(System.in);

        System.out.println("Please type the length of Rectangle");
        length = Overwatch.nextInt();
        System.out.println("Please type the width of Rectangle");
        width = Overwatch.nextInt();
        area = length*width;
        System.out.println("Area = "+(area));

    }
}
