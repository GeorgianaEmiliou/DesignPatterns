package com.sparta.ge.dectorator;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago Pizza";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
