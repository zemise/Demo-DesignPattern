package io.github.zemise.patterns.behavioral.observer;

public class OtherObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("观察到点击，于是在此执行其他操作.....");
    }
}
