package io.github.zemise.principles.demo1;

public class SouGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
