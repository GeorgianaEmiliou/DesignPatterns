package com.sparta.ge;

public class SingletonExample {

    private static SingletonExample SINGLETON = new SingletonExample();

    private SingletonExample(){}

    //Static methods reference to static variables
    public static SingletonExample getSINGLETON() {
        if(SINGLETON == null){
            SINGLETON = new SingletonExample(); //non-final version of pattern
        }
        return SINGLETON;
    }
}
