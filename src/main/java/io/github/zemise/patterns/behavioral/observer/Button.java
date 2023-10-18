package io.github.zemise.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Button implements Clickable{
    // 存储注册过的单击事件观察者
    List<ClickableObserver> observers = new ArrayList<>();

    // 按钮信息
    String color; // 颜色

    int x, y; // 坐标

    @Override
    public void click() {
        System.out.println("按钮被单击");

        // 执行所有观察者的事件处理方法
        for (ClickableObserver observer : observers) {
            observer.clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeClickableObserver(ClickableObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
