package io.github.zemise.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class IteratorDemo {
        public static void main(String args[]) {
            // 定义一个向量集合
            Vector vector = new Vector();
            vector.add("向量1");
            vector.add("向量2");
            vector.add("向量3");
            vector.add("向量4");
            // 定义一个序列
            ArrayList list = new ArrayList();
            list.add("序列1");
            list.add("序列2");
            list.add("序列3");
            // 定义栈
            Stack stack = new Stack();
            stack.push("A");
            stack.push("B");
            stack.push("C");
            stack.push("D");
            stack.push("E");
            // 遍历各集合
            java.util.Iterator iterator = vector.iterator();
            System.out.println("遍历向量中的元素：");
            show(iterator);
            System.out.println("\n\n遍历序列中的元素：");
            show(list.iterator());
            System.out.println("\n\n遍历栈中的元素：");
            show(stack.iterator());
        }
        private static void show(java.util.Iterator iterator) {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
    }