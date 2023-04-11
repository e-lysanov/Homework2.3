package ru.lysanov.calculator1;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

//    добавить работу с аннотациями (проверять не пустые ли значения)
    public String hello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String summ(int num1, int num2) {
        int summResult = num1 + num2;
        return num1 + " + " + num2 + " = " + summResult;
    }

    public String subtraction(int num1, int num2) {
        int subtractionResult = num1 - num2;
        return num1 + " - " + num2 + " = " + subtractionResult;
    }

    public String multiplication(int num1, int num2) {
        int multiplicationResult = num1 * num2;
        return num1 + " * " + num2 + " = " + multiplicationResult;
    }

    public String divide(int num1, int num2) {
        int divideResult = num1 / num2;
        if (num2 == 0) {
//            разобраться схуяли не работает
            return "<b>На ноль делить нельзя!</b>";
        } else {
            return num1 + " / " + num2 + " = " + divideResult;
        }
    }
}
