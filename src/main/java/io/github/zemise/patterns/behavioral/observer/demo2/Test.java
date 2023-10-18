package io.github.zemise.patterns.behavioral.observer.demo2;

public class Test {
    public static void main(String[] args) {
        DiySubject subject = new MySubject();

        MyObserver observer = new MyObserver();


        subject.addObserver(observer);
        subject.doSomething();
    }
}
