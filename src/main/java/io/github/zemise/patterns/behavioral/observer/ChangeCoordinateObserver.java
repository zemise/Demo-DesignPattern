package io.github.zemise.patterns.behavioral.observer;

public class ChangeCoordinateObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("观察到点击事件，来改变一下坐标");
        Button b = (Button) clickable;

        b.x = 100;
        b.y = 90;
    }
}
