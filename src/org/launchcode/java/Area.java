package org.launchcode.java;

import org.launchcode.java.studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double r;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a circle");
        r = input.nextDouble();
        area = Circle.getArea(r);
        System.out.println("area = " + area);
        input.close();
    }
}
