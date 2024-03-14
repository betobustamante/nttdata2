package com.nttdata.pt2.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @InjectMocks
    Service service;

    @Test
    void calcularFactorial() {
        // Prueba para un número null
        try {
            service.calcularFactorial(null);
        } catch (IllegalArgumentException e) {
            assertEquals("No se puede calcular el factorial de un null.", e.getMessage());
        }

        // Prueba para un número negativo (se espera una excepción)
        try {
            service.calcularFactorial(-5);
        } catch (IllegalArgumentException e) {
            assertEquals("No se puede calcular el factorial de un número negativo.", e.getMessage());
        }

        // Prueba para un número positivo
        assertEquals(120, service.calcularFactorial(5));

        // Prueba para el factorial de 0
        assertEquals(1, service.calcularFactorial(0));
    }
}