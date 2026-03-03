package pt.av.edimilsonestevam.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ScientificCalculator calculator = new ScientificCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("Enter operation (+, -, *, /, pow, sqrt, sin, cos, log): ");

        String operation = scanner.next();

        try {
            switch (operation) {
                case "+" -> {
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(a, b));
                }
                case "-" -> {
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + calculator.subtract(a, b));
                }
                case "*" -> {
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + calculator.multiply(a, b));
                }
                case "/" -> {
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    System.out.println("Result: " + calculator.divide(a, b));
                }
                case "pow" -> {
                    double base = scanner.nextDouble();
                    double exp = scanner.nextDouble();
                    System.out.println("Result: " + calculator.power(base, exp));
                }
                case "sqrt" -> {
                    double value = scanner.nextDouble();
                    System.out.println("Result: " + calculator.sqrt(value));
                }
                case "sin" -> {
                    double angle = scanner.nextDouble();
                    System.out.println("Result: " + calculator.sin(angle));
                }
                case "cos" -> {
                    double angle = scanner.nextDouble();
                    System.out.println("Result: " + calculator.cos(angle));
                }
                case "log" -> {
                    double value = scanner.nextDouble();
                    System.out.println("Result: " + calculator.log(value));
                }
                default -> System.out.println("Invalid operation");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}