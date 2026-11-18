
package org.example;

public class Main {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Main m = new Main();

        System.out.println("Addition: " + m.add(10, 5));
        System.out.println("Subtraction: " + m.subtract(10, 5));
        System.out.println("Multiplication: " + m.multiply(10, 5));
        System.out.println("Division: " + m.divide(10, 5));
    }
}
