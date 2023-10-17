package io.github.zemise.patterns.behavioral.command;

import javax.swing.*;
import java.awt.*;

public class RedCommand extends JButton implements Command {
    private JPanel p;

    public RedCommand(String name, JPanel p) {
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        // 改变面板的背景颜色
        p.setBackground(Color.red);
    }
}
