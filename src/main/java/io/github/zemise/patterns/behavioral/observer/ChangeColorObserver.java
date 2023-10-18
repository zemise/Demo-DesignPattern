package io.github.zemise.patterns.behavioral.observer;

public class ChangeColorObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("观察到点击事件，于是来改变下被点击的东西颜色，改红色吧");
        Button b = (Button) clickable;
        b.color = "红色";
    }
}
