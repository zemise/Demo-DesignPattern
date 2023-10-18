package io.github.zemise.patterns.behavioral.observer.api;

import java.util.Observable;
import java.util.Observer;

public class ChangeColorObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观测到点击事件，现在更改颜色，红色");
    }
}
