package com.sparta.ge.dectorator.sides;

import com.sparta.ge.dectorator.Pizza;

//MVC
//Maven archetype
//1. Manage external dependencies
//2. Create a project structure
//3. Provide us some level of automations

//target folder --> contains class files, do not upload them in gitHub

//Maven
//Lifecycle folder
//1. clean
//2. validate
//3. compile
//4. test
//5. package
//6. verify
//7. install
//8. site
//9. deploy
//Plugins folder
//Dependencies folder
public abstract class Sides extends Pizza {
    protected Pizza pizza;

    //Abstract class takes another abstract class as a parameter
    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription(); //Example of abstract method
}
