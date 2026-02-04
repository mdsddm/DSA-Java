package com.ms.corejava.packagetester.MyJavaMyMath;

// Importing Big Integer Class's package
import java.math.BigInteger;

// class: My Math :: Here all method is static
public class MyMath {
    // Area of Circle
    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    public static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    // Area of Cylinder (curved surface area)
    public static double areaOfCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    // Volume of Sphere
    public static double volumeOfSphere(double radius) {
        return (4 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Volume of Cuboid
    public static double volumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Cylinder
    public static double volumeOfCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Factorial (using BigInteger)
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
