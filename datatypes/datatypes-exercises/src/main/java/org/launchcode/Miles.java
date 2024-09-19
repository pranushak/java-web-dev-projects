package org.launchcode;
import java.util.Scanner;
public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles they have driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter the amout of gas they have consumed: ");
        double gas = input.nextDouble();

        double milesPerGallon = miles / gas;
        System.out.println("You are driving " + milesPerGallon + ".mpg");
    }
}
