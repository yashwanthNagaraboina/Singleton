package org.example;

public class SingletonByInnerClass {

    public static class InnerClass {
        private static final SingletonByInnerClass instance = new SingletonByInnerClass();
    }

    private SingletonByInnerClass() {
    }

    public static SingletonByInnerClass getInstance() {
        return InnerClass.instance;
    }
}
