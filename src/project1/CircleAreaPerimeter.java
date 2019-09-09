/*
 * Project #1
 * Source Code File: CircleAreaPerimeter.java
 * Programmer: Tyler Maxwell
 * Due: 9/9/19
 * Description: Part 2 of Project 1. A program that calculates and displays the perimeter and area of a circle with a radius of 5.5.
 */

 
package project1;

public class CircleAreaPerimeter {

    public static void main(String[] args) {
        double radius, perimeter, area, PI;
        PI = 3.14159;
        radius = 5.5;
        perimeter = 2 * radius * PI;
        area = radius * radius * PI;
        System.out.println("The perimeter of a circle with a radius of " + radius + " is " + 
                perimeter + " and its area is " + area);
        
    }
    
}
