package com.spring.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
 public class ExpressTea implements HotDrink{

    public void prepareHotDrink() {
        System.out.println("Prepairing Express Tea");
    }
}
