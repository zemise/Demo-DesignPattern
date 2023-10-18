package io.github.zemise.patterns.behavioral.observer.api;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class DiyButton extends Observable {
    List<Observer> observers = new ArrayList<>();

    public void clicked() {
        System.out.println("点击了按钮");
        for (Observer observer : observers) {
            observer.update(this, null);
        }
    }

    @Override
    public synchronized void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        observers.remove(o);
    }
}
