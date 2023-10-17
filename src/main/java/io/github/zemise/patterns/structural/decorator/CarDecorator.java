package io.github.zemise.patterns.structural.decorator;

public abstract class CarDecorator implements Car{
    private Car car = null;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        car.show();
    }
}
