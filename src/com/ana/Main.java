package com.ana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.println("AREA = " +rectangle.area());
        System.out.println("PERIMETRO = " +rectangle.perimeter());
        System.out.println("DIAGONAL = " +rectangle.diagonal());
    }
}
