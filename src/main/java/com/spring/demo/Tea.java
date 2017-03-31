package com.spring.demo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Tea implements HotDrink {
    public void prepareHotDrink() {
        System.out.println("TEA");
    }
}
