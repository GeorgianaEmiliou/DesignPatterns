package com.sparta.ge.factory;

public class Dog implements Speakable{
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    public void jump(){}
}
