package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddService2Test {

    @Test
    public void add() {
        AddService2 service = new AddService2();
        Result result = service.add(7, 3);

        assertEquals(9,result.getResult());
    }

    @Test
    public void subtract() {
        AddService2 service = new AddService2();
        Result result = service.subtract(7, 3);

        assertEquals(5,result.getResult());
    }
}