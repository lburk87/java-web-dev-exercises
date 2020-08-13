package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;


public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r = input.nextDouble();
        double area = (double) (Math.round(Circle.getArea(r) * 1000))/1000;
        System.out.println("The area of a circle of radius " + r + " is: " + area);

    }
}
