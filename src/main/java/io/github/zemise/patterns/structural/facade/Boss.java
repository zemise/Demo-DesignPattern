package io.github.zemise.patterns.structural.facade;

public class Boss {
    public static void main(String[] args) {
        Secretary s = new Secretary();
        System.out.println("老板告诉秘书要到上海出差10天");
        s.trip("上海", 10);

        System.out.println("=============");
        System.out.println("老板告诉秘书要请8个人吃饭");
        s.repast(8);
    }
}
