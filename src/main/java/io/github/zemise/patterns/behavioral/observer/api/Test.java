package io.github.zemise.patterns.behavioral.observer.api;

public class Test {
    public static void main(String[] args) {
        DiyButton button = new DiyButton();
        button.addObserver(new ChangeColorObserver());

        button.clicked();
    }
}
