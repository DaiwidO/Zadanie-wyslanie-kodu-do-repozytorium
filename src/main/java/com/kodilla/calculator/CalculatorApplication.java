package com.kodilla.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class CalculatorApplication {


    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {

        CalculatorApplication calculator = new CalculatorApplication();

        int suma = calculator.add(10, 20);
        int roznica = calculator.sub(10, 20);
        System.out.println("Dodawanie 10 + 20 = " + suma);
        System.out.println("Odejmowanie 10 - 20 = " + roznica);
    }
}
