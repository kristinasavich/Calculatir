package ru.ks.springcalculator;


public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int a = Integer.parseInt(args[0]);
            String symbol = args[1];
            int b = Integer.parseInt(args[2]);
            switch (symbol) {
                case "+":
                    System.out.println(calculator.sum(a, b));
                    break;
                case "-":
                    System.out.println(calculator.subtract(a, b));
                    break;
                case "*":
                    System.out.println(calculator.multiply(a, b));
                    break;
                case "/":
                    System.out.println(calculator.divide(a, b));
                    break;
                default:
                    System.out.println("0");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

