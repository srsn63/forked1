public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return (double) a / b;
    }
}

public boolean isEven(int n) {
    return n % 2 == 0;

public int power(int base, int exp) {
    return (int) Math.pow(base, exp);

}