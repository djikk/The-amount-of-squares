package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void TheAmountOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calculate(100,324);
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }
}
