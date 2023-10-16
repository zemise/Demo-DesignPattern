package io.github.zemise.principles.demo2.before;

public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle rectangle = new Rectangle();
        // 设置长和框
        rectangle.setLength(20);
        rectangle.setWidth(10);

        // 调用resize方法进行扩宽
        resize(rectangle);
        printLengthAndwidth(rectangle);

        System.out.println("============");
        // 创建正方形对象
        Square square = new Square();
        // 设置长和框
        square.setLength(10);

        // 调用resize方法进行扩宽
        resize(square);
        printLengthAndwidth(square);

    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽的操作
        while ((rectangle.getWidth() <= rectangle.getLength())) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    // 打印长和宽
    public static  void printLengthAndwidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
