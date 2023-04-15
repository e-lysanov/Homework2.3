package ru.lysanov.calculator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.lysanov.calculator1.calculatorService.CalculatorService;

@RestController
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping (path = "/calculator/plus")
    public String summ(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        }
        return calculatorService.summ(num1, num2);
    }

    @GetMapping (path = "/calculator/minus")
    public String subtraction(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        }
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping (path = "/calculator/multiply")
    public String multiplication(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        }
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping (path = "/calculator/divide")
    public String divide(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "<b>Отсутствуют входные значения!</b>";
        } else if (num2 == 0) {
            return "<b>На ноль делить запрещено!</b>";
        }
        return calculatorService.divide(num1, num2);
    }
}
