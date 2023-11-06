package org.lessons.java.model;

import org.lessons.java.exception.DivideByZeroException;

public interface Calculator {

    // METHODS
     static float add(float num1, float num2) {
        return num1 + num2;
    }
     static float subtract(float num1, float num2) {
        return num1 - num2;
    }
     static float divide(float num1, float num2){
        if (num2 == 0)
            throw new DivideByZeroException();
        return num1 / num2;
    }
     static float multiply(float num1, float num2){
        return num1 * num2;
    }

}
