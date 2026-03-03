package pt.av.edimilsonestevam.calculator;

public final class ScientificCalculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new CalculationException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double value) {
        if (value < 0) {
            throw new CalculationException("Square root of negative number is not allowed.");
        }
        return Math.sqrt(value);
    }

    public double sin(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    public double cos(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    public double log(double value) {
        if (value <= 0) {
            throw new CalculationException("Logarithm of non-positive number is not allowed.");
        }
        return Math.log10(value);
    }
}
