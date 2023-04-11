package ru.lysanov.calculator1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String summ(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.summ(num1, num2);
    }

    @GetMapping (path = "/calculator/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping (path = "/calculator/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping (path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divide(num1, num2);
    }
}
