package io.github.zemise.patterns.structural.adapter;

public class ClientDemo {
    public static void main(String[] args) {
        Hundun hundun = new FoodAdapter();
        hundun.makeHundun();
    }
}
