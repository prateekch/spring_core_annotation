package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//@Component
//@Controller
@Repository
public class Restaurant {

    @Autowired
    HotDrink hotDrink;

    public Restaurant(){

    }

    @Autowired
    public Restaurant(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }


    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    @Autowired
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
