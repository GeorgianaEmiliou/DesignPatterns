package com.sparta.ge.dectorator.sides;

import com.sparta.ge.dectorator.Pizza;

public class Chips extends Sides{

    public Chips(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " and chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }
}
