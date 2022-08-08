package com.sparta.ge.factory;

public class AnimalFactory {

    public static Speakable getAnimal(String animal){
        return switch (animal){
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            case "goldfish" -> new Goldfish();
            default -> null;
        };
    }
}
