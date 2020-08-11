package org.bhagwan.chap2.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class Calculator {

    Logger logger = LoggerFactory.getLogger(Calculator.class);
    public final Collection<Operation> operations;

    public Calculator(Collection<Operation> operations) {
        this.operations = operations;
    }
    public void calculate(int lhs, int rhs, char op){

        for(Operation operation: operations){
            if(operation.handle(op)){
                int result = operation.apply(lhs, rhs);
                System.out.println(lhs +" "+ op +" "+ rhs +" "+ result);
                logger.info("%d %s %d = %d", lhs, op, rhs, result);
                return;
            }
        }
        throw new IllegalArgumentException("Unknown Operations "+op);
    }
}
