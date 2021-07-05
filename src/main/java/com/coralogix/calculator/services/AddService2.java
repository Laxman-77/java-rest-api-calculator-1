package com.coralogix.calculator.services;

import com.coralogix.calculator.model.Result;
import org.springframework.stereotype.Service;

@Service
public class AddService2 {
    public Result add(int a, int b) {
        int sum = a + b;
        return new Result(sum);
    }

    public Result subtract(int a,int b){
        int res = a - b;
        return new Result(res);
    }
}
