package org.example;


public class SingletonBYDoubleCheck {

    private static volatile SingletonBYDoubleCheck instance;

    private SingletonBYDoubleCheck() {
    }

    public static SingletonBYDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonBYDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonBYDoubleCheck();
                }
            }
        }
        return instance;
    }

}