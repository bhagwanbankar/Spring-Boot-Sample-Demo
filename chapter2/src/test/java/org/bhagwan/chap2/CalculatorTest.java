package org.bhagwan.chap2;

import org.bhagwan.chap2.calculator.Calculator;
import org.bhagwan.chap2.calculator.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.Collections;

public class CalculatorTest {
    private Calculator calculator;
    private Operation mockOperations;

    @BeforeEach
    public void setup(){
        mockOperations = Mockito.mock(Operation.class);
        calculator = new Calculator(Collections.singletonList(mockOperations));
    }
    @Test
    public void throwsExceptionsWhenNoSuitableMethodFound(){
        Mockito.when(mockOperations.handle(ArgumentMatchers.anyChar())).thenReturn(false);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate(2,2,'*'));
    }

    @Test
    public void shouldCallApplyMethodWhenSuitableOperationFound(){
        Mockito.when(mockOperations.handle(ArgumentMatchers.anyChar())).thenReturn(true);
        Mockito.when(mockOperations.apply(2,2)).thenReturn(4);
        calculator.calculate(2,2,'*');
        calculator.calculate(2,2,'*');
        Mockito.verify(mockOperations,Mockito.times(2)).apply(2,2);
    }
}
