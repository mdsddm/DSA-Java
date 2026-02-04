package com.ms.corejava.packagetester;

import com.ms.corejava.packagetester.MyJavaMyMath.MyMath;

public class PackageTester {
    public static void main(String[] args) {
        System.err.println("::::::: Hey !! This Package Tester ::::::: ");
        // Testing Area of Circle
        System.out.println("Area of Circle: " + MyMath.areaOfCircle(7.0));
        // Testing Area Of Rectangle
        System.out.println("Area of Rectangle: " + MyMath.areaOfRectangle(2.5, 8.0));
        // Testing Area Of Cylinder
        System.out.println("Area of Cylinder: " + MyMath.areaOfCylinder(7.0, 5.0));
        // Testing Volume of Sphere
        System.out.println("Volume of Sphere: " + MyMath.volumeOfSphere(5.6));
        // Testing Volume of Cuboid
        System.out.println("Volume of Cuboid: " + MyMath.volumeOfCuboid(3, 4, 5));
        // Testing Volume of Cylinder
        System.out.println("Volume of Cylinder: " + MyMath.volumeOfCylinder(6.2, 9.0));
        // Testing Big Integer Factorial method
        System.out.println("Factorial of 5: " + MyMath.factorial(25));

    }
}
