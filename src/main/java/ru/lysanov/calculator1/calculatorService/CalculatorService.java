package ru.lysanov.calculator1.calculatorService;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    public default String hello() {
        return null;
    }

    public default String summ(Integer num1, Integer num2) {
        return null;
    }

    public default String subtraction(Integer num1, Integer num2) {
        return null;
    }

    public default String multiplication(Integer num1, Integer num2) {
        return null;
    }

    public default String divide(Integer num1, Integer num2) {
        return null;
    }

}
