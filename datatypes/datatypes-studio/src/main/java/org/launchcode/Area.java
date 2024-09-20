package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();
        System.out.println("The Area of radius "+ radius + " is " + Circle.getArea(radius));
    }
}
