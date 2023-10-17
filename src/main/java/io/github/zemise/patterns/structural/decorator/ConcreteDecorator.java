package io.github.zemise.patterns.structural.decorator;

public class ConcreteDecorator extends CarDecorator {
    public ConcreteDecorator(Car car) {
        super(car);
    }

    // 给车进行彩绘
    private void print() {
        System.out.println("在车尾绘制“新手”字样，颜色是紫色霞光");
    }

    // 给车安装GPS设备
    private void setGPS() {
        System.out.println("安装GPS定位导航系统");
    }

    @Override
    public void show() {
        super.show();
        print();
        setGPS();
    }
}
