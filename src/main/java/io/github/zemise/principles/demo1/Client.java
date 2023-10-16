package io.github.zemise.principles.demo1;

public class Client {
    public static void main(String[] args) {
        // 1. 创建搜狗输入法对象
        SouGouInput souGouInput = new SouGouInput();

        // 2. 创建皮肤对象
        DefaultSkin skin = new DefaultSkin();
        ZemieSkin zemieSkin = new ZemieSkin();

        // 3. 将皮肤对象设置到输入法中
//        souGouInput.setSkin(skin);
        souGouInput.setSkin(zemieSkin);

        // 4. 显示皮肤
        souGouInput.display();
    }
}
