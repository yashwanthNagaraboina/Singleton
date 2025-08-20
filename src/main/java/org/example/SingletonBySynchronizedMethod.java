package org.example;

public class SingletonBySynchronizedMethod {

    private static SingletonBySynchronizedMethod instance;

    private SingletonBySynchronizedMethod(){}

    public static synchronized SingletonBySynchronizedMethod getInstance(){
        if(instance==null){
            instance=new SingletonBySynchronizedMethod();
        }
        return instance;
    }

}
