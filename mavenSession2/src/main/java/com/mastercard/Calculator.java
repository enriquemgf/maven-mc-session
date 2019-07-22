package com.mastercard;

import lombok.Data;

@Data
public class Calculator {

    private Integer result;

    public void sum(Integer a, Integer b){
        result = a + b;
    }

    public void sub(Integer a, Integer b){
        if (b > a) {
            throw new NullPointerException();
        } else {
            result = a - b;
        }
    }
}
