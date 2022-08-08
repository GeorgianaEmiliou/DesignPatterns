package com.sparta.ge.dectorator;

import com.sparta.ge.dectorator.Italian;
import com.sparta.ge.dectorator.sides.Chips;
import com.sparta.ge.dectorator.sides.Salad;

public class Main {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());

        Chips chips = new Chips(italian);
        System.out.println(chips.getDescription() + " Cost: " + chips.getCost());


    }

}
