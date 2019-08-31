/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author Tyler Maxwell
 */
public class CircleAreaPerimeter {

    /**
     * @param args the command line arguments
     */
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
