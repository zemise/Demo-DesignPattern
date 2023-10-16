package io.github.zemise.patterns.decorator;

public class Benz implements Car{
    @Override
    public void show() {
        System.out.println("奔驰车的默认颜色是黑色");
    }
}
