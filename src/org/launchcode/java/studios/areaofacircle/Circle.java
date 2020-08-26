package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Circle {
    public static void getArea(double radius) { //main method for program
            Scanner userRadius = new Scanner(System.in); //creates scanner object to hold input
            System.out.println("Please enter a value for circle's radius: "); //prompt to user

            double currentRadius = userRadius.nextDouble(); // read user input
            double circlesArea = Math.PI * currentRadius * currentRadius;
    }


}
