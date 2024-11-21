package org.example;

public class FibonacciIteration {
    public static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        int i = 2;
        long number1 = 0;
        long number2 = 1;
        long result = 0;

        while (i<=n){
            result = number1 +number2;
            number1 = number2;
            number2 = result;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        просторова складність О(1).
        часову складність О(n).
         */
        int n = 6;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}