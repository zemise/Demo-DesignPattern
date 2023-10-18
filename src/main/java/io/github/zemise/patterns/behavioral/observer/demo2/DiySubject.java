package io.github.zemise.patterns.behavioral.observer.demo2;

public interface DiySubject {
    void addObserver(Object object);

    void removeObserver(Object object);

    void notifyObservers(String message);

    void doSomething();

}
