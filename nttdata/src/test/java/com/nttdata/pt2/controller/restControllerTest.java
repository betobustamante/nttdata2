package com.nttdata.pt2.controller;

import com.nttdata.pt2.service.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class restControllerTest {

    @InjectMocks
    private Service service;

    private Integer number;

    @DisplayName("Dado un número calculamos su factorial")


    @BeforeEach
    void setUp(){
        number = 4;
    }

    @Test
    void getGreeting() {
    }

    @Test
    void getFactorial() {

    }
}