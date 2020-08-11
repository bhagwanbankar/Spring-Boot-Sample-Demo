package org.bhagwan.chap2.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
public class CalculatorApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(CalculatorApplication.class);
        Calculator calculator = appContext.getBean("calc",Calculator.class);
        calculator.calculate(137,21, '+');
        calculator.calculate(50, 5, '*');
    }

    @Bean("calc")
    public Calculator calculator(Collection<Operation> operations){
        return new Calculator(operations);
    }
}
