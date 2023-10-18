package io.github.zemise.patterns.behavioral.strategy;

public class PercentageDiscountStrategy extends DiscountStrategy {
    public PercentageDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber() * getPrice() * 0.15;
    }
}
