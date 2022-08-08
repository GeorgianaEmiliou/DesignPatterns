package com.sparta.ge.dectorator.sides;

import com.sparta.ge.dectorator.Pizza;

public class Salad extends Sides{
    public Salad(Pizza pizza){
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " and salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
