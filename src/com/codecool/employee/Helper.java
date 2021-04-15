package com.codecool.employee;

import com.codecool.Time;

import java.util.Timer;

public class Helper extends Employee{

    public Helper(String name) {
        super(name);
    }

    public String offerCocktail(){
        return  "Would you like a new drink?";
    }

    public String offerCake(){
        return "Would you like some cake";
    }

    public String offerSnacks(){
        return "From there you can grab snacks";
    }

}
