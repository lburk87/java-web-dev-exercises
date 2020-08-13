package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid. Enter a radius:");
            input.next();
        }
        double r = input.nextDouble();
        if (r < 0) {
            System.out.println("Invalid. Enter a radius:");
            r = input.nextDouble();
        }
        double area = (double) (Math.round(Circle.getArea(r) * 1000))/1000;
        System.out.println("The area of a circle of radius " + r + " is: " + area);

    }
}
