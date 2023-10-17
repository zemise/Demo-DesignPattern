package io.github.zemise.patterns.structural.adapter;

public class FoodAdapter extends ShuiJiao implements Hundun{
    @Override
    public void makeHundun() {
        super.makeShuiJiao();
        System.out.println("馄炖和水饺一样是面包馅的食品");
    }
}
