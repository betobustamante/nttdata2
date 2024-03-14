package com.nttdata.pt2.service;

import lombok.Data;

@Data
public class Service {

    public static long calcularFactorial(Integer n) {

        if(n == null || n < 0 || n > 49) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
