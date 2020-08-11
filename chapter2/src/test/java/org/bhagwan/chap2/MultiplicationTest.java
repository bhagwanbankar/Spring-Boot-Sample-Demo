package org.bhagwan.chap2;

import org.assertj.core.api.Assertions;
import org.bhagwan.chap2.calculator.Multiplication;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    private final Multiplication multiplication = new Multiplication();

    @Test
    public void shouldMatchOperations(){
        Assertions.assertThat(multiplication.handle('+')).isFalse();
        Assertions.assertThat(multiplication.handle('*')).isTrue();
    }

    @Test
    public void shouldCorrectlyApplyFormula(){
        Assertions.assertThat(multiplication.apply(2,2)).isEqualTo(4);
        Assertions.assertThat(multiplication.apply(5,3)).isEqualTo(15);
    }
}
