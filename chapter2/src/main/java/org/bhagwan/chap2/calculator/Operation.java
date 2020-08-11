package org.bhagwan.chap2.calculator;

public interface Operation {
    int apply(int lhs, int rhs);
    boolean handle(char op);

}
