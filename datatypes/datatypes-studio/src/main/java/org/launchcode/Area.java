package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();

        // Calculate the area using the formula A = pi * r * r
        double area = Circle.getArea(radius);

        // Print the result
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

