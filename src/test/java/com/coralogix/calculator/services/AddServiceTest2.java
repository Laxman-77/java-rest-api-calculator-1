package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddServiceTest2 {

    @Test
    void add() {
        AddService service = new AddService();
        Result result = service.add(7, 3);

        assertEquals(9,result.getResult());
    }

    @Test
    void subtract() {
        AddService service = new AddService();
        Result result = service.subtract(7, 3);

        assertEquals(5,result.getResult());
    }
}