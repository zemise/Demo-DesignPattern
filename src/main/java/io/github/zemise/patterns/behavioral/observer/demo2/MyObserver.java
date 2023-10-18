package io.github.zemise.patterns.behavioral.observer.demo2;

public class MyObserver {
    @ObserverMethod
    public void update(String message){
        System.out.println("Receive update: " + message);
    }

    @ObserverMethod
    public void test01(String message){
        System.out.println("test01观察到事件发生");
    }
}
